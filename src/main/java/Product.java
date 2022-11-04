public class Product {

    // ----------------------------------------------------------------------------------------------------

    // ATRIBUTOS.

    String productID;
    String productName;
    Double productPrice;

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR.
    public Product(String prodID, String prodName, Double prodPrice){
        this.productID = prodID;
        this.productName = prodName;
        this.productPrice = prodPrice;
    }

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR VACÍO.

    public Product(){}

    // ----------------------------------------------------------------------------------------------------

    // GETTERS Y SETTERS.

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    // ----------------------------------------------------------------------------------------------------

    public String getProductId() {
        return null;
    }

    public double getPrice() {
        return 0;
    }

    public String getDescription() {
        return null;
    }

    public int getNumSales() {
        return 0;
    }
}
