
package com.upem.bankservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankDAOImpl", targetNamespace = "http://dao.bank.upem.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankDAOImpl {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.upem.bankservices.Account
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccountByIDNumber", targetNamespace = "http://dao.bank.upem.com/", className = "com.upem.bankservices.GetAccountByIDNumber")
    @ResponseWrapper(localName = "getAccountByIDNumberResponse", targetNamespace = "http://dao.bank.upem.com/", className = "com.upem.bankservices.GetAccountByIDNumberResponse")
    @Action(input = "http://dao.bank.upem.com/BankDAOImpl/getAccountByIDNumberRequest", output = "http://dao.bank.upem.com/BankDAOImpl/getAccountByIDNumberResponse")
    public Account getAccountByIDNumber(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "prelevement", targetNamespace = "http://dao.bank.upem.com/", className = "com.upem.bankservices.Prelevement")
    @ResponseWrapper(localName = "prelevementResponse", targetNamespace = "http://dao.bank.upem.com/", className = "com.upem.bankservices.PrelevementResponse")
    @Action(input = "http://dao.bank.upem.com/BankDAOImpl/prelevementRequest", output = "http://dao.bank.upem.com/BankDAOImpl/prelevementResponse")
    public void prelevement(
        @WebParam(name = "arg0", targetNamespace = "")
        Account arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

}
