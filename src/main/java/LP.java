dpublic class LP {

    // ----------------------------------------------------------------------------------------------------

    // ATRIBUTOS.

    int quantity;
    String Product;

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR.

    public LP(int quantity, String product) {
        this.quantity = quantity;
        Product = product;
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
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    // ----------------------------------------------------------------------------------------------------

}
