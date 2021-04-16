package api.endpoint;

import io.restassured.RestAssured;

public class Albums {

public ObjectAlbums getAlbums(int albumId) {

    return RestAssured
            .given()
            .when()
            .get("http://jsonplaceholder.typicode.com/albums/" + albumId)
            .then()
            .statusCode(200)
            .log().all()
            .extract()
            .as(ObjectAlbums.class);
}
}
