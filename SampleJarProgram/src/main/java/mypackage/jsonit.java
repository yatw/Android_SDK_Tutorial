package mypackage;

import com.google.gson.Gson;

public class jsonit {

    public static String toJSONString(Object obj){

        Gson gson = new Gson();

        String jsonInString = gson.toJson(obj);

        return jsonInString;
    }

}
