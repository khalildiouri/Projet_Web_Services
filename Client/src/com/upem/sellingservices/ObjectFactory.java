
package com.upem.sellingservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.upem.sellingservices package. 
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

    private final static QName _AddBookResponse_QNAME = new QName("http://dao.selling.upem.com/", "addBookResponse");
    private final static QName _GetAllBookForSellingResponse_QNAME = new QName("http://dao.selling.upem.com/", "getAllBookForSellingResponse");
    private final static QName _GetAllBorrowedBooksResponse_QNAME = new QName("http://dao.selling.upem.com/", "getAllBorrowedBooksResponse");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://dao.selling.upem.com/", "getAllUsersResponse");
    private final static QName _GetAllUsers_QNAME = new QName("http://dao.selling.upem.com/", "getAllUsers");
    private final static QName _GetBookByISBN_QNAME = new QName("http://dao.selling.upem.com/", "getBookByISBN");
    private final static QName _AddBook_QNAME = new QName("http://dao.selling.upem.com/", "addBook");
    private final static QName _GetAllBookForSelling_QNAME = new QName("http://dao.selling.upem.com/", "getAllBookForSelling");
    private final static QName _GetAllBorrowedBooks_QNAME = new QName("http://dao.selling.upem.com/", "getAllBorrowedBooks");
    private final static QName _GetBookByISBNResponse_QNAME = new QName("http://dao.selling.upem.com/", "getBookByISBNResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.upem.sellingservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetAllBorrowedBooksResponse }
     * 
     */
    public GetAllBorrowedBooksResponse createGetAllBorrowedBooksResponse() {
        return new GetAllBorrowedBooksResponse();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link GetAllBookForSellingResponse }
     * 
     */
    public GetAllBookForSellingResponse createGetAllBookForSellingResponse() {
        return new GetAllBookForSellingResponse();
    }

    /**
     * Create an instance of {@link GetBookByISBNResponse }
     * 
     */
    public GetBookByISBNResponse createGetBookByISBNResponse() {
        return new GetBookByISBNResponse();
    }

    /**
     * Create an instance of {@link GetAllBookForSelling }
     * 
     */
    public GetAllBookForSelling createGetAllBookForSelling() {
        return new GetAllBookForSelling();
    }

    /**
     * Create an instance of {@link GetAllBorrowedBooks }
     * 
     */
    public GetAllBorrowedBooks createGetAllBorrowedBooks() {
        return new GetAllBorrowedBooks();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link GetBookByISBN }
     * 
     */
    public GetBookByISBN createGetBookByISBN() {
        return new GetBookByISBN();
    }

    /**
     * Create an instance of {@link UserWS }
     * 
     */
    public UserWS createUserWS() {
        return new UserWS();
    }

    /**
     * Create an instance of {@link BookWS }
     * 
     */
    public BookWS createBookWS() {
        return new BookWS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.selling.upem.com/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBookForSellingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.selling.upem.com/", name = "getAllBookForSellingResponse")
    public JAXBElement<GetAllBookForSellingResponse> createGetAllBookForSellingResponse(GetAllBookForSellingResponse value) {
        return new JAXBElement<GetAllBookForSellingResponse>(_GetAllBookForSellingResponse_QNAME, GetAllBookForSellingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBorrowedBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.selling.upem.com/", name = "getAllBorrowedBooksResponse")
    public JAXBElement<GetAllBorrowedBooksResponse> createGetAllBorrowedBooksResponse(GetAllBorrowedBooksResponse value) {
        return new JAXBElement<GetAllBorrowedBooksResponse>(_GetAllBorrowedBooksResponse_QNAME, GetAllBorrowedBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.selling.upem.com/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.selling.upem.com/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByISBN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.selling.upem.com/", name = "getBookByISBN")
    public JAXBElement<GetBookByISBN> createGetBookByISBN(GetBookByISBN value) {
        return new JAXBElement<GetBookByISBN>(_GetBookByISBN_QNAME, GetBookByISBN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.selling.upem.com/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBookForSelling }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.selling.upem.com/", name = "getAllBookForSelling")
    public JAXBElement<GetAllBookForSelling> createGetAllBookForSelling(GetAllBookForSelling value) {
        return new JAXBElement<GetAllBookForSelling>(_GetAllBookForSelling_QNAME, GetAllBookForSelling.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBorrowedBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.selling.upem.com/", name = "getAllBorrowedBooks")
    public JAXBElement<GetAllBorrowedBooks> createGetAllBorrowedBooks(GetAllBorrowedBooks value) {
        return new JAXBElement<GetAllBorrowedBooks>(_GetAllBorrowedBooks_QNAME, GetAllBorrowedBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByISBNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.selling.upem.com/", name = "getBookByISBNResponse")
    public JAXBElement<GetBookByISBNResponse> createGetBookByISBNResponse(GetBookByISBNResponse value) {
        return new JAXBElement<GetBookByISBNResponse>(_GetBookByISBNResponse_QNAME, GetBookByISBNResponse.class, null, value);
    }

}
