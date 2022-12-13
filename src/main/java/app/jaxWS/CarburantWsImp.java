package app.jaxWS;

import java.util.List;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import app.jpa.Carburant;

@WebService(endpointInterface = "app.jaxWS.CarburantWs")
public class CarburantWsImp implements CarburantWs{

	@PersistenceContext(unitName="ouidad")
	private EntityManager entityManager;
	
	@Override
	public void save(Carburant carburant) {
		System.out.println("Save : " + carburant.toString());		
		entityManager.persist(carburant);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Carburant> list() {
		System.out.println("List des carburants");
		Query qry = entityManager.createQuery("Select c from Carburant c");
		return qry.getResultList();
	}

	@Override
	public Carburant getById(int id_carb) {
		System.out.println("id_carb : " + id_carb);
		Carburant carburant = entityManager.find(Carburant.class, id_carb);
		if(carburant == null)
			throw new RuntimeException("carburant introuvale !");
		return carburant;
	}

	@Override
	public void update(Carburant carburant) {
		System.out.println("Update : " + carburant.toString());
		entityManager.refresh(carburant);	
	}

	@Override
	public void delete(Carburant carburant) {
		System.out.println("Delete : " + carburant.toString());
		entityManager.remove(carburant);
	}

}
