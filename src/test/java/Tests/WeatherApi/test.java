package Tests.WeatherApi;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CoomonTestData.Create_Success_Status_Code;
import static Common.CoomonTestData.Success_Status_Code;
import static Common.RequestBuilder.*;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.StringContains.containsStringIgnoringCase;

@Test
@Feature("Weather API")
@Story("Register Weather Station")
public class test {

    public void registerWeatherStationTests() {
        registerWeatherStationResponse().
                then().
                assertThat().
                statusCode(Create_Success_Status_Code).
                body("ID", notNullValue()).
                body("updated_at", notNullValue()).
                body("user_id", containsStringIgnoringCase("666097c0c9e2270008f0a657")).
                body("external_id", containsStringIgnoringCase("SF_TEST002")).
                body("name", containsStringIgnoringCase("Group 2 Station"));
    }
    @Test(dependsOnMethods = "registerWeatherStationTests")
    @Description("As an api user i want to update the newly registered weather station info")
    @Severity(SeverityLevel.NORMAL)
    public void updateWeatherStationInfoTests() {
        updateWeatherStationInfoResponse().
                then().
                assertThat().
                statusCode(Create_Success_Status_Code).
                body("id", notNullValue());
    }
    @Test(dependsOnMethods = "updateWeatherStationInfoTests")
    @Description("As an api user i want to delete the newly registered weather station info")
    @Severity(SeverityLevel.NORMAL)
    public void deleteWeatherStationInfoTests() {
        deleteWeatherStationInfoResponse().
                then().
                assertThat().
                statusCode(Success_Status_Code).
                body("id", notNullValue());
    }
}
