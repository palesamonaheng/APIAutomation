package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static Common.RequestBuilder.StationID;

public class PayloadBuilder {
    public static JSONObject createEmployeeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Allettah");
        jsonObject.put("job", "Test Analyst");

        return jsonObject;

    }
//
    public static JSONObject updateSingleEmployeeObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Allettah");
        jsonObject.put("job", "Test Engineer");
        return jsonObject;
    }
//    public static JSONObject deleteSingleEmployeeObject(){
//        JSONObject jsonObject = new JSONObject();
//        return jsonObject;
//    }
//// Dogs API
    public static JSONObject getListOfAllBreedsObject() {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject registerWeatherStationObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST002");
        jsonObject.put("name", "Group 2 Station");
        jsonObject.put("latitude", 37.76);
        jsonObject.put("longitude", -122.43);
        jsonObject.put("altitude", 150);
        return jsonObject;
    }
    public static JSONObject updateWeatherStationInfoObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", StationID);
        return jsonObject;
    }
    public static JSONObject deleteWeatherStationInfoObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", StationID);
        return jsonObject;
    }

}
