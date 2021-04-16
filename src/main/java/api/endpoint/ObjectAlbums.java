package api.endpoint;

public class ObjectAlbums {

    public int userId;
    public int id;
    public String title;

    public ObjectAlbums() {
    }

    @Override
    public String toString() {
        return "ObjectAlbums{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public ObjectAlbums(int userId, int id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }


}
