package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.DAO.LocationDao;
import org.example.domain.Location;
//import org.example.domain.WeatherReport;
import org.example.mapper.LocationMapper;
import org.example.openAPI.APIResult;
import org.example.openAPI.openAPIRequest;
//import org.example.repository.ReportRepository;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@RequiredArgsConstructor
@Service
public class WeatherService {
    private final LocationMapper locationMapper;
    private final openAPIRequest openAPIRequest;
//    private final ReportRepository reportRepository;

    public LocationDao searchLocation(String city, String district, String neighborhood){
       return locationMapper.find(city, district, neighborhood);
//        openAPIRequest.openAPIRequestHttp(findLocation.getNx(), findLocation.getNy());
    }
    public JSONObject httpResultJSON(LocationDao location, String nowDate,String nowTime){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate yesterday = LocalDate.parse(nowDate,format);
        yesterday.minusDays(1);

        APIResult apiResult =openAPIRequest.SrtNcst(location.getNx(), location.getNy(),nowDate,nowTime);

        return apiResult.plusJson();
    }

//    public void writeWeatherReport(JSONObject jsonObject){
//        WeatherReport weatherReport = new WeatherReport(jsonObject);
//        if(reportRepository.findByBaseDateAndBaseTimeAndNxAndNy(
//                weatherReport.getBaseDate(),
//                weatherReport.getBaseTime(),
//                weatherReport.getNx(),
//                weatherReport.getNy()
//                )!=null){
//            reportRepository.save(weatherReport);
//        }
//    }

}
