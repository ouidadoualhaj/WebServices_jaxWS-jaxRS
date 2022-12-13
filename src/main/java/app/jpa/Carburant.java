package app.jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="carburant")
public class Carburant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_carb;
	
	private String nom_carb;
	private String description;
	
	@OneToMany(mappedBy="carburant")
	private Collection<histoCarb> histoCarb;

	public Carburant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carburant(int id_carb, String nom_carb, String description) {
		super();
		this.id_carb = id_carb;
		this.nom_carb = nom_carb;
		this.description = description;
	}

	public int getId_carb() {
		return id_carb;
	}

	public void setId_carb(int id_carb) {
		this.id_carb = id_carb;
	}

	public String getNom_carb() {
		return nom_carb;
	}

	public void setNom_carb(String nom_carb) {
		this.nom_carb = nom_carb;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Carburant [id_carb=" + id_carb + ", nom_carb=" + nom_carb + ", description=" + description + "]";
	}
	
	
}
