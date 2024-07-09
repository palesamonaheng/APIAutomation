package Tests.WeatherApi;

import io.qameta.allure.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import static Common.WeatherRequestBuilder.*;
import static org.hamcrest.Matchers.*;
import static Common.StatusCodesData.*;
import static Common.GenerateTestData.*;

@Test
@Feature("Weather API")
@Story("Create new weather station")
public class weatherapi {
    @Description("As an api user i want to create a new weather station")
    @Severity(SeverityLevel.CRITICAL)
    public void createWeatherStationsApi() {
        createWeatherStationResponse().then().
                assertThat().
                statusCode(Create_Success_Status_Code).
                body("created_at", notNullValue()).
               // body("longitude", contains(logituteValue)).
                body("external_id", containsStringIgnoringCase(external_id_name)).
                body("name", containsStringIgnoringCase(stationName)).
                body("user_id", notNullValue());
    }

    @Test(dependsOnMethods = "createWeatherStationsApi()")
    @Feature("Get weather Stations")
    @Story("Get weather Stations created")
    @Description("As an employer want to get all created weather stations")
    @Severity(SeverityLevel.BLOCKER)
    public void getWeatherStations() {
        getStations().then().assertThat().
                body("id", notNullValue()).
                // body("created_at", notNullValue()).
                //   body("external_id",containsStringIgnoringCase( "Mak_TEST002")).
                        statusCode(get_Status_Code_200);
    }

    @Test(priority = 2)
    @Feature("Update  weather Stations")
    @Story("Update weather Stations created")
    @Description("As an employer want to be able to update weather stations")
    @Severity(SeverityLevel.BLOCKER)
    public void updateWeatherStations() {
        updateStationsInfo().then().assertThat().
                body("external_id", containsStringIgnoringCase(external_id_name)).
                body("name", containsStringIgnoringCase(stationName)).
                body("latitude", equalToObject(38.76F)).
                body("longitude", equalTo(-145.43F)).
                body("altitude", equalTo(-190)).
                statusCode(get_Status_Code_200);
    }

    @Test(priority = 3)
    @Feature("Get updated weather Stations")
    @Story("Get updated weather Stations created")
    @Description("As an employer want to get all updated weather stations")
    @Severity(SeverityLevel.BLOCKER)
    public void getNewUpdated() {
        getUpdatedStations().then().assertThat().
                body("id", notNullValue()).
                body("updated_at", notNullValue()).
                //   body("external_id",containsStringIgnoringCase( "Mak_TEST002")).
                        statusCode(get_Status_Code_200);
    }

    // @AfterTest
    @Test(priority = 4)
    @Feature("Delete  weather Stations")
    @Story("Delete weather Stations created")
    @Description("As an employer want to be able to delete weather stations")
    @Severity(SeverityLevel.BLOCKER)
    public void deleteStation() {
        deleteStationsInfo().then().statusCode(no_content_found);
    }

    @Test(priority = 5)
    @Feature("Get error status when Station ID is removed weather Stations")
    @Story("Get error message when fecthing a deteted weather Stations ")
    @Description("As an employer want to get validate error message of the deleted stations")
    @Severity(SeverityLevel.BLOCKER)
    public void getErrorStatusAfterDeleted() {
        getDeletedStations().then().assertThat().
                body("code", equalToObject(404001)).
                body("message", containsStringIgnoringCase("Station not found")).
                //   body("external_id",containsStringIgnoringCase( "Mak_TEST002")).
                        statusCode(get_Success_Status_Code);
    }
}
