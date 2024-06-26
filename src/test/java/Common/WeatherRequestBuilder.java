package Common;

import io.restassured.response.Response;
import io.restassured.http.Headers;
import static Common.BasePaths.*;
import static Common.ContentTypes.json_contentType;
import static Common.PayloadBuilder.createEmployeeObject;
import static Common.PayloadBuilder.*;
import static io.restassured.RestAssured.given;

public class WeatherRequestBuilder {
    public static String StationID;

    public static Response createWeatherStationResponse() {
        Response response = given().baseUri(Weather_baseURL)
                .contentType(json_contentType)
                .header("Authorization", apiKey).
                when().
                body(createWeatherObject()).
                log().all().
                post(Weather_baseURL + "/data/3.0/stations").
                then().
                log().all().
                extract().response();
        StationID = response.jsonPath().get("id");
        System.out.println("Station ID created" + StationID);

        return response;
    }
    public static Response getStations() {
        System.out.println("Station ID retrieved" + StationID);
        return given().baseUri(Weather_baseURL)
               .header("Authorization", "6ffaa34def8fcc4474de61cbcfd97660")
                .contentType(json_contentType).
                when().
                log().all().
                get("/data/3.0/stations/"+StationID).
                then().
                log().all().
                extract().response();

    }

}

