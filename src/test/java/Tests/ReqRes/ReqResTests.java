package Tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CoomonTestData.*;
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
                body("name", containsStringIgnoringCase("Alvin")).
                body("job", containsStringIgnoringCase("Test Analyst")).
                body("id", notNullValue()).
                body("createdAt", notNullValue());
    }

    @Test(priority = 1)
    @Description("As an api user i want to add surname to an existing employee")
    @Severity(SeverityLevel.CRITICAL)
    public void putEmployeeSurnameTest() {
        putEmployeeSurnameResponse().
                then().
                assertThat().
                statusCode(Update_employee_information_successfully).
                body("name", containsStringIgnoringCase("Alvin")).
                body("job", containsStringIgnoringCase("Software Engineer")).
                body("surname", containsStringIgnoringCase("Chiweshe")).
                body("updatedAt", notNullValue());
    }

    @Test(priority = 2)
    @Description("As an api user i want to patch job description to an existing employee")
    @Severity(SeverityLevel.NORMAL)
    public void patchEmployeeJobTitleTest() {
        patchEmployeeSurnameResponse().
                then().
                assertThat().
                statusCode(Patch_employee_title_successfully).
                body("name", containsStringIgnoringCase("Alvin")).
                body("job", containsStringIgnoringCase("Software Engineer (QE)")).
                body("surname", containsStringIgnoringCase("Chiweshe")).
                body("updatedAt", notNullValue());
    }

    @Test(priority = 3)
    @Description("As an api user i want to get an existing employee")
    @Severity(SeverityLevel.NORMAL)
    public void GetEmployeeInformation() {
        getEmployeeinfoResponse().
                then().
                assertThat().
                statusCode(Get_employee_successfully).
                body("data. id", equalTo(2)).
                body("data.first_name" , comparesEqualTo("Janet")).
                body("data.last_name", comparesEqualTo("Weaver"));

    }
    @Test(priority = 4)
    @Description("As an api user i want to delete an existing employee")
    @Severity(SeverityLevel.NORMAL)
    public void deleteEmployeeInformation() {
        deleteEmployeeinfoResponse().
                then().
                assertThat().
                statusCode(Delete_employee_successfully);

    }

}
