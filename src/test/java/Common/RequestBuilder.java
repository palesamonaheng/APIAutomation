package Common;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static Common.BasePaths.DogsAPI_baseURL;
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
  public static Response updateEmployeeResponse(){
        return given().
                when().
                body(updateSingleEmployeeObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL + "/api/users/" + EmployeeID).
                then().
                log().all().
                extract().response();


  }
  public static Response getListofAllBreedsResponse(){
        return given().
                when().
                body(getListOfAllBreedsObject()).
                contentType(json_contentType).
                log().all().
                post(DogsAPI_baseURL + "/breeds/list/all" ).
                then().
                log().all().
                extract().response();
    }


}
