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
                body("name", containsStringIgnoringCase("Nkosi")).
                body("job", containsStringIgnoringCase("Test")).
                body("id", notNullValue()).
                body("createdAt", notNullValue());
    }

    @Description("As an Api User, I want to Get a List Of Employees")
    @Severity(SeverityLevel.NORMAL)
    public void getListOfEmployeeTests() {
        getListOfEmployeeResponse().
                then().
                assertThat().
                statusCode(GetEmployeeList_Success_Status_Code).
                body("data.id", notNullValue()).
                body("data.email", notNullValue()).
                body("data.first_name", notNullValue()).
                body("data.last_name", notNullValue()).
                body("data.avatar", notNullValue());

    }

    @Test
    @Description("As an Api User I need to be able to get single employee details")
    @Severity(SeverityLevel.CRITICAL)
    public void getSingleEmployeeTests() {
        getSingleEmployeeResponse().
                then().
                assertThat().
                statusCode(GetSingleEmployee_Success_Status_Code).
                body("data.id", notNullValue()).
                body("data.email", notNullValue()).
                body("data.first_name", notNullValue()).
                body("data.last_name", notNullValue()).
                body("data.avatar", notNullValue());

    }

    @Test
    @Description("As an Api User, I want to login successfully")
    @Severity(SeverityLevel.CRITICAL)
    public void employeeLoginSuccessTests() {
        employeeLoginSuccessResponse().
                then().
                assertThat().
                statusCode(PostEmployeeLogin_Success_Status_Code).
                body("token", containsStringIgnoringCase("QpwL5tke4Pnpja7X4"));


    }
    @Test
    @Description("As an Api user, I need to Update Single Employee Details")
    @Severity(SeverityLevel.NORMAL)
    public void updateSingleEmployeeTests() {
        updateSingleEmployeeResponse().
                then().
                assertThat().
                statusCode(UpdateSingleEmployee_Success_Status_Code).
                body("name", containsStringIgnoringCase("Nkosi")).
                body("job", containsStringIgnoringCase("T Analyst")).
                body("surname" ,containsStringIgnoringCase("Mthembu")).
                body("updatedAt", notNullValue());
    }

    @Test
    @Description
    @Severity(SeverityLevel.NORMAL)
    public void deleteEmployeeTests() {
        deleteEmployeeResponse().
                then().
                assertThat().
                statusCode(DeleteEmployee_Success_Status_Code);
    }
}

