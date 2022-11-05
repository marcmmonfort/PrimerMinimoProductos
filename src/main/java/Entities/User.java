// CARPETA A LA QUE PERTENECE.
package Entities;

// IMPORTACIÓN DE CLASES E INSTANCIAS DE OTRAS CARPETAS.

import java.util.List;
import java.util.LinkedList; // ESTO.

public class User {

    // ----------------------------------------------------------------------------------------------------

    // ATRIBUTOS.

    String userId;
    String userName;
    String userSurname;
    List <Order> processedOrders;

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR.

    public User(String s, String name, String surname){
        this.userId = s;
        this.userName = name;
        this.userSurname = surname;
        this.processedOrders = new LinkedList<>(); // ESTO.
    }

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR VACÍO.

    public User(){}

    // ----------------------------------------------------------------------------------------------------

    // GETTERS Y SETTERS.

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public List<Order> getProcessedOrders() {
        return processedOrders;
    }

    public void setProcessedOrders(List<Order> processedOrders) {
        this.processedOrders = processedOrders;
    }

    // ----------------------------------------------------------------------------------------------------
}
