package api.endpoint;

import io.restassured.RestAssured;

public class Users {

    public ObjectUsers getUsers (int userId) {

        return RestAssured
                .given()
                .when()
                .get("http://jsonplaceholder.typicode.com/users/" + userId)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .as(ObjectUsers.class);
    }
}
