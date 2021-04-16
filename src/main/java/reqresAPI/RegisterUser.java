package reqresAPI;

public class RegisterUser {

    private String email;
    private String password;
    private int id;
    private String token;

    public RegisterUser() {
    }


    public RegisterUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "RegisterUser{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", token='" + token + '\'' +
                '}';
    }

}
