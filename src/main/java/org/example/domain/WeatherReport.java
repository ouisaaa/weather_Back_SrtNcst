//package org.example.domain;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Getter
//@Document(collection ="weather_report")
//public class WeatherReport {
//   // private String locale="KO_KR";
//    private String baseDate;
//    private String baseTime;
//    private int nx;
//    private int ny;
//    private List<WeatherDataItem> weatherData=new ArrayList<>();
//
//    public WeatherReport(JSONObject jsonObject){
//        JSONArray weather_data= jsonObject.getJSONArray("weather_data");
//        JSONObject wind_chill_data= jsonObject.getJSONObject("Wind_Chill");
//
//        baseDate=weather_data.getJSONObject(0).getString("baseDate");
//        baseTime=weather_data.getJSONObject(0).getString("baseTime");
//        nx=weather_data.getJSONObject(0).getInt("nx");
//        ny=weather_data.getJSONObject(0).getInt("ny");
//
//
//        for(int i=0;i<weather_data.length();i++){
//            weatherData.add(
//                    new WeatherDataItem(weather_data.getJSONObject(i).getString("category")
//                            ,weather_data.getJSONObject(i).getString("obsrValue"))
//            );
//        }
//        weatherData.add(new WeatherDataItem("WindChill",String.valueOf(wind_chill_data.getDouble("obsrValue"))));
//
//    }
//
//}
