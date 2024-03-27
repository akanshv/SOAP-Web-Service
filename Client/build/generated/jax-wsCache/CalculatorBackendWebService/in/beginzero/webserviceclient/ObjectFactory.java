
package in.beginzero.webserviceclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.beginzero.webserviceclient package. 
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

    private final static QName _AddIntegers_QNAME = new QName("http://javawebservice.beginzero.in/", "AddIntegers");
    private final static QName _AddIntegersResponse_QNAME = new QName("http://javawebservice.beginzero.in/", "AddIntegersResponse");
    private final static QName _DivIntegers_QNAME = new QName("http://javawebservice.beginzero.in/", "DivIntegers");
    private final static QName _DivIntegersResponse_QNAME = new QName("http://javawebservice.beginzero.in/", "DivIntegersResponse");
    private final static QName _MulIntegers_QNAME = new QName("http://javawebservice.beginzero.in/", "MulIntegers");
    private final static QName _MulIntegersResponse_QNAME = new QName("http://javawebservice.beginzero.in/", "MulIntegersResponse");
    private final static QName _SubIntegers_QNAME = new QName("http://javawebservice.beginzero.in/", "SubIntegers");
    private final static QName _SubIntegersResponse_QNAME = new QName("http://javawebservice.beginzero.in/", "SubIntegersResponse");
    private final static QName _Hello_QNAME = new QName("http://javawebservice.beginzero.in/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://javawebservice.beginzero.in/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.beginzero.webserviceclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddIntegers }
     * 
     */
    public AddIntegers createAddIntegers() {
        return new AddIntegers();
    }

    /**
     * Create an instance of {@link AddIntegersResponse }
     * 
     */
    public AddIntegersResponse createAddIntegersResponse() {
        return new AddIntegersResponse();
    }

    /**
     * Create an instance of {@link DivIntegers }
     * 
     */
    public DivIntegers createDivIntegers() {
        return new DivIntegers();
    }

    /**
     * Create an instance of {@link DivIntegersResponse }
     * 
     */
    public DivIntegersResponse createDivIntegersResponse() {
        return new DivIntegersResponse();
    }

    /**
     * Create an instance of {@link MulIntegers }
     * 
     */
    public MulIntegers createMulIntegers() {
        return new MulIntegers();
    }

    /**
     * Create an instance of {@link MulIntegersResponse }
     * 
     */
    public MulIntegersResponse createMulIntegersResponse() {
        return new MulIntegersResponse();
    }

    /**
     * Create an instance of {@link SubIntegers }
     * 
     */
    public SubIntegers createSubIntegers() {
        return new SubIntegers();
    }

    /**
     * Create an instance of {@link SubIntegersResponse }
     * 
     */
    public SubIntegersResponse createSubIntegersResponse() {
        return new SubIntegersResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddIntegers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddIntegers }{@code >}
     */
    @XmlElementDecl(namespace = "http://javawebservice.beginzero.in/", name = "AddIntegers")
    public JAXBElement<AddIntegers> createAddIntegers(AddIntegers value) {
        return new JAXBElement<AddIntegers>(_AddIntegers_QNAME, AddIntegers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddIntegersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddIntegersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://javawebservice.beginzero.in/", name = "AddIntegersResponse")
    public JAXBElement<AddIntegersResponse> createAddIntegersResponse(AddIntegersResponse value) {
        return new JAXBElement<AddIntegersResponse>(_AddIntegersResponse_QNAME, AddIntegersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivIntegers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivIntegers }{@code >}
     */
    @XmlElementDecl(namespace = "http://javawebservice.beginzero.in/", name = "DivIntegers")
    public JAXBElement<DivIntegers> createDivIntegers(DivIntegers value) {
        return new JAXBElement<DivIntegers>(_DivIntegers_QNAME, DivIntegers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivIntegersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivIntegersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://javawebservice.beginzero.in/", name = "DivIntegersResponse")
    public JAXBElement<DivIntegersResponse> createDivIntegersResponse(DivIntegersResponse value) {
        return new JAXBElement<DivIntegersResponse>(_DivIntegersResponse_QNAME, DivIntegersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MulIntegers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MulIntegers }{@code >}
     */
    @XmlElementDecl(namespace = "http://javawebservice.beginzero.in/", name = "MulIntegers")
    public JAXBElement<MulIntegers> createMulIntegers(MulIntegers value) {
        return new JAXBElement<MulIntegers>(_MulIntegers_QNAME, MulIntegers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MulIntegersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MulIntegersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://javawebservice.beginzero.in/", name = "MulIntegersResponse")
    public JAXBElement<MulIntegersResponse> createMulIntegersResponse(MulIntegersResponse value) {
        return new JAXBElement<MulIntegersResponse>(_MulIntegersResponse_QNAME, MulIntegersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIntegers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubIntegers }{@code >}
     */
    @XmlElementDecl(namespace = "http://javawebservice.beginzero.in/", name = "SubIntegers")
    public JAXBElement<SubIntegers> createSubIntegers(SubIntegers value) {
        return new JAXBElement<SubIntegers>(_SubIntegers_QNAME, SubIntegers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIntegersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubIntegersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://javawebservice.beginzero.in/", name = "SubIntegersResponse")
    public JAXBElement<SubIntegersResponse> createSubIntegersResponse(SubIntegersResponse value) {
        return new JAXBElement<SubIntegersResponse>(_SubIntegersResponse_QNAME, SubIntegersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://javawebservice.beginzero.in/", name = "hello")
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
    @XmlElementDecl(namespace = "http://javawebservice.beginzero.in/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
