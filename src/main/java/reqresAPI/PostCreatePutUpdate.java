package reqresAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PostCreatePutUpdate  {

    FileInputStream fis = new FileInputStream
                    ("C:\\Users\\Wa-Dawid P\\IdeaProjects\\ApiLearning\\src\\main\\resources\\config.properties");

    Properties prop = new Properties();


    public PostCreatePutUpdate() throws FileNotFoundException {
    }

    public String createNewUser() throws Exception {

        String newUser = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        prop.load(fis);

        return RestAssured
                .given().log().all().contentType(ContentType.JSON).body(newUser)
                .when()
                .post(prop.getProperty("users"))
                .then().statusCode(201)
                .extract().asString();
    }

    public String updateName(int userId) throws IOException {

        String updatedUser = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";

        prop.load(fis);

        return RestAssured
                .given()
                .log().all().contentType(ContentType.JSON).body(updatedUser)
                .when()
                .put(prop.getProperty("users") + userId)
                .then()
                .statusCode(200)
                .extract()
                .asString();
    }

    public String postRegister () throws IOException {

        String registerUser = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"pistol\"\n" +
                "}";

        prop.load(fis);

        return RestAssured
                .given()
                .log().all().contentType(ContentType.JSON).body(registerUser)
                .when()
                .post(prop.getProperty("register"))
                .then()
                .statusCode(200)
                .extract()
                .asString();
}
    }

