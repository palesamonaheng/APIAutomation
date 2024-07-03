package Tests.WeatherApi;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CoomonTestData.*;
import static Common.GenerateTestData.weatherStationName;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.*;

@Test
@Feature("Weather Api")
@Story("Create New Weather Station")
public class WeatherApiTests {

    @Test
    @Description("As an Api User, I need to create a new Weather Station")
    @Severity(SeverityLevel.CRITICAL)
    public void registerWeatherStationTests(){
        registerWeatherStationResponse().
                then().
                assertThat().
                statusCode(WeatherApi_Success_Status_Code).
                body("ID",notNullValue()).
                body("updated_at",notNullValue()).
                body("created_at",notNullValue()).
                body("user_id",notNullValue()).
                body("external_id",notNullValue()).
                body("name", notNullValue()).
                body("latitude",notNullValue()).
                body("longitude", notNullValue() ).
                body("altitude", notNullValue()).
                body("rank", notNullValue()).
                body("source_type", notNullValue());

    }
    @Test(dependsOnMethods ="registerWeatherStationTests")
    @Severity(SeverityLevel.NORMAL)
    public void getRegisteredWeatherStationTests(){
        getRegisteredWeatherStationResponse().
                then().
                assertThat().
                statusCode(WeatherStation_Success_Status_Code).
                body("id",notNullValue()).
                body("updated_at",notNullValue()).
                body("created_at",notNullValue()).
                body("external_id",notNullValue()).
                body("name", notNullValue());
//                body("longitude", notNullValue()).
//                body("latitude", notNullValue()).
//                body("altitude", notNullValue());
    }

    @Test(dependsOnMethods ="getRegisteredWeatherStationTests")
    @Severity(SeverityLevel.CRITICAL)
    public void updateWeatherStationTests(){
        updateWeatherStationResponse().
                then().
                assertThat().
                statusCode(WeatherStation_Success_Status_Code).
                body("id", notNullValue()).
                body("created_at", notNullValue()).
                body("updated_at", notNullValue()).
                body("external_id", notNullValue()).
                body("name", containsStringIgnoringCase("San Francisco Updated Station")).
                body("longitude",notNullValue()).
                body("latitude", notNullValue()).
                body("altitude", notNullValue());

    }

    @Test(dependsOnMethods ="updateWeatherStationTests" )
    @Severity(SeverityLevel.CRITICAL)
    public void deleteWeatherStationTests(){
        deleteWeatherStationResponse().
                then().
                assertThat().
                statusCode(DeleteWeatherStation_Success_Status_Code);
    }
}
