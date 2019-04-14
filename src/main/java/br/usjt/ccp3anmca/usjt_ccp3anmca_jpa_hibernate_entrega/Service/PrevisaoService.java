package br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.model.Previsao;
import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.repository.PrevisaoRepository;

@Service
public class PrevisaoService {
	
	@Autowired
	private PrevisaoRepository previsaoDB;
	
	public List <Previsao> listar(){
		
		return previsaoDB.findAll();
	}
	
	public void salvar(Previsao previsao) {
		
		previsaoDB.save(previsao);
	}
	
}
