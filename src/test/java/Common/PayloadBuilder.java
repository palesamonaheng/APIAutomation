package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PayloadBuilder {
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
}
