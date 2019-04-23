package br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
(name = "cidade")
@NamedQuery (name = "Cidade.buscarPelaLatitudeELongitude",
query = "SELECT a FROM Cidade a WHERE latitude = :latitude AND longitude = :longitude")

@NamedQuery (name = "Cidade.buscarCidadePeloNome",
query = "SELECT a FROM Cidade a WHERE nome = :nome")

@NamedQuery (name = "Cidade.buscarCidadesPeloNome",
query = "SELECT a FROM Cidade a WHERE nome LIKE (%:nome%)")

public class Cidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public String nome;
	private double latitude;
	private double longitude;
	
	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
}
