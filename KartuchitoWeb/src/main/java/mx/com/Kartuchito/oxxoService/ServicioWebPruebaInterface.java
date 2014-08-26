package mx.com.Kartuchito.oxxoService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "ServicioWebPruebaInterface", targetNamespace = "http://oxxoService.Kartuchito.com.mx/")
public interface ServicioWebPruebaInterface {

	@WebMethod(operationName = "sayHi", action = "urn:SayHi")
	public String sayHi(@WebParam(name = "text") String text);

}