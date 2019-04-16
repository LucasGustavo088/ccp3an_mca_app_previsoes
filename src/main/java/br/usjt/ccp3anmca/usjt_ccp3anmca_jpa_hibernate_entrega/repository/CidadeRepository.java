package br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.model.Cidade;
import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.model.Previsao;

public interface CidadeRepository extends JpaRepository<Previsao, Long>{
	public Cidade findByLatitudeAndLongitude(double latitude, double longitude);
	public Cidade findByNome(String nome);
	public List <Cidade> findByNomeInIgnoreCase(String nome);
}
