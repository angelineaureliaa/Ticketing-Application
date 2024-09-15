
package projektiket_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the projektiket_server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BacaDataLogin_QNAME = new QName("http://services.ticketing.com/", "BacaDataLogin");
    private final static QName _BacaDataLoginResponse_QNAME = new QName("http://services.ticketing.com/", "BacaDataLoginResponse");
    private final static QName _BacaDataTempat_QNAME = new QName("http://services.ticketing.com/", "BacaDataTempat");
    private final static QName _BacaDataTempatResponse_QNAME = new QName("http://services.ticketing.com/", "BacaDataTempatResponse");
    private final static QName _BacaReservasi_QNAME = new QName("http://services.ticketing.com/", "BacaReservasi");
    private final static QName _BacaReservasiResponse_QNAME = new QName("http://services.ticketing.com/", "BacaReservasiResponse");
    private final static QName _PesanAcara_QNAME = new QName("http://services.ticketing.com/", "PesanAcara");
    private final static QName _PesanAcaraResponse_QNAME = new QName("http://services.ticketing.com/", "PesanAcaraResponse");
    private final static QName _PesanParkir_QNAME = new QName("http://services.ticketing.com/", "PesanParkir");
    private final static QName _PesanParkirResponse_QNAME = new QName("http://services.ticketing.com/", "PesanParkirResponse");
    private final static QName _BacaDataPending_QNAME = new QName("http://services.ticketing.com/", "bacaDataPending");
    private final static QName _BacaDataPendingResponse_QNAME = new QName("http://services.ticketing.com/", "bacaDataPendingResponse");
    private final static QName _BacaDataTabel_QNAME = new QName("http://services.ticketing.com/", "bacaDataTabel");
    private final static QName _BacaDataTabelResponse_QNAME = new QName("http://services.ticketing.com/", "bacaDataTabelResponse");
    private final static QName _CekUsername_QNAME = new QName("http://services.ticketing.com/", "cekUsername");
    private final static QName _CekUsernameResponse_QNAME = new QName("http://services.ticketing.com/", "cekUsernameResponse");
    private final static QName _ClaimTicketAcara_QNAME = new QName("http://services.ticketing.com/", "claimTicketAcara");
    private final static QName _ClaimTicketAcaraResponse_QNAME = new QName("http://services.ticketing.com/", "claimTicketAcaraResponse");
    private final static QName _Hello_QNAME = new QName("http://services.ticketing.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://services.ticketing.com/", "helloResponse");
    private final static QName _Login_QNAME = new QName("http://services.ticketing.com/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://services.ticketing.com/", "loginResponse");
    private final static QName _Register_QNAME = new QName("http://services.ticketing.com/", "register");
    private final static QName _RegisterResponse_QNAME = new QName("http://services.ticketing.com/", "registerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: projektiket_server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BacaDataLogin }
     * 
     */
    public BacaDataLogin createBacaDataLogin() {
        return new BacaDataLogin();
    }

    /**
     * Create an instance of {@link BacaDataLoginResponse }
     * 
     */
    public BacaDataLoginResponse createBacaDataLoginResponse() {
        return new BacaDataLoginResponse();
    }

    /**
     * Create an instance of {@link BacaDataTempat }
     * 
     */
    public BacaDataTempat createBacaDataTempat() {
        return new BacaDataTempat();
    }

    /**
     * Create an instance of {@link BacaDataTempatResponse }
     * 
     */
    public BacaDataTempatResponse createBacaDataTempatResponse() {
        return new BacaDataTempatResponse();
    }

    /**
     * Create an instance of {@link BacaReservasi }
     * 
     */
    public BacaReservasi createBacaReservasi() {
        return new BacaReservasi();
    }

    /**
     * Create an instance of {@link BacaReservasiResponse }
     * 
     */
    public BacaReservasiResponse createBacaReservasiResponse() {
        return new BacaReservasiResponse();
    }

    /**
     * Create an instance of {@link PesanAcara }
     * 
     */
    public PesanAcara createPesanAcara() {
        return new PesanAcara();
    }

    /**
     * Create an instance of {@link PesanAcaraResponse }
     * 
     */
    public PesanAcaraResponse createPesanAcaraResponse() {
        return new PesanAcaraResponse();
    }

    /**
     * Create an instance of {@link PesanParkir }
     * 
     */
    public PesanParkir createPesanParkir() {
        return new PesanParkir();
    }

    /**
     * Create an instance of {@link PesanParkirResponse }
     * 
     */
    public PesanParkirResponse createPesanParkirResponse() {
        return new PesanParkirResponse();
    }

    /**
     * Create an instance of {@link BacaDataPending }
     * 
     */
    public BacaDataPending createBacaDataPending() {
        return new BacaDataPending();
    }

    /**
     * Create an instance of {@link BacaDataPendingResponse }
     * 
     */
    public BacaDataPendingResponse createBacaDataPendingResponse() {
        return new BacaDataPendingResponse();
    }

    /**
     * Create an instance of {@link BacaDataTabel }
     * 
     */
    public BacaDataTabel createBacaDataTabel() {
        return new BacaDataTabel();
    }

    /**
     * Create an instance of {@link BacaDataTabelResponse }
     * 
     */
    public BacaDataTabelResponse createBacaDataTabelResponse() {
        return new BacaDataTabelResponse();
    }

    /**
     * Create an instance of {@link CekUsername }
     * 
     */
    public CekUsername createCekUsername() {
        return new CekUsername();
    }

    /**
     * Create an instance of {@link CekUsernameResponse }
     * 
     */
    public CekUsernameResponse createCekUsernameResponse() {
        return new CekUsernameResponse();
    }

    /**
     * Create an instance of {@link ClaimTicketAcara }
     * 
     */
    public ClaimTicketAcara createClaimTicketAcara() {
        return new ClaimTicketAcara();
    }

    /**
     * Create an instance of {@link ClaimTicketAcaraResponse }
     * 
     */
    public ClaimTicketAcaraResponse createClaimTicketAcaraResponse() {
        return new ClaimTicketAcaraResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaDataLogin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaDataLogin }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "BacaDataLogin")
    public JAXBElement<BacaDataLogin> createBacaDataLogin(BacaDataLogin value) {
        return new JAXBElement<BacaDataLogin>(_BacaDataLogin_QNAME, BacaDataLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaDataLoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaDataLoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "BacaDataLoginResponse")
    public JAXBElement<BacaDataLoginResponse> createBacaDataLoginResponse(BacaDataLoginResponse value) {
        return new JAXBElement<BacaDataLoginResponse>(_BacaDataLoginResponse_QNAME, BacaDataLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaDataTempat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaDataTempat }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "BacaDataTempat")
    public JAXBElement<BacaDataTempat> createBacaDataTempat(BacaDataTempat value) {
        return new JAXBElement<BacaDataTempat>(_BacaDataTempat_QNAME, BacaDataTempat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaDataTempatResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaDataTempatResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "BacaDataTempatResponse")
    public JAXBElement<BacaDataTempatResponse> createBacaDataTempatResponse(BacaDataTempatResponse value) {
        return new JAXBElement<BacaDataTempatResponse>(_BacaDataTempatResponse_QNAME, BacaDataTempatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaReservasi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaReservasi }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "BacaReservasi")
    public JAXBElement<BacaReservasi> createBacaReservasi(BacaReservasi value) {
        return new JAXBElement<BacaReservasi>(_BacaReservasi_QNAME, BacaReservasi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaReservasiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaReservasiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "BacaReservasiResponse")
    public JAXBElement<BacaReservasiResponse> createBacaReservasiResponse(BacaReservasiResponse value) {
        return new JAXBElement<BacaReservasiResponse>(_BacaReservasiResponse_QNAME, BacaReservasiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesanAcara }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesanAcara }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "PesanAcara")
    public JAXBElement<PesanAcara> createPesanAcara(PesanAcara value) {
        return new JAXBElement<PesanAcara>(_PesanAcara_QNAME, PesanAcara.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesanAcaraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesanAcaraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "PesanAcaraResponse")
    public JAXBElement<PesanAcaraResponse> createPesanAcaraResponse(PesanAcaraResponse value) {
        return new JAXBElement<PesanAcaraResponse>(_PesanAcaraResponse_QNAME, PesanAcaraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesanParkir }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesanParkir }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "PesanParkir")
    public JAXBElement<PesanParkir> createPesanParkir(PesanParkir value) {
        return new JAXBElement<PesanParkir>(_PesanParkir_QNAME, PesanParkir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesanParkirResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesanParkirResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "PesanParkirResponse")
    public JAXBElement<PesanParkirResponse> createPesanParkirResponse(PesanParkirResponse value) {
        return new JAXBElement<PesanParkirResponse>(_PesanParkirResponse_QNAME, PesanParkirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaDataPending }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaDataPending }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "bacaDataPending")
    public JAXBElement<BacaDataPending> createBacaDataPending(BacaDataPending value) {
        return new JAXBElement<BacaDataPending>(_BacaDataPending_QNAME, BacaDataPending.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaDataPendingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaDataPendingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "bacaDataPendingResponse")
    public JAXBElement<BacaDataPendingResponse> createBacaDataPendingResponse(BacaDataPendingResponse value) {
        return new JAXBElement<BacaDataPendingResponse>(_BacaDataPendingResponse_QNAME, BacaDataPendingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaDataTabel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaDataTabel }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "bacaDataTabel")
    public JAXBElement<BacaDataTabel> createBacaDataTabel(BacaDataTabel value) {
        return new JAXBElement<BacaDataTabel>(_BacaDataTabel_QNAME, BacaDataTabel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BacaDataTabelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BacaDataTabelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "bacaDataTabelResponse")
    public JAXBElement<BacaDataTabelResponse> createBacaDataTabelResponse(BacaDataTabelResponse value) {
        return new JAXBElement<BacaDataTabelResponse>(_BacaDataTabelResponse_QNAME, BacaDataTabelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekUsername }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekUsername }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "cekUsername")
    public JAXBElement<CekUsername> createCekUsername(CekUsername value) {
        return new JAXBElement<CekUsername>(_CekUsername_QNAME, CekUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekUsernameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekUsernameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "cekUsernameResponse")
    public JAXBElement<CekUsernameResponse> createCekUsernameResponse(CekUsernameResponse value) {
        return new JAXBElement<CekUsernameResponse>(_CekUsernameResponse_QNAME, CekUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimTicketAcara }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimTicketAcara }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "claimTicketAcara")
    public JAXBElement<ClaimTicketAcara> createClaimTicketAcara(ClaimTicketAcara value) {
        return new JAXBElement<ClaimTicketAcara>(_ClaimTicketAcara_QNAME, ClaimTicketAcara.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimTicketAcaraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimTicketAcaraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "claimTicketAcaraResponse")
    public JAXBElement<ClaimTicketAcaraResponse> createClaimTicketAcaraResponse(ClaimTicketAcaraResponse value) {
        return new JAXBElement<ClaimTicketAcaraResponse>(_ClaimTicketAcaraResponse_QNAME, ClaimTicketAcaraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Register }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticketing.com/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

}
