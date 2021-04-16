package api.endpoint;

import io.restassured.RestAssured;

public class Comments {

    public ObjectComments getComments (int commentsId) {

        return RestAssured
                .given()
                .when()
                .get("http://jsonplaceholder.typicode.com/comments/" + commentsId)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .as(ObjectComments.class);
    }
    }

