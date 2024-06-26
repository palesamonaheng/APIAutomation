package Common;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static Common.BasePaths.*;
import static Common.ContentTypes.json_contentType;
import static Common.PayloadBuilder.*;
import static io.restassured.RestAssured.*;

public class RequestBuilder {
    public static String EmployeeID;
    public static String StationID;
    public static String APIKey;

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
  public static Response updateEmployeeResponse(){
        return given().
                when().
                body(updateSingleEmployeeObject()).
                contentType(json_contentType).
                log().all().
                put(ReqRes_baseURL + "/api/users/" + EmployeeID).
                then().
                log().all().
                extract().response();


  }
  public static Response getListofAllBreedsResponse(){
        return given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breeds/list/all" ).
                then().
                log().all().
                extract().response();
    }
    public static Response registerWeatherStationResponse(){
        Response response = given().
                when().
                body(registerWeatherStationObject()).
                contentType(json_contentType).
                log().all().
                post(WeatherAPI_baseURL + "/data/3.0/stations").
                then().
                log().all().
                extract().response();
        StationID = response.jsonPath().getString("id");
        return response;
    }


}
