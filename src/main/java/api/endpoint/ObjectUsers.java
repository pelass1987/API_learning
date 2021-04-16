package api.endpoint;

public class ObjectUsers {

    public int id;
    public String name;
    public String username;
    public String email;
    public ObjectAddress address;
    public String phone;
    public String website;
    public Company company;

    public ObjectUsers() {
    }

    @Override
    public String toString() {
        return "ObjectUsers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public ObjectUsers(int id, String name, String username, String email, ObjectAddress address, String phone, String website, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }
}
