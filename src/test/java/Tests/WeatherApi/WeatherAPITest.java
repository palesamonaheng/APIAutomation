package Tests.WeatherApi;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;


import static Common.CoomonTestData.Create_Success_Status_Code;
import static Common.CoomonTestData.Success_Status_Code;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.hamcrest.Matchers.notNullValue;


@Test
public class WeatherAPITest {

    @Description("As an api user i want to create a new weather station")
    @Severity(SeverityLevel.CRITICAL)
    public void createNewWeatherStation() {
        registerWeatherStationResponse().
                then().
                assertThat().
                statusCode(Create_Success_Status_Code);
//                body("name", containsStringIgnoringCase("Nkosi")).
//                body("job", containsStringIgnoringCase("Test")).
//                body("id", notNullValue()).
//                body("createdAt", notNullValue());
    }

    @Description("As an api user i want to create a new weather station")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyGetNewlyCreatedStation() {
        getNewlyCreatedStation().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }
}
