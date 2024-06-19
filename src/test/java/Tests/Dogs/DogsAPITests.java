package Tests.Dogs;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.*;
import static Common.PayloadBuilder.getMultipleRandomImageObject;
import static Common.PayloadBuilder.getSingleRandomImageObject;
import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.hamcrest.core.IsNull.notNullValue;

@Test
@Feature("DogsAPITests")
@Story("Get a list of dog breeds")
public class DogsAPITests {
    @Description("As an api user i want to get a list of all dog breeds")
    @Severity(SeverityLevel.BLOCKER)
    public void aGetListOfAllBreedsTests() {
        getListOfAllBreedsResponse().
                then().
                assertThat().
                statusCode(get_List_of_All_Breeds_Status_Code).
        body("status", containsStringIgnoringCase("success")).
        body("updatedAt", notNullValue());
    }
    //@Test(priority = 1)
    @Description("As an api user i want to display single random image from all dogs collection")
    @Severity(SeverityLevel.BLOCKER)
    public void bGetSingleRandomImageTests() {
        getSingleRandomImageResponse().
                then().
                assertThat().
                statusCode(display_Single_Random_Image_Status_Code).
                body("status", containsStringIgnoringCase("success"));
          //body("data.updatedAt", notNullValue());
    }
    @Description("As an api user i want to display a multiple random image from all dogs collection")
    @Severity(SeverityLevel.CRITICAL)
    public void cGetMultipleRandomImageTests() {
        getMultipleRandomImageResponse().
                then().
                assertThat().
                statusCode(display_Multiple_Random_Image_Status_Code).
                body("status", containsStringIgnoringCase("success"));
    }
    @Description("As an api user i want to return an array of all the images from a breed, eg. hound")
    @Severity(SeverityLevel.CRITICAL)
    public void dGetDogsImagesByBreedTests() {
        getDogsImagesByBreedResponse().
                then().
                assertThat().
                statusCode(display_All_Images_By_Breed_Status_Code).
                body("status", containsStringIgnoringCase("success"));
    }
    @Description("As an api user i want to return a random dog image from a breed, e.g. hound")
    @Severity(SeverityLevel.NORMAL)
    public void eGetRandomImagesFromBreedTests() {
        getRandomImagesFromBreedResponse().
                then().
                assertThat().
                statusCode(display_Radom_Image_from_Breed_Status_Code).
                body("status", containsStringIgnoringCase("success"));
    }
    @Description("As an api user i want to return a multiple random dog image from a breed collection, e.g. hound")
    @Severity(SeverityLevel.NORMAL)
    public void fGetMultipleImagesFromBreedTests() {
        getMultipleImagesFromBreedResponse().
                then().
                assertThat().
                statusCode(display_Multiple_Images_from_Breed_Status_Code).
                body("status", containsStringIgnoringCase("success"));
    }
    @Description("As an api user i want to return an array of all the sub-breeds from a breed")
    @Severity(SeverityLevel.MINOR)
    public void gGetListOfAllSubBreedsTests() {
        getListOfAllSubBreedsResponse().
                then().
                assertThat().
                statusCode(display_List_All_Sub_Breeds_Status_Code).
                body("status", containsStringIgnoringCase("success"));
    }
    @Description("As an api user i want to return an array of all sub-breeds images from the sub-breed")
    @Severity(SeverityLevel.CRITICAL)
    public void hGetListOfAllSubBreedImagesTests() {
        getListOfAllSubBreedImagesResponse().
                then().
                assertThat().
                statusCode(display_List_All_Sub_Breeds_Images_Status_Code).
                body("status", containsStringIgnoringCase("success"));
    }
    @Description("As an api user i want to return a single random image from a sub-breed collection")
    @Severity(SeverityLevel.MINOR)
    public void iGetSingleRandomImageSubBreedTests() {
        getSingleRandomImageSubBreedResponse().
                then().
                assertThat().
                statusCode(display_Single_Random_Image_From_Sub_Breed_Status_Code).
                body("status", containsStringIgnoringCase("success"));
    }
    @Description("As an api user i want to return multiple random image from a sub-breed collection")
    @Severity(SeverityLevel.NORMAL)
    public void jGetMultipleRandomImageSubBreedTests() {
        getMultipleRandomImageSubBreedResponse().
                then().
                assertThat().
                statusCode(display_Multiple_Images_From_Sub_Breed_Status_Code ).
                body("status", containsStringIgnoringCase("success"));
    }
    @Description("As an api user i want to return a breed list")
    @Severity(SeverityLevel.NORMAL)
    public void kGetBreedListTests() {
        getBreedListResponse().
                then().
                assertThat().
                statusCode(display_Images_Of_Breed_List_Status_Code );
    }
}
