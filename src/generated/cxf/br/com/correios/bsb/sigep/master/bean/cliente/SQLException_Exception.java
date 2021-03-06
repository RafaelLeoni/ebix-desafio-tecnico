
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-05-05T14:50:51.186-03:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "SQLException", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
public class SQLException_Exception extends java.lang.Exception {
    
    private br.com.correios.bsb.sigep.master.bean.cliente.SQLException sqlException;

    public SQLException_Exception() {
        super();
    }
    
    public SQLException_Exception(String message) {
        super(message);
    }
    
    public SQLException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public SQLException_Exception(String message, br.com.correios.bsb.sigep.master.bean.cliente.SQLException sqlException) {
        super(message);
        this.sqlException = sqlException;
    }

    public SQLException_Exception(String message, br.com.correios.bsb.sigep.master.bean.cliente.SQLException sqlException, Throwable cause) {
        super(message, cause);
        this.sqlException = sqlException;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.SQLException getFaultInfo() {
        return this.sqlException;
    }
}
