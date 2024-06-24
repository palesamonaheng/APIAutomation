package Tests.Dogs;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static Common.CoomonTestData.GetListOfAllBreeds_Success_Status_Code;
import static Common.CoomonTestData.GetSingleDogRandomImages_Success_Status_Code;
import static Common.RequestBuilder.getListOfAllBreedsResponse;
import static Common.RequestBuilder.getSingleDogRandomImagesResponse;
import static org.hamcrest.Matchers.*;

public class DogsApiTests {

    @Test
    @Description("As an Api User, I need to get a list of all Dog Breeds")
    public void getListOfAllBreedsTests(){
        getListOfAllBreedsResponse().
                then().
                assertThat().
                statusCode(GetListOfAllBreeds_Success_Status_Code).
                body("message",notNullValue()).
                body("status", containsStringIgnoringCase("success"));

    }

    @Test
    @Description("As an Api user, I need to get single dog random images")
    public void getSingleDogRandomImagesTests(){
        getSingleDogRandomImagesResponse().
                then().
                assertThat().
                statusCode(GetSingleDogRandomImages_Success_Status_Code).
                body("message",notNullValue()).
                body("status", containsStringIgnoringCase("success"));




    }

}
