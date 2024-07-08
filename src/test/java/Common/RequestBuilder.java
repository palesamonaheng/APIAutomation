package Common;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static Common.BasePaths.*;
import static Common.ContentTypes.json_contentType;
import static Common.CoomonTestData.*;
import static Common.QuerryParameterBuilder.*;
import static Common.PayloadBuilder.*;
import static io.restassured.RestAssured.*;

public class RequestBuilder {
    public static String EmployeeID;
    public static String WeatherStationID;
    public static Response response;
    public static RequestSpecification requestSpecification;
    public static int statusCode;
    public static void authorization() {
        requestSpecification = given().
                baseUri(Weather_baseURL).
                queryParam(apiKey, apiValue);

    }
    public static Response getListWeatherStation() {
        response=given().spec(requestSpecification).
                when().
                get("/data/3.0/stations").
                then().
                log().all().extract().response();
            statusCode= response.statusCode();
            return response;
    }
    public static Response createWeatherStation() {
        response = given().spec(requestSpecification).
                when().
                body(createWeatherObject()).
                contentType(json_contentType).
                log().all().
                post( "/data/3.0/stations").
                then().
                extract().response();
        WeatherStationID = response.jsonPath().getString("ID");
        return response;

    }
    public static void getNewStation() {
        given().spec(requestSpecification).
                when().
                get("/data/3.0/stations/"+WeatherStationID).
                then().
                log().all().assertThat().statusCode(Success_Status_Code);

    }
    public static Response updateNewWeatherStation() {
        response = given().spec(requestSpecification).
                when().
                body(updateWeatherObject()).
                contentType(json_contentType).
                log().all().
                put( "/data/3.0/stations/"+WeatherStationID).
                then().
                log().all().extract().response();
        return response;

    }
    public static Response deleteNewStation() {
       response= given().spec(requestSpecification).
                when().
                body(deleteNewWeatherObject()).
                delete("/data/3.0/stations/"+WeatherStationID)
                .then().extract().response();
        return response;
    }
    //The Reqres API test cases
    public static Response createEmployeeResponse() {
         response = given().
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
        response= given().
                when().
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL+"/api/users/"+EmployeeID).
                then()
                .log().all().
                extract().response();
        String name = response.jsonPath().getString("data.name");
        String job = response.jsonPath().getString("data.job");
        System.out.println(name);
        System.out.println(job);
        return response;
    }
    public static Response updateEmployeeResponse() {
         response = given().
                when().
                body(updateEmployeeObject()).
                contentType(json_contentType).
                log().all().
                patch(ReqRes_baseURL + "/api/users/"+EmployeeID).
                then().
                log().all().
                extract().response();

        return response;
    }
    public static Response deleteEmployeeResponse() {
         response = given().
                when().
                body(deleteEmployeeObject()).
                delete(ReqRes_baseURL + "/api/users/"+EmployeeID).
                then().
                extract().response();

        return response;
    }

}
