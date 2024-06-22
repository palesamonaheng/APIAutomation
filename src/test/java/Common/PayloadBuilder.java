package Common;

import org.json.simple.JSONArray;
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

    public static JSONObject getListOfEmployeeObject() {

        JSONObject jsonObject = new JSONObject();

        return jsonObject;
    }

    public static JSONObject getSingleEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject employeeLoginSuccessObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "eve.holt@reqres.in");
        jsonObject.put("password", "cityslicka");
        return jsonObject;
    }

    public static JSONObject updateSingleEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Nkosi");
        jsonObject.put("job", "Test Analyst");
        jsonObject.put("surname", "Mthembu");
        jsonObject.put("updatedAt", "2024-06-20T19:13:46.906Z");
        return jsonObject;

    }

    public static JSONObject deleteEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject successfulRegisterObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 4);
        jsonObject.put("token","QpwL5tke4Pnpja7X4");

        return jsonObject;
    }
}
