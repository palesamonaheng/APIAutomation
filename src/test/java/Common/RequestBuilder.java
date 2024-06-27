package Common;

import groovyjarjarantlr4.v4.codegen.model.SrcOp;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static Common.AuthorizationCreds.apiKey;
import static Common.AuthorizationCreds.apiValue;
import static Common.BasePaths.ReqRes_baseURL;
import static Common.BasePaths.weatherAPI_baseURL;
import static Common.ContentTypes.json_contentType;
import static Common.PayloadBuilder.createEmployeeObject;
import static Common.PayloadBuilder.registerWeatherStationOBJ;
import static io.restassured.RestAssured.*;

public class RequestBuilder {
    public static String EmployeeID;
    public static String StationID;

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

    public static Response getEmployeedetailsResponse(){
          Response response = given().
                when().
                get(ReqRes_baseURL + "/api/users?page=2").
                then().
                log().
                all().
                extract().response();

        return response;
    }

    public static Response registerWeatherStationResponse() {
        Response response = given().
                when().
                queryParam(apiKey,apiValue).
                body(registerWeatherStationOBJ()).
                contentType(json_contentType).
                log().all().
                post(weatherAPI_baseURL + "/data/3.0/stations").
                then().
                log().all().
                extract().response();
        StationID = response.jsonPath().getString("ID");
        return response;
    }

    public static Response getNewlyCreatedStation() {
        Response response = given().
                when().
                queryParam(apiKey,apiValue).

                contentType(json_contentType).
                log().all().
                get(weatherAPI_baseURL + "/data/3.0/stations/"+ StationID).
                then().
                log().all().
                extract().response();
        return response;
    }

}
