package Common;

import io.restassured.response.Response;
import io.restassured.http.Headers;
import static Common.BasePaths.*;
import static Common.ContentTypes.json_contentType;
import static Common.PayloadBuilder.createEmployeeObject;
import static Common.PayloadBuilder.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class WeatherRequestBuilder {
    public static String StationID;

    public static Response createWeatherStationResponse() {
        Response response = given().header("Authorization", apiKey).
                queryParam("appid", apiKey).
                contentType(json_contentType).
                when().
                body(createWeatherObject()).
                log().all().
                post( Weather_baseURL+"/data/3.0/stations").
                then().
                log().all().
                extract().response();
        StationID = response.jsonPath().getString("id");
        System.out.println("Station ID created" + StationID);

        return response;
    }
    public static Response getStations() {
        System.out.println("Station ID retrieved" + StationID);
               return given().
               header("Authorization", apiKey).
                queryParam("appid", apiKey).
                contentType(json_contentType).
                when().
                log().all().
                get(Weather_baseURL+"/data/3.0/stations/"+StationID).
                then().
                log().all().
                extract().response();

    }

}

