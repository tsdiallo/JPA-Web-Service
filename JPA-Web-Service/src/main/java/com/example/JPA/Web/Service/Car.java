package com.example.JPA.Web.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Car {
    String plateNumber;
    long key;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber){
        this.plateNumber = plateNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getKey(){
        return key;
    }

    public void setKey(long Key){
        this.key = key;
    }

}
