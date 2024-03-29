package behavioral.chainOfResponsability;

public class HttpRequest {

    private final String userName;
    private final String password;

    public HttpRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
