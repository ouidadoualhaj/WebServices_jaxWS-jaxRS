package app.jaxWS;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import app.jpa.Carburant;

@WebService
@SOAPBinding(style =Style.DOCUMENT )
public interface CarburantWs {

	@WebMethod
	public void save(Carburant carburant);
	
	@WebMethod
	public List<Carburant> list();
	
	@WebMethod
	public Carburant getById(int id_carb);
	
	@WebMethod
	public void update(Carburant carburant);
	
	@WebMethod
	public void delete(Carburant carburant);
}
