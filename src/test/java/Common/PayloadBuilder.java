package Common;

import org.json.simple.JSONArray;
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

//    public static JSONObject getListOfEmployeeObject() {
//
//        JSONObject jsonObject = new JSONObject();
//
//        return jsonObject;
//    }

//    public static JSONObject getSingleEmployeeObject() {
//
//        JSONObject jsonObject = new JSONObject();
//        return jsonObject;
//    }

    public static JSONObject employeeLoginSuccessObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "eve.holt@reqres.in");
        jsonObject.put("password", "cityslicka");
        return jsonObject;
    }

    public static JSONObject employeeUnsuccessfulloginObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "peter@klaven");
        return  jsonObject;

    }
    public static JSONObject updateSingleEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Nkosi");
        jsonObject.put("job", "Test Analyst");
        jsonObject.put("surname", "Cele");
        return jsonObject;

    }

    public static JSONObject deleteEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject successfulRegisterObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "eve.holt@reqres.in");
        jsonObject.put("password","pistol");

        return jsonObject;
    }

    public static JSONObject singleUserNotFoundObject(){
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    //Dogs Api Payloads

    public static JSONObject getListOfAllBreedsObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject getSingleDogRandomImagesObject(){
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject getDogsByBreedObject(){
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject getDogsBySubBreedObject(){
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject getBreedsListObject(){
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
}
