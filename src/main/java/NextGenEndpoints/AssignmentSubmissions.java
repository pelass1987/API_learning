package NextGenEndpoints;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import nextGenHelpers.Headers;

import java.io.IOException;

public class AssignmentSubmissions {

    public ValidatableResponse getAssigSubmissions () throws IOException {

        Headers headers = new Headers();

        int courseId = 62098;

        return RestAssured

                .given().log().all().spec(headers.setRequestSpecification())
                .when().get("https://medtronictotara.aws.webanywhere.co.uk/api/assignment_submissions/" + courseId)
                .then().log().all().statusCode(200);
    }
}
