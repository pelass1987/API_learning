package nextGenHelpers;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Headers {

    private static RequestSpecification requestSpecification;

    FileInputStream fis = new FileInputStream
            ("C:\\Users\\Wa-Dawid P\\IdeaProjects\\ApiLearning\\src\\main\\resources\\config.properties");
    Properties properties = new Properties();

    public Headers() throws FileNotFoundException {
    }

    public RequestSpecification setRequestSpecification() throws IOException {

        properties.load(fis);

    RequestSpecBuilder builder = new RequestSpecBuilder();
            builder.addHeader("Authorization", properties.getProperty("auth"));
            builder.addHeader("X-Client", properties.getProperty("xclient"));
            builder.addHeader("Content-Type", properties.getProperty("contentType"));

   return requestSpecification = builder.build();

    }
}
