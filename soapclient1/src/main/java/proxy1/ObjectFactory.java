
package proxy1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy1 package. 
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

    private static final QName _Product_QNAME = new QName("http://service.soapserver.aya.net/", "Product");
    private static final QName _AddProduct_QNAME = new QName("http://service.soapserver.aya.net/", "addProduct");
    private static final QName _AddProductResponse_QNAME = new QName("http://service.soapserver.aya.net/", "addProductResponse");
    private static final QName _DeleteProduct_QNAME = new QName("http://service.soapserver.aya.net/", "deleteProduct");
    private static final QName _DeleteProductResponse_QNAME = new QName("http://service.soapserver.aya.net/", "deleteProductResponse");
    private static final QName _GetAllProducts_QNAME = new QName("http://service.soapserver.aya.net/", "getAllProducts");
    private static final QName _GetAllProductsResponse_QNAME = new QName("http://service.soapserver.aya.net/", "getAllProductsResponse");
    private static final QName _GetProductById_QNAME = new QName("http://service.soapserver.aya.net/", "getProductById");
    private static final QName _GetProductByIdResponse_QNAME = new QName("http://service.soapserver.aya.net/", "getProductByIdResponse");
    private static final QName _Sellingprice_QNAME = new QName("http://service.soapserver.aya.net/", "sellingprice");
    private static final QName _SellingpriceResponse_QNAME = new QName("http://service.soapserver.aya.net/", "sellingpriceResponse");
    private static final QName _UpdateProduct_QNAME = new QName("http://service.soapserver.aya.net/", "updateProduct");
    private static final QName _UpdateProductResponse_QNAME = new QName("http://service.soapserver.aya.net/", "updateProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     * @return
     *     the new instance of {@link Product }
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     * @return
     *     the new instance of {@link AddProduct }
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     * @return
     *     the new instance of {@link AddProductResponse }
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     * @return
     *     the new instance of {@link DeleteProduct }
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     * @return
     *     the new instance of {@link DeleteProductResponse }
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link GetAllProducts }
     * 
     * @return
     *     the new instance of {@link GetAllProducts }
     */
    public GetAllProducts createGetAllProducts() {
        return new GetAllProducts();
    }

    /**
     * Create an instance of {@link GetAllProductsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllProductsResponse }
     */
    public GetAllProductsResponse createGetAllProductsResponse() {
        return new GetAllProductsResponse();
    }

    /**
     * Create an instance of {@link GetProductById }
     * 
     * @return
     *     the new instance of {@link GetProductById }
     */
    public GetProductById createGetProductById() {
        return new GetProductById();
    }

    /**
     * Create an instance of {@link GetProductByIdResponse }
     * 
     * @return
     *     the new instance of {@link GetProductByIdResponse }
     */
    public GetProductByIdResponse createGetProductByIdResponse() {
        return new GetProductByIdResponse();
    }

    /**
     * Create an instance of {@link Sellingprice }
     * 
     * @return
     *     the new instance of {@link Sellingprice }
     */
    public Sellingprice createSellingprice() {
        return new Sellingprice();
    }

    /**
     * Create an instance of {@link SellingpriceResponse }
     * 
     * @return
     *     the new instance of {@link SellingpriceResponse }
     */
    public SellingpriceResponse createSellingpriceResponse() {
        return new SellingpriceResponse();
    }

    /**
     * Create an instance of {@link UpdateProduct }
     * 
     * @return
     *     the new instance of {@link UpdateProduct }
     */
    public UpdateProduct createUpdateProduct() {
        return new UpdateProduct();
    }

    /**
     * Create an instance of {@link UpdateProductResponse }
     * 
     * @return
     *     the new instance of {@link UpdateProductResponse }
     */
    public UpdateProductResponse createUpdateProductResponse() {
        return new UpdateProductResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "deleteProduct")
    public JAXBElement<DeleteProduct> createDeleteProduct(DeleteProduct value) {
        return new JAXBElement<>(_DeleteProduct_QNAME, DeleteProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "deleteProductResponse")
    public JAXBElement<DeleteProductResponse> createDeleteProductResponse(DeleteProductResponse value) {
        return new JAXBElement<>(_DeleteProductResponse_QNAME, DeleteProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProducts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllProducts }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "getAllProducts")
    public JAXBElement<GetAllProducts> createGetAllProducts(GetAllProducts value) {
        return new JAXBElement<>(_GetAllProducts_QNAME, GetAllProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllProductsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "getAllProductsResponse")
    public JAXBElement<GetAllProductsResponse> createGetAllProductsResponse(GetAllProductsResponse value) {
        return new JAXBElement<>(_GetAllProductsResponse_QNAME, GetAllProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProductById }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "getProductById")
    public JAXBElement<GetProductById> createGetProductById(GetProductById value) {
        return new JAXBElement<>(_GetProductById_QNAME, GetProductById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProductByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "getProductByIdResponse")
    public JAXBElement<GetProductByIdResponse> createGetProductByIdResponse(GetProductByIdResponse value) {
        return new JAXBElement<>(_GetProductByIdResponse_QNAME, GetProductByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sellingprice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sellingprice }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "sellingprice")
    public JAXBElement<Sellingprice> createSellingprice(Sellingprice value) {
        return new JAXBElement<>(_Sellingprice_QNAME, Sellingprice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellingpriceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SellingpriceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "sellingpriceResponse")
    public JAXBElement<SellingpriceResponse> createSellingpriceResponse(SellingpriceResponse value) {
        return new JAXBElement<>(_SellingpriceResponse_QNAME, SellingpriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "updateProduct")
    public JAXBElement<UpdateProduct> createUpdateProduct(UpdateProduct value) {
        return new JAXBElement<>(_UpdateProduct_QNAME, UpdateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soapserver.aya.net/", name = "updateProductResponse")
    public JAXBElement<UpdateProductResponse> createUpdateProductResponse(UpdateProductResponse value) {
        return new JAXBElement<>(_UpdateProductResponse_QNAME, UpdateProductResponse.class, null, value);
    }

}
