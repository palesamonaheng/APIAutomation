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

    @Description("As an api user i want to get a list of employees")
    @Severity(SeverityLevel.CRITICAL)
    public void getListOfEmployeeTests() {
        getListOfEmployeeResponse().
                then().
                assertThat().
                statusCode(GetUser_List_Success_Status_Code).
        body("id", notNullValue()).
        body("email", notNullValue()).
        body("first_name", notNullValue()).
        body("last_name", notNullValue()).
        body("avatar", notNullValue());
    }

    @Description("As an api user i want to get a single employee details")
    @Severity(SeverityLevel.CRITICAL)
    public void getSingleEmployeeTests() {
        getSingleEmployeeResponse().
                then().
                assertThat().
                statusCode(Get_Single_User_Success_Status_Code);
        // body("id", notNullValue()).
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
        //body("name", containsStringIgnoringCase("Nkosi")).
        //body("job", containsStringIgnoringCase("Update Testing")).
        //body("updatedAt", notNullValue());

    }

    @Description("As an api user i want to update a single employee details")
    @Severity(SeverityLevel.NORMAL)
    public void zdeleteSingleEmployeeTests() {
        deleteSingleEmployeeResponse().
                then().
                assertThat().
                statusCode(delete_Single_User_Success_Status_Code);
    }

    @Description("As an api user i want to update a single employee details")
    @Severity(SeverityLevel.BLOCKER)
    public void singleEmployeeNotFoundTests() {
        singleEmployeeNotFoundResponse().
                then().
                assertThat().
                statusCode(get_Single_User_Not_Found_Status_Code);
        //body("job", containsStringIgnoringCase("Update Test")).
        //body("updatedAt", notNullValue());

    }
}
