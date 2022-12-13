package app.jaxWS;

import java.util.Random;

import javax.jws.WebService;

@WebService(endpointInterface = "app.jaxWS.HistoCarbWs")
public class HistoCarbWsImp implements HistoCarbWs{

	float prix;
	Random random = new Random();
	
	@Override
	public void prix_journaliers(String nom_station, String date) {
		
		prix = random.nextFloat();
		
		System.out.println("le prix du carburant à la station : "+ nom_station +"est :"+ prix);
	}

}
