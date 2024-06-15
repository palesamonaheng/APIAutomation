package Common;

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
    public static JSONObject putEmployeeObject() {
        JSONObject jsonObject = new  JSONObject();
        jsonObject.put("name", "Nkosi");
        jsonObject.put("job", "Test Analyst");
        return jsonObject;

    }
    public static JSONObject patchEmployeeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Nkosi");
        jsonObject.put("job", "Test Analyst");
        jsonObject.put("surname", "cele");
        return jsonObject;
    }
}