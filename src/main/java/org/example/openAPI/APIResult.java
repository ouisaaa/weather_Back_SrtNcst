package org.example.openAPI;

import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class APIResult {
    private JSONArray jsonArray;
    private WindChill windChill = new WindChill();

    public APIResult(JSONArray jsonArray){
        this.jsonArray=jsonArray;
    }

    //openAPI 응답값 + 체감온도 형태의 JSON
    public JSONObject plusJson(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("response_source","SrtNcst");
        jsonObject.put("weather_data",jsonArray);
        jsonObject.put("Wind_Chill",windChill.calculateWindChill(jsonArray));

        return jsonObject;
    }

}
