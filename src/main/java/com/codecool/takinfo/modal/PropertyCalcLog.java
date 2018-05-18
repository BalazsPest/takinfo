package com.codecool.takinfo.modal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PropertyCalcLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    double gpsLongitude;

    double gpsLangitude;

    int propertyPrice;

    int squareMeter;

    public double getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(double gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public double getGpsLangitude() {
        return gpsLangitude;
    }

    public void setGpsLangitude(double gpsLangitude) {
        this.gpsLangitude = gpsLangitude;
    }

    public int getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(int propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PropertyCalcLog() {
    }

    public PropertyCalcLog(double gpsLongitude, double gpsLangitude, int propertyPrice, int squareMeter) {
        this.gpsLongitude = gpsLongitude;
        this.gpsLangitude = gpsLangitude;
        this.propertyPrice = propertyPrice;
        this.squareMeter = squareMeter;
    }
}
