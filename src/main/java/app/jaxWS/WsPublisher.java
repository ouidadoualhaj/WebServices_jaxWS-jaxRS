package app.jaxWS;

import javax.xml.ws.Endpoint;


public class WsPublisher {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8080/ws/station",new StationWsImp() );
		//Endpoint.publish("http://localhost:7779/ws/carburant",new CarburantWsImp() );
		//Endpoint.publish("http://localhost:7779/ws/histocarb",new HistoCarbWsImp() );

	}

}
