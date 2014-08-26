package mx.com.Kartuchito.oxxoService;

import javax.jws.WebService;

@WebService(targetNamespace = "http://oxxoService.Kartuchito.com.mx/", endpointInterface = "mx.com.Kartuchito.oxxoService.ServicioWebPruebaInterface", portName = "ServicioWebPruebaPort", serviceName = "ServicioWebPruebaService")
public class ServicioWebPrueba implements ServicioWebPruebaInterface {

	public String sayHi(String text){
		return "Hi "+ text;
	}
}
