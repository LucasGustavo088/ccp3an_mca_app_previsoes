package br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.model.Cidade;



public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	public List <CidadeRepository> findByLatitudeAndLongitude (String latitude, String longitude);
	
	public List <CidadeRepository> queryByNome (String nome);
	 
	public CidadeRepository queryByNomeIgnoreCase (String nome);
	
	
	// MÃ©todos Assincronos
	@Async
	public Future < List <CidadeRepository> > findByLatitudeAndLongitudeAssi (String latitude, String longitude);
	
	@Async
	public Future < List <CidadeRepository> > queryByNomeAssi (String nome);
	
	@Async
	public CidadeRepository queryByNomeIgnoreCaseAss (String nome);
	
	//Query Explicita
	@Query ("SELECT a FROM Cidade a WHERE a.latitude = ?1 and a.latitude = ?2")
	public Cidade  findByLatitudeAndLongitudeExp (String latitude, String longitude);
	
	@Query ("SELECT a FROM Cidade a WHERE LIKE ?1% ")
	public Cidade findByPrimeiraLetra(String nome);
	
	
	@Query ("SELECT a FROM Cidade a WHERE a.nome = ?1")
	public Future < List <CidadeRepository> > queryByNomeExp (String nome);
	
	
	@Query ("SELECT a FROM Cidade a WHERE lower(a.nome) LIKE lower(?1)")
	public CidadeRepository queryByNomeIgnoreCaseExp (String nome);
	
	//Named Query
	public Cidade buscarPorLatitudeEPorLongitude (@Param ("latitude") String latitude,
			 @Param ("longitude") String longitude);
	
	public Cidade buscarPorNome(@Param ("nome") String nome);
	
	public Cidade buscarPorNomeIgnoreCase(@Param ("nome") String nome);
	
	
	
	
	
	
	
	
	 

}
