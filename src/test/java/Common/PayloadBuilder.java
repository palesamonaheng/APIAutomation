package Common;

import org.json.simple.JSONObject;


public class PayloadBuilder {
    public static JSONObject createEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Alvin");
        jsonObject.put("job", "Test Analyst");

        return jsonObject;

    }

    public static JSONObject putEmployeeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Alvin");
        jsonObject.put("job", "Software Engineer");
        jsonObject.put("surname", "Chiweshe");

        return jsonObject;


    }

    public static JSONObject patchEmployeeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Alvin");
        jsonObject.put("job", "Software Engineer (QE)");
        jsonObject.put("surname", "Chiweshe");

        return jsonObject;

    }

}
