package app.jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="station")
public class Station {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_station;
	private String nom_station;
	private String ville;
	private String adresse;
	
	@OneToMany(mappedBy="station")
	private Collection<histoCarb> histoCarb;

	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Station(int id_station, String nom_station, String ville, String adresse) {
		super();
		this.id_station = id_station;
		this.nom_station = nom_station;
		this.ville = ville;
		this.adresse = adresse;
	}

	public int getId_station() {
		return id_station;
	}

	public void setId_station(int id_station) {
		this.id_station = id_station;
	}

	public String getNom_station() {
		return nom_station;
	}

	public void setNom_station(String nom_station) {
		this.nom_station = nom_station;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Station [id_station=" + id_station + ", nom_station=" + nom_station + ", ville=" + ville + ", adresse="
				+ adresse + "]";
	}
	
	
	
	
	
	
	
}
