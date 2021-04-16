package api.endpoint;

public class ObjectComments {

    public int postId;
    public int id;
    public String name;
    public String email;
    public String body;

    public ObjectComments() {
    }

    @Override
    public String toString() {
        return "ObjectComments{" +
                "postId=" + postId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public ObjectComments(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }
}
