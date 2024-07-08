package Tests.WeatherApi;

import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Common.CoomonTestData.*;
import static Common.RequestBuilder.*;
@Test
@Feature("WeatherApi")
@Story("Create new weather")
public class PositiveWeatherAPITests {
    @Description("Getting authorization to weather stations")
    @BeforeClass
    @Severity(SeverityLevel.CRITICAL)
    public void getAuthorization() {
        authorization();
    }
    @Description("As an api user i want to get all weather stations")
    @Test()
    @Severity(SeverityLevel.CRITICAL)
    public void getWeatherStations() {
        getListWeatherStation().
                then().assertThat().statusCode(statusCode).equals(Success_Status_Code);
    }
    @Description("As an api user i want to create a new weather station")
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void createNewWeatherStation() {
        createWeatherStation().
                then().
                assertThat().
                statusCode(Create_Success_Status_Code);
    }
    @Description("As an api user i want to get the new weather station")
    @Test(dependsOnMethods = {"createNewWeatherStation"})
    @Severity(SeverityLevel.CRITICAL)
    public void getNewWeatherStation() {
        getNewStation();
    }
    @Description("As an api user i want to update the new weather station")
    @Test(dependsOnMethods = {"getNewWeatherStation"})
    @Severity(SeverityLevel.CRITICAL)
    public void updateWeatherStation() {
        updateNewWeatherStation().
                then().
                assertThat().
                statusCode(Success_Status_Code);
    }
    @Description("As an api user i want to delete the new weather station")
    @Test(dependsOnMethods = {"updateWeatherStation"})
    @Severity(SeverityLevel.CRITICAL)
    public void deleteWeatherStation() {
        deleteNewStation().
                then().
                assertThat().
                statusCode(No_Content_status_code);
    }
}
