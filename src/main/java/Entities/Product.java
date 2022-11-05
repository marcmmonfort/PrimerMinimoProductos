// CARPETA A LA QUE PERTENECE.
package Entities;

// IMPORTACIÓN DE CLASES E INSTANCIAS DE OTRAS CARPETAS.
import Entities.*;
import Main.*;
import Managers.*;
import Services.*;

public class Product {

    // ----------------------------------------------------------------------------------------------------

    // ATRIBUTOS.

    String productId;
    String description;
    Double price;
    int numSales;

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR.

    public Product(String productID, String description, Double price) {
        this.productId = productID;
        this.description = description;
        this.price = price;
        this.numSales = 0;
    }

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR VACÍO.

    public Product(){}

    // ----------------------------------------------------------------------------------------------------

    // GETTERS Y SETTERS.

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getNumSales() {
        return numSales;
    }

    public void setNumSales(int numSales) {
        this.numSales = numSales;
    }

    // ----------------------------------------------------------------------------------------------------

}
