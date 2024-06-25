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

    @Test(priority = 1)
    @Description("As an Api User, I want to Get a List Of Employees")
    @Severity(SeverityLevel.NORMAL)
    public void getListOfEmployeeTests() {
        getListOfEmployeeResponse().
                then().
                assertThat().
                statusCode(GetEmployeeList_Success_Status_Code).
                body("data[0].id",equalTo(7)).
                body("data[1].id",equalTo(8)).
                body("data[2].id",equalTo(9)).
                body("data[3].id",equalTo(10)).
                body("data[4].id",equalTo(11)).
                body("data[5].id",equalTo(12));

//                body("page", notNullValue()).
//                body("per_page", notNullValue()).
//                body("total", notNullValue()).
//                body("total_pages" ,notNullValue()).
//                body("data" , notNullValue()).
//                body("data.id", notNullValue()).
//                body("data.email", notNullValue()).
//                body("data.first_name", notNullValue()).
//                body("data.last_name", notNullValue()).
//                body("data.avatar", notNullValue());
    }
    @Test(priority = 2)
    @Description("As an Api User I need to be able to get single employee details")
    @Severity(SeverityLevel.CRITICAL)
    public void getSingleEmployeeTests() {
        getSingleEmployeeResponse().
                then().
                assertThat().
                statusCode(GetSingleEmployee_Success_Status_Code).
                body("data.id",equalTo(2)).
                body("data.email",equalTo("janet.weaver@reqres.in")).
                body("data.first_name", equalTo("Janet")).
                body("data.last_name", equalTo("Weaver")).
                body("data.avatar", notNullValue());
  }

    @Test(priority = 3)
    @Description("As an Api User, I want to login successfully")
    @Severity(SeverityLevel.CRITICAL)
    public void employeeLoginSuccessTests() {
        employeeLoginSuccessResponse().
                then().
                assertThat().
                statusCode(PostEmployeeLogin_Success_Status_Code).
                body("token", containsStringIgnoringCase("QpwL5tke4Pnpja7X4"));
    }

    @Test(priority = 4)
    @Description("As an Api User, i need to do an unsuccessful login")
    @Severity(SeverityLevel.NORMAL)
    public void employeeUnsuccessfulloginTests(){
        employeeUnsuccessfulloginResponse().
                then().
                assertThat().
                statusCode(EmployeeUnsuccessfullogin_Success_Status_Code).
                body("error",containsStringIgnoringCase("Missing password"));
    }

    @Test(priority = 5)
    @Description("As an Api user, I need to Update Single Employee Details")
    @Severity(SeverityLevel.NORMAL)
    public void updateSingleEmployeeTests() {
        updateSingleEmployeeResponse().
                then().
                assertThat().
                statusCode(UpdateSingleEmployee_Success_Status_Code).
                body("name", containsStringIgnoringCase("Nkosi")).
                body("job", containsStringIgnoringCase("Test Analyst")).
                body("surname" ,containsStringIgnoringCase("Cele")).
                body("updatedAt",notNullValue());
    }

    @Test(priority = 7)
    @Description("As an Api user, I need to successfully delete employee details")
    @Severity(SeverityLevel.NORMAL)
    public void deleteEmployeeTests() {
        deleteEmployeeResponse().
                then().
                assertThat().
                statusCode(DeleteEmployee_Success_Status_Code);
    }
    @Test(priority = 6)
    @Description("As an Api User, I need to successfully register as a new user")
    @Severity(SeverityLevel.CRITICAL)
    public void successfulRegisterTests(){
        successfulRegisterResponse().
                then().
                assertThat().
                statusCode(SuccessfulRegister_Success_Status_Code).
                body("id", notNullValue()).
                body("token" ,notNullValue());


    }
    @Test(priority = 8)
    @Description("As an Api User,I need to check that a single user is not found")
    @Severity(SeverityLevel.NORMAL)
    public void singleUserNotFoundTests(){
        singleUserNotFoundResponse().
                then().
                assertThat().
                statusCode(SingleUserNotFound_Success_Status_Code);

    }

}

