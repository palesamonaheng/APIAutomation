package Tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import static Common.CoomonTestData.*;
import static Common.RequestBuilder.EmployeeID;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.*;


@Test
@Feature("ReqRes")
@Story("Create new employee")
public class ReqResTests {

    @Description("As an api user i want to create a new employee")
    @Test
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
    @Description("As an api user i want to get the new employee details")
    @Test(dependsOnMethods= {"createEmployeeTests"})
    @Severity(SeverityLevel.NORMAL)
    public void getEmployeeTests() {
        getEmployeeResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }
    @Description("As an api user i want to update new employee details")
    @Test(dependsOnMethods= {"getEmployeeTests"})
    @Severity(SeverityLevel.NORMAL)
    public void updateEmployeeTests() {
        updateEmployeeResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code).
                body("name", containsStringIgnoringCase("Palesa")).
                body("job", containsStringIgnoringCase("Intermidiate Test Analyst")).
                body("id", notNullValue()).
                body("createdAt", notNullValue());
    }
    @Description("As an api user i want to update new employee details")
    @Test(dependsOnMethods= {"updateEmployeeTests"})
    @Severity(SeverityLevel.NORMAL)
    public void deleteEmployeeTests() {
        deleteEmployeeResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }
    @Description("As an api user i want to get the new employee details")
    @Test(dependsOnMethods= {"createEmployeeTests"})
    @Severity(SeverityLevel.NORMAL)
    public void getTests() {
        getEmployeeResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }
}
