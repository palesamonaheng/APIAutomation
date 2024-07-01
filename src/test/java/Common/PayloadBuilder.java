package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import static Common.RequestBuilder.EmployeeID;
//import static Common.WeatherRequestBuilder.StationID;
import static Common.WeatherRequestBuilder.getStations;
import static Common.RequestBuilder.getEmployeeResponse;
import static Common.BasePaths.*;

public class PayloadBuilder {
    public static JSONObject createEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Mak");
        jsonObject.put("job", "Data Analyst");
        return jsonObject;

    }

    public static JSONObject getEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.get(EmployeeID);
        return jsonObject;

    }

    public static JSONObject updateEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        return jsonObject;

    }

    public static JSONObject createWeatherObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "Mak_TEST003");
        jsonObject.put("name", "Group Mak Testing Station");
        jsonObject.put("latitude", 33.76);
        jsonObject.put("longitude", -123.43);
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
        jsonObject.put("external_id", "MakTesting_TEST004");
        jsonObject.put("name", "Group Weather Station");
        jsonObject.put("latitude", 35.76);
        jsonObject.put("longitude", -145.43);
        jsonObject.put("altitude", -190);
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

    public static JSONObject createWeatherWithoutExternalID()
    {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "");
        jsonObject.put("name", "Group Testing Station");
        jsonObject.put("latitude", 33.76);
        jsonObject.put("longitude", -123.43);
        jsonObject.put("altitude", 150);
        return jsonObject;
    }
}
