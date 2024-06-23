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

    public static Response getListOfEmployeeResponse() {
        Response response = given().
                when().
                //No need for a body under get method
                body(getListOfEmployeeObject()).
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users?page=2").
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
public static Response employeeLoginSuccessResponse() {
        Response response = given().
                when().
                body(employeeLoginSuccessObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL +"/api/login").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");

        return response;
}
public static Response employeeUnsuccessfulloginResponse(){
        Response response = given().
                when().
                body(employeeUnsuccessfulloginObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL + "/api/login").
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
                put(ReqRes_baseURL + "/api/users/2").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");

        return response;
}

public static Response deleteEmployeeResponse(){
        Response response = given().
                when().
                body(deleteEmployeeObject()).
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users/2").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");

        return response;
}

public static Response successfulRegisterResponse(){
        Response response = given().
                when().
                body(successfulRegisterObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL + "/api/register").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");

        return response;
}
public static Response singleUserNotFoundResponse(){
        Response response = given().
                when().
                body(singleUserNotFoundObject()).
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users/23").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");

        return response;
}
}

