// CARPETA A LA QUE PERTENECE.
package Entities;

// IMPORTACIÓN DE CLASES E INSTANCIAS DE OTRAS CARPETAS.
import Entities.*;
import Main.*;
import Managers.*;
import Services.*;

import java.util.LinkedList;

public class Order {

    // ----------------------------------------------------------------------------------------------------

    // ATRIBUTOS.

    String userId;
    LinkedList<LP> elements;

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR.
    public Order(String s) {
        this.userId = s;
        this.elements = new LinkedList<>(); // ESTO.
    }

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR VACÍO.
    public Order() {}

    // ----------------------------------------------------------------------------------------------------

    // GETTERS Y SETTERS.

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LinkedList<LP> getElements() {
        return elements;
    }

    public void setElements(LinkedList<LP> elements) {
        this.elements = elements;
    }

    // ----------------------------------------------------------------------------------------------------

    public void addLP(int i, String b001) {
        this.elements.add(new LP(i, b001)); // ESTO.
    }

    // ----------------------------------------------------------------------------------------------------

    public LP getLP(int i) {
        return this.elements.get(i); // ESTO.
    }

    // ----------------------------------------------------------------------------------------------------
}
