import java.util.LinkedList;

public class Order {

    // ----------------------------------------------------------------------------------------------------

    // ATRIBUTOS.

    String userID;
    LinkedList<LP> elements;

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR.
    public Order(String s) {
        this.userID = s;
        this.elements = new LinkedList<LP>();
    }

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR VACÍO.
    public Order() {}

    // ----------------------------------------------------------------------------------------------------

    // GETTERS Y SETTERS.

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public LinkedList<LP> getElements() {
        return elements;
    }

    public void setElements(LinkedList<LP> elements) {
        this.elements = elements;
    }

    // ----------------------------------------------------------------------------------------------------

    public void addLP(int i, String b001) {
    }

    // ----------------------------------------------------------------------------------------------------

    public Object getLP(int i) {
        return null;
    }

    // ----------------------------------------------------------------------------------------------------
}
