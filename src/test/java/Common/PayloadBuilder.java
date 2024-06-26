package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import static Common.RequestBuilder.EmployeeID;
import static Common.WeatherRequestBuilder.StationID;
import static Common.WeatherRequestBuilder.getStations;
import static Common.RequestBuilder.getEmployeeResponse;

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

    public static JSONObject createWeatherObject()

        {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("external_id", "Mak_TEST003");
            jsonObject.put("name", "Group Mak Testing Station");
            jsonObject.put("latitude", 33.76);
            jsonObject.put("longitude", -123.43);
            jsonObject.put("altitude", 1350);
            return jsonObject;
        }

        public static JSONObject getWeatherStations ()
        {
            JSONObject jsonObject = new JSONObject();
            jsonObject.get(StationID);
            return jsonObject;
        }

}
