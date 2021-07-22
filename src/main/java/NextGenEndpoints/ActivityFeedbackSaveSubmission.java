package NextGenEndpoints;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import nextGenHelpers.Headers;

import java.io.File;
import java.io.IOException;

public class ActivityFeedbackSaveSubmission {

        public ValidatableResponse postSaveSubmission () throws IOException {

            File newPost = new File("src/test/resources/post.json");

            Headers headers = new Headers();

            return RestAssured

                    .given().log().all().spec(headers.setRequestSpecification()).body(newPost)
                    .when().post("https://medtronictotara.aws.webanywhere.co.uk/api/feedback_questions/save")
                    .then().log().all().statusCode(200);
        }
    }



