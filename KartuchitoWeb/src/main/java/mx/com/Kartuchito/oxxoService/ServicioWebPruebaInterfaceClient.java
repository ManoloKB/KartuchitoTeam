
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package mx.com.Kartuchito.oxxoService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-26T12:58:15.158-05:00
 * Generated source version: 3.0.1
 * 
 */
public class ServicioWebPruebaInterfaceClient {

    public static void main(String[] args) throws Exception {
        QName serviceName = new QName("http://oxxoService.Kartuchito.com.mx/", "ServicioWebPruebaService");
        QName portName = new QName("http://oxxoService.Kartuchito.com.mx/", "ServicioWebPruebaPort");

        Service service = Service.create(serviceName);
        service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING,
                        "http://localhost:9090/ServicioWebPruebaPort"); 
        mx.com.Kartuchito.oxxoService.ServicioWebPruebaInterface client = service.getPort(portName,  mx.com.Kartuchito.oxxoService.ServicioWebPruebaInterface.class);
        
        // Insert code to invoke methods on the client here
    }

}