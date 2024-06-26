package Tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CoomonTestData.*;
import static Common.RequestBuilder.createEmployeeResponse;
import static Common.RequestBuilder.updateEmployeeResponse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.hamcrest.Matchers.notNullValue;


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
                body("name", containsStringIgnoringCase("Allettah")).
                body("job", containsStringIgnoringCase("Test Analyst")).
                body("id", notNullValue()).
                body("createdAt", notNullValue());
    }
    @Test(dependsOnMethods = "createEmployeeTests")
    @Story("Update Single Employee")
    @Description("As as api user i want to update single employee")
    @Severity(SeverityLevel.NORMAL)
    public void updateSingleEmployee(){
        updateEmployeeResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code).
                body("name", containsStringIgnoringCase("Allettah")).
                body("job", containsStringIgnoringCase("Test Analyst")).
                body("id", notNullValue()).
                body("createdAt", notNullValue());

    }



}
