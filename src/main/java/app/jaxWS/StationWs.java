package app.jaxWS;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import app.jpa.Station;


@WebService
@SOAPBinding(style =Style.DOCUMENT )
public interface StationWs {

	@WebMethod
	public void save(Station station);
	
	@WebMethod
	public List<Station> list();
	
	@WebMethod
	public Station getById(int id_station);
	
	@WebMethod
	public void update(Station station);
	
	@WebMethod
	public void delete(Station station);
	
}
