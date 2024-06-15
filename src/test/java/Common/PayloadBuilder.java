package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PayloadBuilder {

    //START OF REQRES API PAYLOADS
    public static JSONObject createEmployeeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Nkosi");
        jsonObject.put("job", "Test");
        return jsonObject;
    }
    public static JSONObject getListOfEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject getSingleEmployeeObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject updateSingleEmployeeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", "Nkosi");
        jsonObject.put("job", "Update Testing");
        jsonObject.put("updatedAt", "2024-06-13T17:40:52.269Z");
        return jsonObject;
    }
    public static JSONObject deleteSingleEmployeeObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject singleEmployeeNotFoundObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject putSuccessfulRegisterObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "eve.holt@reqres.in");
        jsonObject.put("password", "pistol");
        return jsonObject;
    }
    public static JSONObject putUnsuccessfulRegisterObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "sydney@fife");
        return jsonObject;
    }
    public static JSONObject successfulLoginObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "eve.holt@reqres.in");
        jsonObject.put("password", "cityslicka");
        return jsonObject;
    }
    public static JSONObject unsuccessfulLoginObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "peter@klaven");
        return jsonObject;
    }
    public static JSONObject singleResourceObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject singleResourceNotFoundObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject listResourcesObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    //START OF DOGS API PAYLOADS

    public static JSONObject getListOfAllBreedsObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject getSingleRandomImageObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject getMultipleRandomImageObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject getDogsImagesByBreedObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject getRandomImagesFromBreedObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject getMultipleImagesFromBreedObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject getListOfAllSubBreedsObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject getListOfAllSubBreedImagesObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject getSingleRandomImageSubBreedObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject getMultipleRandomImageSubBreedObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject getBreedListObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    //STARTING WEATHER API PAYLOADS
}
