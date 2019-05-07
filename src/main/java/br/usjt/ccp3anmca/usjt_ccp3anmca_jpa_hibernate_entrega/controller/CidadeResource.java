package br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.Service.PrevisaoService;
import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.model.Previsao;

@Controller
public class CidadeResource {

	@Autowired
	PrevisaoService cidadeService;
	
  @Autowired
  private CidadeRepository cidadeRepo;

  
	@GetMapping ("/lista")
  public List <Cidade> todasAsCidades (){
    return cidadeRepo.findAll();
  }
  
  @PostMapping ("/salvar")
  public void salvar ( @RequestBody Cidade cidade) {
    cidadeRepo.save(cidade);
  }
  
  @PostMapping ("/salvar")
  //@ResponseStatus (HttpStatus.CREATED) agora desnecessária
  public ResponseEntity<Livro> salvar ( @RequestBody Livro livro, HttpServletResponse
   response) {
    Livro l = livroRepo.save(livro);
    URI uri = ServletUriComponentsBuilder.fromCurrentServletMapping().path("/{id}").
    buildAndExpand(l.getId()).toUri();
    //desnecessário também
    //response.setHeader("Location", uri.toASCIIString());
    return ResponseEntity.created(uri).body(l);
  }



}
