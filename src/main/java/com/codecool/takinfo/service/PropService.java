package com.codecool.takinfo.service;

import com.codecool.takinfo.modal.Property;
import com.codecool.takinfo.modal.PropertyCalcLog;
import com.codecool.takinfo.repository.PropLogRepo;
import com.codecool.takinfo.repository.PropRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PropService {

    @Autowired
    PropRepo propRepo;

    @Autowired
    PropLogRepo propLogRepo;

    public int calcPropertyPrice(int sqmeter, double longitude, double latitude){
        List<Property> propertyList = new ArrayList<>();
        propertyList = propRepo.findAll();

        double minDistance=distance(latitude,propertyList.get(0).getLatitude(),longitude,propertyList.get(0).getLongitude());
        Property samePriceProperty =propertyList.get(0);

        for (Property property:propertyList) {
            double propertyDistance = distance(latitude,property.getLatitude(),longitude,property.getLongitude());
            if(propertyDistance<minDistance){
                minDistance = propertyDistance;
                samePriceProperty = property;
            }
        }

        return samePriceProperty.getPrice()*sqmeter;
    }


    public void addPropertyLog(int price,int sqmeter,double longitude,double latitude){
        PropertyCalcLog propertyCalcLog = new PropertyCalcLog(longitude,latitude,price,sqmeter);
        propLogRepo.save(propertyCalcLog);
    }


    private static double distance(double lat1, double lat2, double lon1,
                                   double lon2) {

        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        double height = 0.0 - 0.0;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }



}
