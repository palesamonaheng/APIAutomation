package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PayloadBuilder {
    public static JSONObject createEmployeeObject() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Allettah");
        jsonObject.put("job", "Test Analyst");

        return jsonObject;

    }
    public static JSONObject getListOfEmployeesObject(){
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    public static JSONObject getSingleEmployeeObject(){
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
    public static JSONObject updateSingleEmployeeObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Allettah");
        jsonObject.put("job", "Test Engineer");
        return jsonObject;
    }
    public static JSONObject deleteSingleEmployeeObject(){
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }





}
