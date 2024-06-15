package Common;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Locale;

import static Common.BasePaths.DogsAPI_baseURL;
import static Common.BasePaths.ReqRes_baseURL;
import static Common.ContentTypes.json_contentType;
import static Common.PayloadBuilder.*;
import static io.restassured.RestAssured.*;

public class RequestBuilder {

    //START OF REQRES API REQUEST BUILDERS
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
    public static Response successfulRegisterResponse() {
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
    public static Response unsuccessfulRegisterResponse() {
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
    public static Response successfulLoginResponse() {
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
    public static Response unsuccessfulLoginResponse() {
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

    //START OF DOGS API REQUEST BUILDERS
    public static Response getListOfAllBreedsResponse() {
        Response response = given().
                when().
                body(getListOfAllBreedsObject()).
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
                body(getSingleRandomImageObject()).
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
                body(getMultipleRandomImageObject()).
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
                body(getDogsImagesByBreedObject()).
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
                body(getRandomImagesFromBreedObject()).
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
                body(getMultipleImagesFromBreedObject()).
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
                body(getListOfAllSubBreedsObject()).
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
                body(getListOfAllSubBreedImagesObject()).
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
                body(getSingleRandomImageSubBreedObject()).
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
                body(getMultipleRandomImageSubBreedObject()).
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "/breed/hound/afghan/images/random/3").
                then().
                log().all().
                extract().response();
        return response;
    }

}
