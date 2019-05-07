package br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.model.Cidade;
import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeDB;
	
	public List <Previsao> listar(){
		
		return cidadeDB.findAll();
	}
	
	public void salvar(Cidade cidade) {
		
		cidadeDB.save(cidade);
	}
	
}
