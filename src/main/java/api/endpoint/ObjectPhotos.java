package api.endpoint;

public class ObjectPhotos {

    public int albumId;
    public int id;
    public String title;
    public String url;
    public String thumbnailUrl;

    public ObjectPhotos () {

    }

    @Override
    public String toString() {
        return "ObjectPhotos{" +
                "albumId=" + albumId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                '}';
    }

    public ObjectPhotos(int albumId, int id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }
}
