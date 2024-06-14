package Common;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Locale;

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
    public static Response getListOfEmployeeResponse() {
        Response response = given().
                when().
                body(getListOfEmployeeObject()).
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response getSingleEmployeeResponse() {
        Response response = given().
                when().
                body(getSingleEmployeeObject()).
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users/2").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response updateSingleEmployeeResponse() {
        Response response = given().
                when().
                body(updateSingleEmployeeObject()).
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response deleteSingleEmployeeResponse() {
        Response response = given().
                when().
                body(deleteSingleEmployeeObject()).
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users/2").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response singleEmployeeNotFoundResponse() {
        Response response = given().
                when().
                body(singleEmployeeNotFoundObject()).
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users/25").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }

}
