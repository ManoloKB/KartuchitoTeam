
package mx.com.Kartuchito.oxxoService.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.1
 * Tue Aug 26 12:58:15 CDT 2014
 * Generated source version: 3.0.1
 */

@XmlRootElement(name = "sayHi", namespace = "http://oxxoService.Kartuchito.com.mx/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHi", namespace = "http://oxxoService.Kartuchito.com.mx/")

public class SayHi {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}

