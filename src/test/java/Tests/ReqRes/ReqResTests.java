package Tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.*;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.*;


@Test
@Feature("ReqRes")

public class ReqResTests {
    @Story("Create new user")
    @Test(priority = 4)
    @Description("As an api user i want to create a new employee")
    @Severity(SeverityLevel.CRITICAL)
    public void CreateUserTests() {
        createUserResponse().
                then().
                assertThat().
                statusCode(Create_Success_Status_Code).
                body("name", containsStringIgnoringCase("Nkosi")).
                body("job", containsStringIgnoringCase("Test")).
                body("id", notNullValue()).
                body("createdAt", notNullValue());
    }
    @Story("Get a list of users")
    @Test(priority = 5)
    @Description("As an api user i want to get a list of employees")
    @Severity(SeverityLevel.CRITICAL)
    public void getListOfUsersTests() {
        getListOfUsersResponse().
                then().
                assertThat().
                statusCode(GetUser_List_Success_Status_Code).
        body("data.id", notNullValue()).
        body("data.email", notNullValue()).
        body("data.first_name", notNullValue()).
        body("data.last_name", notNullValue()).
        body("data.avatar", notNullValue());
    }
    @Test(priority = 6)
    @Story("Get a single employee details")
    @Description("As an api user i want to get a single employee details")
    @Severity(SeverityLevel.CRITICAL)
    public void getSingleUserTests() {
        getSingleUserResponse().
                then().
                assertThat().
                statusCode(Get_Single_User_Success_Status_Code).
         body("data.id", notNullValue()).
         body("data.email", containsStringIgnoringCase("janet.weaver@reqres.in")).
         body("data.first_name", containsStringIgnoringCase("janet")).
         body("data.last_name", containsStringIgnoringCase("WEAVER")).
         body("data.avatar", containsStringIgnoringCase("https://reqres.in/img/faces/2-image.jpg"));
    }
    @Test(priority = 7)
    @Story("Update a single employee details")
    @Description("As an api user i want to update a single employee details")
    @Severity(SeverityLevel.NORMAL)
    public void updateSingleUserTests() {
        updateSingleUserResponse().
                then().
                assertThat().
                statusCode(Update_Single_User_Success_Status_Code).
        body("name", containsStringIgnoringCase("Nkosi")).
        body("job", containsStringIgnoringCase("Update Testing")).
        body("updatedAt", notNullValue());

    }
    @Test(priority = 8)
    @Story("Delete a single employee details")
    @Description("As an api user i want to delete a single employee details")
    @Severity(SeverityLevel.NORMAL)
    public void deleteSingleUserTests() {
        deleteSingleUserResponse().
                then().
                assertThat().
                statusCode(delete_Single_User_Success_Status_Code);
    }
    @Test(priority = 9)
    @Story("I don't want to return single employee details")
    @Description("As an api user i don't want to return single employee details")
    @Severity(SeverityLevel.BLOCKER)
    public void SingleUserNotFoundTests() {
        singleUserNotFoundResponse().
                then().
                assertThat().
                statusCode(get_Single_User_Not_Found_Status_Code);
    }
    @Story("I want to do a successful registration")
    @Description("As an api user i want to do a successful registration")
    @Severity(SeverityLevel.BLOCKER)
    public void SuccessfulRegisterUserTests() {
        successfulRegisterUserResponse().
                then().
                assertThat().
                statusCode(display_Successful_Registration_Status_Code).
        body("token", containsStringIgnoringCase("QpwL5tke4Pnpja7X4"));
        //body("data.updatedAt", notNullValue());

    }
    @Test(priority = 2)
    @Story("I want to do a unsuccessful registration")
    @Description("As an api user i want to do a unsuccessful registration")
    @Severity(SeverityLevel.BLOCKER)
    public void UnsuccessfulRegisterUserTests() {
        unsuccessfulRegisterUserResponse().
                then().
                assertThat().
                statusCode(display_Unsuccessful_Registration_Status_Code);
              // body("data.error", containsStringIgnoringCase("Missing password"));
                //body("data.updatedAt", notNullValue());

    }
    @Test(priority = 1)
    @Story("I want to do a successful login")
    @Description("As an api user i want to do a successful login")
    @Severity(SeverityLevel.BLOCKER)
    public void SuccessfulUserLoginTests() {
        successfulUserLoginResponse().
                then().
                assertThat().
                statusCode(display_Successful_Login_Status_Code).
                body("token", containsStringIgnoringCase("QpwL5tke4Pnpja7X4"));
        //body("data.updatedAt", notNullValue());

    }
    @Test(priority = 3)
    @Description("As an api user i want to do a successful login")
    @Severity(SeverityLevel.BLOCKER)
    public void UnsuccessfulUserLoginTests() {
        unsuccessfulUserLoginResponse().
                then().
                assertThat().
                statusCode(display_Unsuccessful_Login_Status_Code).
                body("error", containsStringIgnoringCase("Missing password"));
        //body("data.updatedAt", notNullValue());

    }
    @Test(priority = 10)
    @Story("I want to find a single resource")
    @Description("As an api user i want to find a single user")
    @Severity(SeverityLevel.BLOCKER)
    public void SingleResourceTests() {
        singleResourceResponse().
                then().
                assertThat().
                statusCode(display_Single_Resource_Status_Code).
        body("data.name", containsStringIgnoringCase("fuchsia rose"));
        //body("data.updatedAt", notNullValue());

    }
    @Test(priority = 11)
    @Story("I don't want to find a single user")
    @Description("As an api user i don't want to find a single user")
    @Severity(SeverityLevel.BLOCKER)
    public void SingleResourceNotFoundTests() {
        singleResourceNotFoundResponse().
                then().
                assertThat().
                statusCode(display_Single_Resource_Not_Found_Status_Code);
        }
    @Test(priority = 11)
    @Story("I want to find a list of users")
    @Description("As an api user i want to find a list of users")
    @Severity(SeverityLevel.BLOCKER)
    public void ListResourceTests() {
        listResourcesResponse().
                then().
                assertThat().
                statusCode(display_List_Resources_Status_Code).
        body("data.name", notNullValue()).
        body("data.year", notNullValue()).
        body("data.id", notNullValue()).
        body("data.color", notNullValue()).
        body("data.pantone_value", notNullValue());
        //body("data.updatedAt", notNullValue());

    }
}
