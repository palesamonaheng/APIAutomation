package Common;

import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;
import io.restassured.response.Response;

import static Common.BasePaths.ReqRes_baseURL;
import static Common.ContentTypes.json_contentType;
import static Common.PayloadBuilder.createEmployeeObject;
import static io.restassured.RestAssured.*;
import static Common.PayloadBuilder.putEmployeeObject;
import static Common.PayloadBuilder.patchEmployeeObject;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;

public class RequestBuilder {
public static  String EmpoyeeID;
    public static Response createEmployeeResponse() {
      Response response = given().
                when().
                body(createEmployeeObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL+"/api/users").
                then().
                log().all().
                extract().response();
        EmpoyeeID = response.jsonPath().getString("id");

        return response;
    }

public static Response putEmployeeResponse() {
    Response response = given().
            when().
            body(putEmployeeObject()).
            contentType(json_contentType).
            log().all().
            put(ReqRes_baseURL+"/api/users"+"/" +EmpoyeeID).
            then().
            log().all().
            extract().response();
    EmpoyeeID = response.jsonPath().getString("id");
    return response;
    }
    public static Response patchEmployeeResponse() {
    Response response = given().
            when().
            body(patchEmployeeObject()).
            contentType(json_contentType).
            log().all().
            patch(ReqRes_baseURL+"/api/users"+"/"+ EmpoyeeID).
            then().
            log().all().
            extract().response();
    EmpoyeeID = response.jsonPath().getString("id");

        return response;
}
}
