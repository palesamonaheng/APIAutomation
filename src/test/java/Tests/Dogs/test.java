package Tests.Dogs;

import jdk.jfr.Description;
import org.junit.Test;

import static Common.CoomonTestData.get_list_of_All_Breeds_Status_Code;
import static Common.RequestBuilder.getListOfAllBreedsResponse;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.containsStringIgnoringCase;

public class test {
    @Test
    @Description("As an Api user, I need to get list of all breeds")
    public void getListOfAllBreedsTests(){
        getListOfAllBreedsResponse().
                then().
                assertThat().
                statusCode(get_list_of_All_Breeds_Status_Code).
                body("messages", notNullValue()).
                body("status", containsStringIgnoringCase("error"));
    }
}
