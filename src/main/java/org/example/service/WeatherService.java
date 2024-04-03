package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.DAO.LocationDao;
import org.example.domain.Location;
import org.example.mapper.LocationMapper;
import org.example.openAPI.APIResult;
import org.example.openAPI.openAPIRequest;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@RequiredArgsConstructor
@Service
public class WeatherService {
    private final LocationMapper locationMapper;
    private final openAPIRequest openAPIRequest;

    public LocationDao searchLocation(String city, String district, String neighborhood){
       return locationMapper.find(city, district, neighborhood);
//        openAPIRequest.openAPIRequestHttp(findLocation.getNx(), findLocation.getNy());
    }
    public JSONObject httpResultJSON(LocationDao location){
        APIResult apiResult =openAPIRequest.SrtNcst(location.getNx(), location.getNy());
        return apiResult.plusJson(apiResult.calculateWindChill());
    }
}
