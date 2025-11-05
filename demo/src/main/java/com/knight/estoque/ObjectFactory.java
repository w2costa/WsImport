
package com.knight.estoque;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.knight.estoque package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ListarLivros_QNAME = new QName("http://servicos.estoque.knight.com/", "listarLivros");
    private static final QName _ListarLivrosPaginacao_QNAME = new QName("http://servicos.estoque.knight.com/", "listarLivrosPaginacao");
    private static final QName _ListarLivrosPaginacaoResponse_QNAME = new QName("http://servicos.estoque.knight.com/", "listarLivrosPaginacaoResponse");
    private static final QName _ListarLivrosResponse_QNAME = new QName("http://servicos.estoque.knight.com/", "listarLivrosResponse");
    private static final QName _Livro_QNAME = new QName("http://servicos.estoque.knight.com/", "livro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.knight.estoque
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Livro }
     * 
     * @return
     *     the new instance of {@link Livro }
     */
    public Livro createLivro() {
        return new Livro();
    }

    /**
     * Create an instance of {@link ListarLivros }
     * 
     * @return
     *     the new instance of {@link ListarLivros }
     */
    public ListarLivros createListarLivros() {
        return new ListarLivros();
    }

    /**
     * Create an instance of {@link ListarLivrosPaginacao }
     * 
     * @return
     *     the new instance of {@link ListarLivrosPaginacao }
     */
    public ListarLivrosPaginacao createListarLivrosPaginacao() {
        return new ListarLivrosPaginacao();
    }

    /**
     * Create an instance of {@link ListarLivrosPaginacaoResponse }
     * 
     * @return
     *     the new instance of {@link ListarLivrosPaginacaoResponse }
     */
    public ListarLivrosPaginacaoResponse createListarLivrosPaginacaoResponse() {
        return new ListarLivrosPaginacaoResponse();
    }

    /**
     * Create an instance of {@link ListarLivrosResponse }
     * 
     * @return
     *     the new instance of {@link ListarLivrosResponse }
     */
    public ListarLivrosResponse createListarLivrosResponse() {
        return new ListarLivrosResponse();
    }

    /**
     * Create an instance of {@link Livro.Autores }
     * 
     * @return
     *     the new instance of {@link Livro.Autores }
     */
    public Livro.Autores createLivroAutores() {
        return new Livro.Autores();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLivros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarLivros }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicos.estoque.knight.com/", name = "listarLivros")
    public JAXBElement<ListarLivros> createListarLivros(ListarLivros value) {
        return new JAXBElement<>(_ListarLivros_QNAME, ListarLivros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLivrosPaginacao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarLivrosPaginacao }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicos.estoque.knight.com/", name = "listarLivrosPaginacao")
    public JAXBElement<ListarLivrosPaginacao> createListarLivrosPaginacao(ListarLivrosPaginacao value) {
        return new JAXBElement<>(_ListarLivrosPaginacao_QNAME, ListarLivrosPaginacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLivrosPaginacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarLivrosPaginacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicos.estoque.knight.com/", name = "listarLivrosPaginacaoResponse")
    public JAXBElement<ListarLivrosPaginacaoResponse> createListarLivrosPaginacaoResponse(ListarLivrosPaginacaoResponse value) {
        return new JAXBElement<>(_ListarLivrosPaginacaoResponse_QNAME, ListarLivrosPaginacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLivrosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarLivrosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicos.estoque.knight.com/", name = "listarLivrosResponse")
    public JAXBElement<ListarLivrosResponse> createListarLivrosResponse(ListarLivrosResponse value) {
        return new JAXBElement<>(_ListarLivrosResponse_QNAME, ListarLivrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Livro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Livro }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicos.estoque.knight.com/", name = "livro")
    public JAXBElement<Livro> createLivro(Livro value) {
        return new JAXBElement<>(_Livro_QNAME, Livro.class, null, value);
    }

}
