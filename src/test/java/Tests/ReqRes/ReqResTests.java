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
    @Description("As an api user i want to get a list of employees")
    @Severity(SeverityLevel.CRITICAL)
    public void getListOfEmployeeTests() {
        getListOfEmployeeResponse().
                then().
                assertThat().
                statusCode(Create_User_List_Success_Status_Code);
               //body("avatar", containsStringIgnoringCase("https://reqres.in/img/faces/2-image.jpg"));
               // body("id", notNullValue());
    }
    @Description("As an api user i want to get a single employee details")
    @Severity(SeverityLevel.CRITICAL)
    public void getSingleEmployeeTests() {
        getSingleEmployeeResponse().
                then().
                assertThat().
                statusCode(Create_User_List_Success_Status_Code);
        //body("avatar", containsStringIgnoringCase("https://reqres.in/img/faces/2-image.jpg"));
        // body("id", notNullValue());
    }

    @Description("As an api user i want to update a single employee details")
    @Severity(SeverityLevel.NORMAL)
    public void updateSingleEmployeeTests() {
        updateSingleEmployeeResponse().
                then().
                assertThat().
                statusCode(Update_Single_User_Success_Status_Code);
                //body("job", containsStringIgnoringCase("Update Test")).
               //body("updatedAt", notNullValue());

            }
}
