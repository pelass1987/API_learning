package api.endpoint;

import io.restassured.RestAssured;

public class Photos {

    public ObjectPhotos getPhotos (int photoId) {

        return RestAssured
                .given()
                .when()
                .get("http://jsonplaceholder.typicode.com/photos/" + photoId)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .as(ObjectPhotos.class);
    }
}
