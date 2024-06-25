package Common;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Locale;

import static Common.AuthorizationCredentials.apiKey;
import static Common.AuthorizationCredentials.apiValue;
import static Common.BasePaths.*;
import static Common.ContentTypes.json_contentType;
import static Common.PayloadBuilder.*;
import static io.restassured.RestAssured.*;

public class RequestBuilder {

    //START OF REQRES API REQUEST BUILDERS
    public static String EmployeeID;
    public static String StationID;
    public static String APIKey;
       public static Response createUserResponse() {
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
    public static Response getListOfUsersResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users?page=2").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response getSingleUserResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users/2").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response updateSingleUserResponse() {
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
    public static Response deleteSingleUserResponse() {
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
    public static Response singleUserNotFoundResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users/25").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response successfulRegisterUserResponse() {
        Response response = given().
                when().
              body(putSuccessfulRegisterObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL + "/api/register").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response unsuccessfulRegisterUserResponse() {
        Response response = given().
                when().
                body(putUnsuccessfulRegisterObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL + "/api/register").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response successfulUserLoginResponse() {
        Response response = given().
                when().
               body(successfulLoginObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL + "/api/login").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response unsuccessfulUserLoginResponse() {
        Response response = given().
                when().
               body(unsuccessfulLoginObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL + "/api/login").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response singleResourceResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/unknown/2").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response singleResourceNotFoundResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/unknown/23").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }
    public static Response listResourcesResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/unknown").
                then().
                log().all().
                extract().response();
        EmployeeID = response.jsonPath().getString("id");
        return response;
    }

    //START OF DOGS API REQUEST BUILDERS
    public static Response getListOfAllBreedsResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breeds/list/all").
                then().
                log().all().
                extract().response();
                return response;
    }
    public static Response getSingleRandomImageResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breeds/image/random").
                then().
                log().all().
                extract().response();
        return response;
    }
    public static Response getMultipleRandomImageResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breeds/image/random/3").
                then().
                log().all().
                extract().response();
        return response;
    }
    public static Response getDogsImagesByBreedResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breed/hound/images").
                then().
                log().all().
                extract().response();
        return response;
    }
    public static Response getRandomImagesFromBreedResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breed/hound/images/random").
                then().
                log().all().
                extract().response();
        return response;
    }
    public static Response getMultipleImagesFromBreedResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breed/hound/images/random/3").
                then().
                log().all().
                extract().response();
        return response;
    }
    public static Response getListOfAllSubBreedsResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breed/hound/list").
                then().
                log().all().
                extract().response();
        return response;
    }
    public static Response getListOfAllSubBreedImagesResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breed/hound/afghan/images").
                then().
                log().all().
                extract().response();
        return response;
    }
    public static Response getSingleRandomImageSubBreedResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breed/hound/afghan/images/random").
                then().
                log().all().
                extract().response();
        return response;
    }
    public static Response getMultipleRandomImageSubBreedResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breed/hound/afghan/images/random/3").
                then().
                log().all().
                extract().response();
        return response;
    }
    public static Response getBreedListResponse() {
        Response response = given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breed/\n" +
                        "Affenpinscher\n" +
                        "/images/random").
                then().
                log().all().
                extract().response();
        return response;
    }
    //START OF WEATHER API REQUEST BUILDERS


    public static Response registerWeatherStationResponse() {
                Response response = given().
                when().
               queryParam(apiKey,apiValue).
                body(registerWeatherStationObject()).
                contentType(json_contentType).
                log().all().
                post(WeatherAPI_baseURL + "/data/3.0/stations").
                then().
                log().all().
                extract().response();
        return response;
    }

    public static Response getNewlyRegisteredStationIDResponse() {
                Response response = given().
                when().
                queryParam(apiKey,apiValue).
              // body(getNewlyRegisteredWeatherStationIDObject()).
                contentType(json_contentType).
                log().all().
                get(WeatherAPI_baseURL + "/data/3.0/stations" + StationID).
                then().
                log().all().
                extract().response();
        //StationID = response.jsonPath().getString("ID");
        System.out.println("Station ID: " + StationID);
        return response;
    }


    public static Response updateWeatherStationInfoResponse() {
        Response response = given().
                when().
                body(updateWeatherStationInfoObject()).
                contentType(json_contentType).
                log().all().
                put(WeatherAPI_baseURL + "/data/3.0/stations" + StationID).
                then().
                log().all().
                extract().response();
        StationID = response.jsonPath().getString("ID");
        System.out.println("Station ID: " + StationID);
        return response;
    }/*
    public static Response deleteWeatherStationInfoResponse() {
        Response response = given().
                when().
                body(deleteWeatherStationInfoObject()).
                contentType(json_contentType).
                log().all().
                put(WeatherAPI_baseURL + "/data/3.0/stations", StationID).
                then().
                log().all().
                extract().response();
        StationID = response.jsonPath().getString("ID");
        System.out.println("Station ID: " + StationID);
        return response;
    }
    public static Response NegativeRegisterWeatherStationResponse() {
        APIKey = "ca497274c14aef3abcab96bf314e8736abcd";
        System.out.println("API key: " + APIKey);
        Response response = given().
                when().
                //headers("Authorization", APIKey).
                body(negativeRegisterWeatherStationObject()).
                contentType(json_contentType).
                log().all().
                post(WeatherAPI_baseURL + "/data/3.0/stations").
                then().
                log().all().
                extract().response();
        return response;
    }
    */
}
