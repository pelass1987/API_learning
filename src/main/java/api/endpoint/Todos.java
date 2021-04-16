package api.endpoint;

import io.restassured.RestAssured;

public class Todos {

    public ObjectTodos getTodos (int photoId) {



        return RestAssured
                .given()
                .when()
                .get("http://jsonplaceholder.typicode.com/todos/" + photoId)
                .then()
                .statusCode(200)
                .extract()
                .as(ObjectTodos.class);
    }
}
