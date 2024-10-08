
package projektiket_server;

import java.util.List;
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
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TicketWebService", targetNamespace = "http://services.ticketing.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TicketWebService {


    /**
     * 
     * @param password
     * @param nama
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.RegisterResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/registerRequest", output = "http://services.ticketing.com/TicketWebService/registerResponse")
    public String register(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "nama", targetNamespace = "")
        String nama);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.LoginResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/loginRequest", output = "http://services.ticketing.com/TicketWebService/loginResponse")
    public String login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.HelloResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/helloRequest", output = "http://services.ticketing.com/TicketWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param hello
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod(operationName = "BacaDataTempat")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "BacaDataTempat", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.BacaDataTempat")
    @ResponseWrapper(localName = "BacaDataTempatResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.BacaDataTempatResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/BacaDataTempatRequest", output = "http://services.ticketing.com/TicketWebService/BacaDataTempatResponse")
    public List<Object> bacaDataTempat(
        @WebParam(name = "hello", targetNamespace = "")
        String hello);

    /**
     * 
     * @param tempat
     * @param lantai
     * @param tanggal
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "BacaReservasi")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "BacaReservasi", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.BacaReservasi")
    @ResponseWrapper(localName = "BacaReservasiResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.BacaReservasiResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/BacaReservasiRequest", output = "http://services.ticketing.com/TicketWebService/BacaReservasiResponse")
    public List<String> bacaReservasi(
        @WebParam(name = "tempat", targetNamespace = "")
        String tempat,
        @WebParam(name = "lantai", targetNamespace = "")
        String lantai,
        @WebParam(name = "tanggal", targetNamespace = "")
        String tanggal);

    /**
     * 
     * @param username
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bacaDataTabel", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.BacaDataTabel")
    @ResponseWrapper(localName = "bacaDataTabelResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.BacaDataTabelResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/bacaDataTabelRequest", output = "http://services.ticketing.com/TicketWebService/bacaDataTabelResponse")
    public List<Object> bacaDataTabel(
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "BacaDataLogin")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "BacaDataLogin", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.BacaDataLogin")
    @ResponseWrapper(localName = "BacaDataLoginResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.BacaDataLoginResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/BacaDataLoginRequest", output = "http://services.ticketing.com/TicketWebService/BacaDataLoginResponse")
    public List<String> bacaDataLogin(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param idAcara
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PesanAcara")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "PesanAcara", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.PesanAcara")
    @ResponseWrapper(localName = "PesanAcaraResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.PesanAcaraResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/PesanAcaraRequest", output = "http://services.ticketing.com/TicketWebService/PesanAcaraResponse")
    public String pesanAcara(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "idAcara", targetNamespace = "")
        String idAcara);

    /**
     * 
     * @param username
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bacaDataPending", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.BacaDataPending")
    @ResponseWrapper(localName = "bacaDataPendingResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.BacaDataPendingResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/bacaDataPendingRequest", output = "http://services.ticketing.com/TicketWebService/bacaDataPendingResponse")
    public List<Object> bacaDataPending(
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param tanggalPembelian
     * @param tanggalParkir
     * @param lantai
     * @param nomorParkir
     * @param tempatt
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PesanParkir")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "PesanParkir", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.PesanParkir")
    @ResponseWrapper(localName = "PesanParkirResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.PesanParkirResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/PesanParkirRequest", output = "http://services.ticketing.com/TicketWebService/PesanParkirResponse")
    public String pesanParkir(
        @WebParam(name = "nomor_parkir", targetNamespace = "")
        String nomorParkir,
        @WebParam(name = "tanggal_pembelian", targetNamespace = "")
        String tanggalPembelian,
        @WebParam(name = "tanggal_parkir", targetNamespace = "")
        String tanggalParkir,
        @WebParam(name = "lantai", targetNamespace = "")
        String lantai,
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "tempatt", targetNamespace = "")
        String tempatt);

    /**
     * 
     * @param idAcara
     * @param idRacr
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "claimTicketAcara", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.ClaimTicketAcara")
    @ResponseWrapper(localName = "claimTicketAcaraResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.ClaimTicketAcaraResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/claimTicketAcaraRequest", output = "http://services.ticketing.com/TicketWebService/claimTicketAcaraResponse")
    public String claimTicketAcara(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "idRacr", targetNamespace = "")
        String idRacr,
        @WebParam(name = "idAcara", targetNamespace = "")
        String idAcara);

    /**
     * 
     * @param password
     * @param nama
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cekUsername", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.CekUsername")
    @ResponseWrapper(localName = "cekUsernameResponse", targetNamespace = "http://services.ticketing.com/", className = "projektiket_server.CekUsernameResponse")
    @Action(input = "http://services.ticketing.com/TicketWebService/cekUsernameRequest", output = "http://services.ticketing.com/TicketWebService/cekUsernameResponse")
    public String cekUsername(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "nama", targetNamespace = "")
        String nama);

}
