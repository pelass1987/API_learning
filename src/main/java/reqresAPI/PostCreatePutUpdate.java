package reqresAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;

public class PostCreatePutUpdate  {

    FileInputStream fis = new FileInputStream
                    ("C:\\Users\\Wa-Dawid P\\IdeaProjects\\ApiLearning\\src\\main\\resources\\config.properties");

    Properties prop = new Properties();


    public PostCreatePutUpdate() throws FileNotFoundException {
    }

    public NewUser createNewUser(NewUser newUser) throws Exception {

        prop.load(fis);
        String url = prop.getProperty("users");


        return RestAssured
                .given()
                .log().all()
                .contentType(ContentType.JSON)
                .body(newUser)
                .when()
                .post(url)
                .then().statusCode(Matchers.greaterThanOrEqualTo(200))
                .extract()
                .as(NewUser.class);
    }

    public UpdatedUser updateName(UpdatedUser updatedUser) throws IOException {

        prop.load(fis);
        String url = prop.getProperty("users");
        int userId = 10;

        return RestAssured
                .given()
                .log().all().contentType(ContentType.JSON).body(updatedUser)
                .when()
                .put(url + userId)
                .then()
                .statusCode(200)
                .extract()
                .as(UpdatedUser.class);
    }

    public RegisterUser postRegister (RegisterUser registerUser) throws IOException {

        prop.load(fis);
        String url = prop.getProperty("register");

        return RestAssured
                .given()
                .log().all().contentType(ContentType.JSON).body(registerUser)
                .when()
                .post(url)
                .then()
                .statusCode(200)
                .extract()
                .as(RegisterUser.class);


}
    }

