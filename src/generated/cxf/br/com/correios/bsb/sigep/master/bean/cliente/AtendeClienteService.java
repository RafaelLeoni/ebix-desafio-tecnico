package br.com.correios.bsb.sigep.master.bean.cliente;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-05-05T14:50:51.252-03:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "AtendeClienteService", 
                  wsdlLocation = "classpath:wsdl/AtendeCliente.wsdl",
                  targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/") 
public class AtendeClienteService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");
    public final static QName AtendeClientePort = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClientePort");
    static {
        URL url = AtendeClienteService.class.getClassLoader().getResource("wsdl/AtendeCliente.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(AtendeClienteService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/AtendeCliente.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public AtendeClienteService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AtendeClienteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AtendeClienteService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public AtendeClienteService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AtendeClienteService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AtendeClienteService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AtendeCliente
     */
    @WebEndpoint(name = "AtendeClientePort")
    public AtendeCliente getAtendeClientePort() {
        return super.getPort(AtendeClientePort, AtendeCliente.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AtendeCliente
     */
    @WebEndpoint(name = "AtendeClientePort")
    public AtendeCliente getAtendeClientePort(WebServiceFeature... features) {
        return super.getPort(AtendeClientePort, AtendeCliente.class, features);
    }

}
