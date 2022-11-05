public class LP {

    // ----------------------------------------------------------------------------------------------------

    // ATRIBUTOS.

    int quantity;
    String product;

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR.

    public LP(int quantity, String product) {
        this.quantity = quantity;
        this.product = product;
    }

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR VACÍO.

    public LP(){}

    // ----------------------------------------------------------------------------------------------------

    // GETTERS Y SETTERS.

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    // ----------------------------------------------------------------------------------------------------

}
