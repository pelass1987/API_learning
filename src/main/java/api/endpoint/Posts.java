package api.endpoint;
import io.restassured.RestAssured;



public class Posts {

    public ObjectPosts getPosts() {

        return RestAssured
                .given()
                .when()
                .get("http://jsonplaceholder.typicode.com/posts/")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .as(ObjectPosts.class);

    }

    public ObjectPosts getPostsId(int recordId) {

        return RestAssured
                .given()
                .when()
                .get("http://jsonplaceholder.typicode.com/posts/" + recordId)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .as(ObjectPosts.class);
    }
    }







