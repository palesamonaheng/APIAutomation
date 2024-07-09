package Common;

import io.restassured.response.Response;
import io.restassured.http.Headers;
import org.hamcrest.Matcher;

import static Common.BasePath.*;
import static Common.PayloadBuilder.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;


public class WeatherRequestBuilder {
 //  public static String StationID;


    public static Response createWeatherStationResponse() {
        Response response = given().header("Authorization", apiKey).
                queryParam("appid", apiKey).
                when().
                body(createWeatherObject()).
                contentType(json_contentType).
                log().all().
                post( Weather_baseURL+"/data/3.0/stations").
                then().
                log().all().
                extract().response();
        StationID= response.jsonPath().getString("ID");
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
    public static Response getUpdatedStations() {
        System.out.println("Station ID updated info" + StationID);
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
    public static Response updateStationsInfo() {
        System.out.println("Station ID Updadted" + StationID);
        return given().
                header("Authorization", apiKey).
                queryParam("appid", apiKey).
                contentType(json_contentType).
                when().
                body(updateWeatherObjectStations()).
                //log().all()
                put(Weather_baseURL + "/data/3.0/stations/" + StationID).
                then().

                log().all().
                extract().response();
    }

    public static Response deleteStationsInfo() {
        System.out.println("Station ID deleted" + StationID);
        return given().
                header("Authorization", apiKey).
                queryParam("appid", apiKey).
                contentType(json_contentType).
                when().
                //log().all().
                        delete(Weather_baseURL + "/data/3.0/stations/" + StationID).
                then().
                log().all().
                extract().response();
    }

    public static Response getDeletedStations() {
        System.out.println("Station ID updated info" + StationID);
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

