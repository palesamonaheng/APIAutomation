package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import static Common.RequestBuilder.EmployeeID;
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


}
