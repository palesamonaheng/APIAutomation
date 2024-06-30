package Common;

import groovyjarjarpicocli.CommandLine;
import io.restassured.response.Response;

import org.testng.annotations.Test;

import static Common.BasePaths.ReqRes_baseURL;
import static Common.ContentTypes.json_contentType;
import static Common.PayloadBuilder.createEmployeeObject;
import static Common.PayloadBuilder.getEmployeeObject;
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

    public static Response getEmployeeResponse() {
        return given().
                when().
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users/"+EmployeeID).
                then().
                log().all().
                extract().response();
    }


   public static Response updateEmployeeResponse() {
    return given().
            when().
            body(updateEmployeeResponse()).
            contentType(json_contentType).
            log().all().
            get(ReqRes_baseURL + "/api/users"+EmployeeID).
            then().
            log().all().
            extract().response();
}

}

