package Tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.*;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.*;


@Test
@Feature("ReqRes")
@Story("Create new employee")
public class ReqResTests {

    @Description("As an api user i want to create a new employee")
    @Severity(SeverityLevel.CRITICAL)
    public void bCreateEmployeeTests() {
        createEmployeeResponse().
                then().
                assertThat().
                statusCode(Create_Success_Status_Code).
                body("name", containsStringIgnoringCase("Nkosi")).
                body("job", containsStringIgnoringCase("Test")).
                body("id", notNullValue()).
                body("createdAt", notNullValue());
    }

    @Description("As an api user i want to get a list of employees")
    @Severity(SeverityLevel.CRITICAL)
    public void cGetListOfEmployeeTests() {
        getListOfEmployeeResponse().
                then().
                assertThat().
                statusCode(GetUser_List_Success_Status_Code);
        /*body("id", notNullValue());
        body("email", notNullValue()).
        body("first_name", notNullValue()).
        body("last_name", notNullValue()).
        body("avatar", notNullValue());
          */
    }

    @Description("As an api user i want to get a single employee details")
    @Severity(SeverityLevel.CRITICAL)
    public void dGetSingleEmployeeTests() {
        getSingleEmployeeResponse().
                then().
                assertThat().
                statusCode(Get_Single_User_Success_Status_Code);
         //body("id", notNullValue());
        // body("email", containsStringIgnoringCase("janet.weaver@reqres.in")).
        // body("first_name", containsStringIgnoringCase("janet")).
        // body("last_name", containsStringIgnoringCase("WEAVER")).
        // body("avatar", containsStringIgnoringCase("https://reqres.in/img/faces/2-image.jpg"));
    }

    @Description("As an api user i want to update a single employee details")
    @Severity(SeverityLevel.NORMAL)
    public void updateSingleEmployeeTests() {
        updateSingleEmployeeResponse().
                then().
                assertThat().
                statusCode(Update_Single_User_Success_Status_Code);
        //body("name", containsStringIgnoringCase("Nkosi"));
        //body("job", containsStringIgnoringCase("Update Testing")).
        //body("updatedAt", notNullValue());

    }

    @Description("As an api user i want to delete a single employee details")
    @Severity(SeverityLevel.NORMAL)
    public void zDeleteSingleEmployeeTests() {
        deleteSingleEmployeeResponse().
                then().
                assertThat().
                statusCode(delete_Single_User_Success_Status_Code);
    }

    @Description("As an api user i don't want to return single employee details")
    @Severity(SeverityLevel.BLOCKER)
    public void eSingleEmployeeNotFoundTests() {
        singleEmployeeNotFoundResponse().
                then().
                assertThat().
                statusCode(get_Single_User_Not_Found_Status_Code);
    }
    @Description("As an api user i want to do a successful registration")
    @Severity(SeverityLevel.BLOCKER)
    public void aSuccessfulRegisterTests() {
        successfulRegisterResponse().
                then().
                assertThat().
                statusCode(display_Successful_Registration_Status_Code).
        body("token", containsStringIgnoringCase("QpwL5tke4Pnpja7X4"));
        //body("updatedAt", notNullValue());

    }
    @Description("As an api user i want to do a unsuccessful registration")
    @Severity(SeverityLevel.BLOCKER)
    public void aUnsuccessfulRegisterTests() {
        unsuccessfulRegisterResponse().
                then().
                assertThat().
                statusCode(display_Unsuccessful_Registration_Status_Code).
                body("error", containsStringIgnoringCase("Missing password"));
        //body("updatedAt", notNullValue());

    }
    @Description("As an api user i want to do a successful login")
    @Severity(SeverityLevel.BLOCKER)
    public void aSuccessfulLoginTests() {
        successfulLoginResponse().
                then().
                assertThat().
                statusCode(display_Successful_Login_Status_Code).
                body("token", containsStringIgnoringCase("QpwL5tke4Pnpja7X4"));
        //body("updatedAt", notNullValue());

    }
    @Description("As an api user i want to do a successful login")
    @Severity(SeverityLevel.BLOCKER)
    public void aUnsuccessfulLoginTests() {
        unsuccessfulLoginResponse().
                then().
                assertThat().
                statusCode(display_Unsuccessful_Login_Status_Code).
                body("error", containsStringIgnoringCase("Missing password"));
        //body("updatedAt", notNullValue());

    }
    @Description("As an api user i want to find a single user")
    @Severity(SeverityLevel.BLOCKER)
    public void fSingleResourceTests() {
        singleResourceResponse().
                then().
                assertThat().
                statusCode(display_Single_Resource_Status_Code);
               // body("name", containsStringIgnoringCase("fuchsia rose"));
        //body("updatedAt", notNullValue());

    }
    @Description("As an api user i don't want to find a single user")
    @Severity(SeverityLevel.BLOCKER)
    public void gSingleResourceNotFoundTests() {
        singleResourceNotFoundResponse().
                then().
                assertThat().
                statusCode(display_Single_Resource_Not_Found_Status_Code);
        // body("name", containsStringIgnoringCase("fuchsia rose"));
        //body("updatedAt", notNullValue());

    }
    @Description("As an api user i don't want to find a single user")
    @Severity(SeverityLevel.BLOCKER)
    public void hListResourceTests() {
        listResourcesResponse().
                then().
                assertThat().
                statusCode(display_List_Resources_Status_Code);
        // body("name", containsStringIgnoringCase("fuchsia rose"));
        //body("updatedAt", notNullValue());

    }
}
