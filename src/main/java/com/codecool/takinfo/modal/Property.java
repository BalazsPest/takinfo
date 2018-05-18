package com.codecool.takinfo.modal;

import com.codecool.takinfo.service.PropService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Property {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int price;

    private double latitude;

    private double longitude;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    public Property(){}

    public Property(int price,double longitude,double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
        this.price = price;
    }

}
