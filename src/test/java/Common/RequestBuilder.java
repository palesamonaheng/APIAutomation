package Common;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static Common.BasePaths.ReqRes_baseURL;
import static Common.ContentTypes.json_contentType;
import static Common.PayloadBuilder.*;
import static io.restassured.RestAssured.*;

public class RequestBuilder {
    public static String EmployeeID;

    public static Response createEmployeeResponse() {
        Response response = given().
                when().
                body(createEmployeeObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL + "/api/users").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");

        return response;
    }

    public static Response putEmployeeSurnameResponse() {
        return given().
                when().
                body(putEmployeeObject()).
                contentType(json_contentType).
                log().all().
                put(ReqRes_baseURL + "/api/users" + "/" + EmployeeID).
                then().
                log().all().
                extract().response();


    }

    public static Response patchEmployeeSurnameResponse() {
        return given().
                when().
                body(patchEmployeeObject()).
                contentType(json_contentType).
                log().all().
                patch(ReqRes_baseURL + "/api/users" + "/" + EmployeeID).
                then().
                log().all().
                extract().response();

    }

    public static Response getEmployeeinfoResponse() {
        return given().
                when().
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users/2").
                then().
                log().all().
                extract().response();
    }
    public static Response deleteEmployeeinfoResponse() {
        return given().
                when().
                contentType(json_contentType).
                log().all().
                delete(ReqRes_baseURL + "/api/users/2").
                then().
                log().all().
                extract().response();
    }
}


