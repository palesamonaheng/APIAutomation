package Tests.WeatherApi;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import static Common.WeatherRequestBuilder.*;
import static org.hamcrest.Matchers.*;
import static Common.CoomonTestData.*;

@Test
@Feature("Weather API")
@Story("Create new weather station")
public class WeatherAPI {
    @Description("As an api user i want to create a new weather station")
    @Severity(SeverityLevel.CRITICAL)
    public void createWeatherStationsApi()
    {
        createWeatherStationResponse().then().
            assertThat().
            statusCode(Create_Success_Status_Code).
            body("created_at", notNullValue()).
            body("external_id",containsStringIgnoringCase( "Mak_TEST003")).
                body("name",containsStringIgnoringCase( "Group Mak Testing Station")).
                body("user_id",notNullValue());
    }

    @Test(priority = 1)
    @Feature("Get weather Stations")
    @Story("Get weather Stations created")
    @Description("As an employer want to get all created weather stations")
    @Severity(SeverityLevel.BLOCKER)
    public void getWeatherStations() {
        getStations().then().assertThat().
       body("id", notNullValue()).
           body("created_at", notNullValue()).
             //   body("external_id",containsStringIgnoringCase( "Mak_TEST002"))
               statusCode(get_stations_Status_Code);
    }



}
