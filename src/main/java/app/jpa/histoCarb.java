package app.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="histocab")
public class histoCarb {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_hc;
	
	private String date;
	private float prix;
	
	@ManyToOne
	@JoinColumn(name="id_station")
	private Station station;
	
	@ManyToOne
	@JoinColumn(name="id_carb")
	private Carburant carburant;

	public histoCarb() {
		super();
		// TODO Auto-generated constructor stub
	}

	public histoCarb(int id_hc, String date, float prix, Station station, Carburant carburant) {
		super();
		this.id_hc = id_hc;
		this.date = date;
		this.prix = prix;
		this.station = station;
		this.carburant = carburant;
	}

	public int getId_hc() {
		return id_hc;
	}

	public void setId_hc(int id_hc) {
		this.id_hc = id_hc;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Carburant getCarburant() {
		return carburant;
	}

	public void setCarburant(Carburant carburant) {
		this.carburant = carburant;
	}

	@Override
	public String toString() {
		return "histoCarb [id_hc=" + id_hc + ", date=" + date + ", prix=" + prix + ", station=" + station
				+ ", carburant=" + carburant + "]";
	}
	
	
}
