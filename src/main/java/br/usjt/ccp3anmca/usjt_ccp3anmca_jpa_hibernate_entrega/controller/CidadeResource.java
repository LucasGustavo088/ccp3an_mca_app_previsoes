package br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.resources;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.model.Cidade;
import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.repository.CidadeRepository;


@RestController
@RequestMapping("/cidade")
public class CidadeResource {

	@Autowired
	private CidadeRepository cidadeRepo;


	@GetMapping("/lista")
	public List<Cidade> todasAsCidades(){
		return cidadeRepo.findAll();
	}
	
	@GetMapping("/obtemCidadeEsp/{nome}")
	public Cidade obtemCidadeEsp(@PathVariable String nome){
		return cidadeRepo.findByPrimeiraLetra(nome);
	}
	
	
	@GetMapping("/obtemLatitudeLongitude/{latitude}/{longitude}")
	public Cidade obtemLatitudeLongitude(@PathVariable String latitude, @PathVariable String longitude) {
		return cidadeRepo.findByLatitudeAndLongitudeExp(latitude, longitude);
	}

	@PostMapping ("/salvar")
	public ResponseEntity<Cidade> salvar ( @RequestBody Cidade cidade, HttpServletResponse
			response) {
		Cidade c = cidadeRepo.save(cidade);
		URI uri = ServletUriComponentsBuilder.
				fromCurrentServletMapping().path("/{id}").buildAndExpand(c.getId()).toUri();
		return ResponseEntity.created(uri).body(c);
	}


}
