package Tests.Dogs;

import jdk.jfr.Description;
import org.junit.Test;

import static Common.CoomonTestData.Success_Status_Code;
import static Common.RequestBuilder.getListofAllBreedsResponse;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.containsStringIgnoringCase;

public class test {
    @Test
    @Description("As an Api user, I need to get list of all breeds")
    public void getListOfAllBreedsTests(){
        getListofAllBreedsResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code).
                body(containsStringIgnoringCase("doberman"));
    }
}
