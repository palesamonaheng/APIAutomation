package Tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import static Common.CoomonTestData.Create_Success_Status_Code;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static Common.CoomonTestData.Create_Success_Status_Code2;
import static Common.CoomonTestData.Create_Success_Status_Code3;


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
                body("name", containsStringIgnoringCase("Nkosi"));
    }
       @Test
       @Feature("ReqRes")
       @Story("put some details")

           @Description("As an api user i want to add some details of a employee")
           @Severity(SeverityLevel.CRITICAL)
           public void putEmployeeTests() {
               putEmployeeResponse().
                       then().
                       assertThat().
                       statusCode(Create_Success_Status_Code2);

           }
    @Test
    @Feature("ReqRes")
    @Story("patch some details")

    @Description("As an api user i want to patch surname of Employee")
    @Severity(SeverityLevel.CRITICAL)
    public void patchEmployeeTests() {
        patchEmployeeResponse().
                then().
                assertThat().
                statusCode(Create_Success_Status_Code3);

    }

           @Test
           public void test() {
               System.out.println("ID FROM THE POST" + EmpoyeeID);
           }
       }
