package Tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import static Common.CoomonTestData.Create_Success_Status_Code;
import static Common.CoomonTestData.get_Success_Status_Code;
import static Common.RequestBuilder.EmployeeID;
import static Common.RequestBuilder.createEmployeeResponse;
import static org.hamcrest.Matchers.*;
import static Common.RequestBuilder.getEmployeeResponse;

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
                 body("name", containsStringIgnoringCase("Mak")).
                body("job", containsStringIgnoringCase("Data Analyst")).
                body("id", notNullValue()).
                body("createdAt", notNullValue());
    }
    @Test(priority = 1)
    @Feature("ReqRes get")
    @Story("Get new employee created")
    @Description("As an employer want to get new hired employees")
    @Severity(SeverityLevel.BLOCKER)
    public void getEmployeeTests() {
        getEmployeeResponse().then().assertThat().statusCode(get_Success_Status_Code);
    }
}
