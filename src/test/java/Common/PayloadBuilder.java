package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static Common.AuthorizationCreds.apiKey;
import static Common.AuthorizationCreds.apiValue;

public class PayloadBuilder {
    public static JSONObject createEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Nkosi");
        jsonObject.put("job", "Test");

        return jsonObject;

    }

    public static JSONObject registerWeatherStationOBJ () {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("external_id", "SF_TEST002");
        jsonObject.put("name", "Registered Weather Station 1");
        jsonObject.put("latitude", 37.76);
        jsonObject.put("longitude", -122.43);
        jsonObject.put("altitude", 150);

        return jsonObject;
    }
}
