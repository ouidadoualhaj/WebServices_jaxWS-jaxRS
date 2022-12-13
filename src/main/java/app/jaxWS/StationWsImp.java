package app.jaxWS;

import java.util.List;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import app.jpa.Station;

@WebService(endpointInterface = "app.jaxWS.StationWs")
public class StationWsImp implements StationWs{

	@PersistenceContext(unitName="ouidad")
	private EntityManager entityManager;
	
	@Override
	public void save(Station station) {
		System.out.println("Save : " + station.toString());		
		entityManager.persist(station);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Station> list() {
		System.out.println("List des stations");
		Query qry = entityManager.createQuery("Select s from Station s");
		return qry.getResultList();
	}

	@Override
	public Station getById(int id_station) {
		System.out.println("id_station : " + id_station);
		Station station = entityManager.find(Station.class, id_station);
		if(station == null)
			throw new RuntimeException("station introuvale !");
		return station;
	}

	@Override
	public void update(Station station) {
		System.out.println("Update : " + station.toString());
		entityManager.refresh(station);		
	}

	@Override
	public void delete(Station station) {
		System.out.println("Delete : " + station.toString());
		entityManager.remove(station);	
	}

}
