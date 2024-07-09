package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import static Common.BasePath.*;
import static Common.GenerateTestData.*;


public class PayloadBuilder {


    public static JSONObject createWeatherObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", external_id_name);
        jsonObject.put("name", stationName);
        jsonObject.put("latitude", 56.78F);
        jsonObject.put("longitude", 96.78F);
        jsonObject.put("altitude", 150);
        return jsonObject;
    }

    public static JSONObject getWeatherStations() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.get(StationID);
        return jsonObject;
    }

    public static JSONObject updateWeatherObjectStations() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", external_id_name);
        jsonObject.put("name", stationName);
        jsonObject.put("latitude", 38.76);
        jsonObject.put("longitude", -145.43);
        jsonObject.put("altitude", -190);
       /* jsonObject.put("external_id", "MakTesting_TEST004");
        jsonObject.put("name", stationName);

        jsonObject.put("altitude", -190);*/
        return jsonObject;
    }

    public static JSONObject getUpdatedWeatherStations() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.get(StationID);
        return jsonObject;
    }

    public static JSONObject deleteWeatherStations() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.get(StationID);
        return jsonObject;
    }

    public static JSONObject deleteWeatherStationsError() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.get(StationID);
        return jsonObject;
    }

}
