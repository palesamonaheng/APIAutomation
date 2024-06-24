package Tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import static Common.CoomonTestData.Create_Success_Status_Code;
import static Common.CoomonTestData.Success_Status_Code;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.*;


@Test
@Feature("ReqRes")
@Story("Create new employee")
public class ReqResTests {

    @Description("As an api user i want to create a new employee")
    @Severity(SeverityLevel.CRITICAL)
    public void createEmployeeTests() {
        createEmployeeResponse().
                then().
                assertThat().
                statusCode(Create_Success_Status_Code).
                body("name", containsStringIgnoringCase("Nkosi")).
                body("job", containsStringIgnoringCase("Test")).
                body("id", notNullValue()).
                body("createdAt", notNullValue());
    }
     @Description("As an api user i want to create a new employee")
    @Severity(SeverityLevel.CRITICAL)
    public void getEmployeeTests() {
        getEmployeedetailsResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code).
                body("data[2].id", equalTo(9));

    }

}
