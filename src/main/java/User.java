public class User {

    // ----------------------------------------------------------------------------------------------------

    // ATRIBUTOS.

    String userID;
    String userName;
    String userSurname;

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR.

    public User(String s, String name, String surname){
        this.userID = s;
        this.userName = name;
        this.userSurname = surname;
    }

    // ----------------------------------------------------------------------------------------------------

    // CONSTRUCTOR VACÍO.

    public User(){}

    // ----------------------------------------------------------------------------------------------------

    // GETTERS Y SETTERS.

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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

    // ----------------------------------------------------------------------------------------------------
}
