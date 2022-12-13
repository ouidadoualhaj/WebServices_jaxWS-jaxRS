package app.jaxWS;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style =Style.DOCUMENT )
public interface HistoCarbWs {

	@WebMethod
	public void prix_journaliers(String nom_station, String date);
	
}
