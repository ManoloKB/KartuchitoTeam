package Prueba;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://Prueba/", portName = "ServicioPruebaImpPort", serviceName = "ServicioPruebaImpService")
public class ServicioPruebaImp {

	public String sayHi(@WebParam(name = "arg0") String text){
		return "Hi " + text;
	}
}
