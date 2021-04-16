package reqresAPI;

import io.restassured.RestAssured;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetSingleuser {

    FileInputStream fis = new FileInputStream
            ("C:\\Users\\Wa-Dawid P\\IdeaProjects\\ApiLearning\\src\\main\\resources\\config.properties");
    Properties prop = new Properties();

    public GetSingleuser() throws FileNotFoundException {
    }

    public String singleUser(int userId) throws IOException {

        prop.load(fis);

        return RestAssured
                .given().log().all()
                .when().get(prop.getProperty("users"))
                .then()
                .extract()
                .asString();
    }
}
