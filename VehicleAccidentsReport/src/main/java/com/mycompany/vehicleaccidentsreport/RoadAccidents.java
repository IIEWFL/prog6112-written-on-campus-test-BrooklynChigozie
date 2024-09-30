/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicleaccidentsreport;

/**
 *
 * @author brook
 */
public class RoadAccidents {
    public abstract class Accidents implements iRoadAccidents {
    private final int accidentTotal;
    private final String accidentVechicleType;
    private String city;
    


    public Accidents(String accidentVechicleType, int accidentTotal, String city) {
        this.accidentVechicleType = accidentVechicleType;
        this.accidentTotal = accidentTotal;
        this.city = city;
    }

    public String getVechicleType(String vechicleType) {
        return vechicleType;
    }

    public int getTotalAccidents(int totalAccidents) {
        return totalAccidents;
    }

    public String getcity() {
        return city;
    }
    }


