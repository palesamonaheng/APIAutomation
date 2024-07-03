package Common;

import org.json.simple.JSONObject;

import static Common.GenerateTestData.weatherStationName;
import static Common.QuerryParameterBuilder.ApiKey;
import static Common.QuerryParameterBuilder.apiValue;

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

    public static JSONObject employeeUnsuccessfulloginObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "peter@klaven");
        return jsonObject;

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
        jsonObject.put("password", "pistol");

        return jsonObject;
    }

    public static JSONObject singleUserNotFoundObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    //Dogs Api Payloads

    public static JSONObject getListOfAllBreedsObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject getSingleDogRandomImagesObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject getDogsByBreedObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject getDogsBySubBreedObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject getBreedsListObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    //WeatherAPI Payloads

    public static JSONObject registerWeatherStationObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST002");
        jsonObject.put("name", weatherStationName);
        jsonObject.put("latitude", 37.76);
        jsonObject.put("longitude", -122.43);
        jsonObject.put("altitude", 150);
        System.out.println(ApiKey);
        System.out.println(apiValue);

        return jsonObject;
    }

    public static JSONObject updateWeatherStationObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_UPD001");
        jsonObject.put("name", "San Francisco Updated Station");
        jsonObject.put("latitude", 37.80);
        jsonObject.put("longitude",  -122.47);
        jsonObject.put("altitude",143);

        return jsonObject;
    }

}
