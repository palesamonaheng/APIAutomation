package Common;

import org.json.simple.JSONObject;

public class PayloadBuilder {
    //Weather API builder for positive tests
    public static JSONObject createWeatherObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST001");
        jsonObject.put("name", "San Francisco Test Station");
        jsonObject.put("latitude", 37.76);
        jsonObject.put("longitude", -122.43);
        jsonObject.put("altitude", 150);
        return jsonObject;

    }
    public static JSONObject updateWeatherObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id",  "PC_TESTING");
        jsonObject.put("name", "Los Angeles Test Station");
        jsonObject.put("altitude", 140);
        return jsonObject;
    }
    public static JSONObject deleteNewWeatherObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.clear();

        return jsonObject;

    }
    //Weather API builder for positive tests
    public static JSONObject BlankStationName() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST001");
        jsonObject.put("name", "");
        jsonObject.put("latitude", 37.76);
        jsonObject.put("longitude", -122.43);
        jsonObject.put("altitude", 150);
        return jsonObject;

    }
    //Reqres API test data creation
    public static JSONObject createEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Nkosi");
        jsonObject.put("job", "Test");

        return jsonObject;

    }
    public static JSONObject updateEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Palesa");
        jsonObject.put("job", "Intermidiate Test Analyst");

        return jsonObject;

    }
    public static JSONObject deleteEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.clear();

        return jsonObject;

    }
}
