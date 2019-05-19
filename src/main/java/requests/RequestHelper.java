package requests;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import payloads.AddNewPostPayload;

import static io.restassured.RestAssured.given;

public class RequestHelper {
    private RequestSpecification requestSpecification;
    public RequestHelper(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }

    public Response addNewPost(AddNewPostPayload addNewPostPayload) {
        return given()
                .spec(requestSpecification)
                .body(addNewPostPayload)
                .post("/posts")
                .then()
                .statusCode(201)
                .log().all()
                .extract()
                .response();
    }
}
