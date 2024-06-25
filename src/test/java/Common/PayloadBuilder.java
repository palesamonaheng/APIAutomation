package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static Common.AuthorizationCredentials.apiKey;
import static Common.AuthorizationCredentials.apiValue;
import static Common.RequestBuilder.APIKey;
import static Common.RequestBuilder.StationID;

public class PayloadBuilder {

    //START OF REQRES API PAYLOADS
    public static JSONObject createEmployeeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Nkosi");
        jsonObject.put("job", "Test");
        return jsonObject;
    }
    public static JSONObject updateSingleEmployeeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Nkosi");
        jsonObject.put("job", "Update Testing");
        jsonObject.put("updatedAt", "2024-06-13T17:40:52.269Z");
        return jsonObject;
    }

    public static JSONObject deleteSingleEmployeeObject() {
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
  //START OF DOGS API PAYLOADS


    //STARTING WEATHER API PAYLOADS
    public static JSONObject registerWeatherStationObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST002");
        jsonObject.put("name", "Group 2 Station");
        jsonObject.put("latitude", 37.76);
        jsonObject.put("longitude", -122.43);
        jsonObject.put("altitude", 150);
        System.out.println("API key: " + apiKey);
        System.out.println("API key value: " + apiValue);
        return jsonObject;
    }

    public static JSONObject updateWeatherStationInfoObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", StationID);
        return jsonObject;
    }/*
    public static JSONObject deleteWeatherStationInfoObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", StationID);
        return jsonObject;
    }
    public static JSONObject negativeRegisterWeatherStationObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "");
        jsonObject.put("name", "Group 2 Station");
        //STILL TO CHANGE THESE FROM STRING TO INTERGERS
        jsonObject.put("latitude", "37.76");
        jsonObject.put("longitude", "-122.43");
        jsonObject.put("altitude", "150");
        return jsonObject;
    }

     */
}
