/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicleaccidentsreport;

/**
 *
 * @author brook
 */
public class RoadAccidentReport {

    public class RoadAcciddent extends Accidents {
    public RoadAcciddentString accidentVechicleType, int accidentTotal, String city) {
        super(accidentVechicleType, accidentTotal, city);
    }

    @Override
    public void PrintAccidents() {
        System.out.println("Accident Vechicle Type: " + getAccidentVechicleType());
        System.out.println("Accident Total: " + getAccidentTotal());
        System.out.println("City: " + getCity());
    }
    }

}
