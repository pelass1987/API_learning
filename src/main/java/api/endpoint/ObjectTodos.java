package api.endpoint;

public class ObjectTodos {

public int userId;
public int id;
public String title;
public String completed;

    public ObjectTodos() {
    }

    @Override
    public String toString() {
        return "ObjectTodos{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed='" + completed + '\'' +
                '}';
    }

    public ObjectTodos(int userId, int id, String title, String completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
}
