package Tests.WeatherApi;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.*;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.hamcrest.Matchers.notNullValue;
@Test
@Feature("ReqRes")
@Story("Create new employee")
public class WeatherAPITests {


    @Description("As an api user i want to create a new weather station")
    @Severity(SeverityLevel.CRITICAL)
    public void registerWeatherStationTests() {
                    registerWeatherStationResponse().
                then().
                assertThat().
                statusCode(register_Weather_Station).
                body("ID", notNullValue()).
                body("updated_at", notNullValue()).
                body("user_id", containsStringIgnoringCase("666097c0c9e2270008f0a657")).
                body("external_id", containsStringIgnoringCase("SF_TEST002")).
                body("name", containsStringIgnoringCase("Registered Weather Station 1"));
               // body("latitude", equals(37.76)).
                //body("longitude", containsStringIgnoringCase("-122.43")).
               // body("altitude", containsStringIgnoringCase("150")).
                //body("rank", containsStringIgnoringCase("10")).
                //body("source_type", containsStringIgnoringCase("5"));
    }
    @Test(priority = 1)
    @Description("As an api user i want to create a newly registered weather station")
    @Severity(SeverityLevel.CRITICAL)
    public void getNewlyRegisteredWeatherStationTests() {
        getNewlyRegisteredStationIDResponse().
                then().
                assertThat().
                statusCode(get_Newly_Registered_Weather_Station);
               // body("ID", notNullValue());
              }
    @Test(priority = 2)
    @Description("As an api user i want to update the newly registered weather station info")
    @Severity(SeverityLevel.NORMAL)
    public void updateWeatherStationInfoTests() {
        updateWeatherStationInfoResponse().
                then().
                assertThat().
                statusCode(update_Weather_Station_Info);
               //body("name", containsStringIgnoringCase("Registered Weather Station 1"));
                //body("ID", notNullValue());
    }
    @Test(priority = 3)
    @Description("As an api user i want to delete the newly registered weather station info")
    @Severity(SeverityLevel.NORMAL)
    public void deleteWeatherStationInfoTests() {
        deleteWeatherStationInfoResponse().
                then().
                assertThat().
                statusCode(delete_Weather_Station_Info);
                //body("id", notNullValue());
    }
    @Test(priority = 4)
    @Description("As an api user i want to delete the newly registered weather station info")
    @Severity(SeverityLevel.NORMAL)
    public void negativeRegisterWeatherStationInvalidExternalIDTests() {
        negativeRegisterWeatherStationInvalidExternalIDResponse().
                then().
                assertThat().
                statusCode(negative_Invalid_ExternalID_Register_Weather_Station_Info);
                //body("id", notNullValue());
    }
    @Test(priority = 5)
    @Description("As an api user i want to delete the newly registered weather station info")
    @Severity(SeverityLevel.NORMAL)
    public void negativeRegisterWeatherStationInvalidAPIKeyTests() {
        negativeRegisterWeatherStationInvalidAPIKeyResponse().
                then().
                assertThat().
                statusCode(negative_invalid_APIKey_Weather_Registration);
        //body("id", notNullValue());
    }
}
