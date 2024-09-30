/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roadaccidents;
import java.util.Arrays;

/**
 *
 * @author brook
 */
public class RoadAccidents {
    public static void main(String[] args) {
        // Initialize the 2D array with delivery data
        int[][] accidents = {
            {155, 121}, // Cape Town
            {178, 145}, // Johannesburg
            {112, 89}  // Port Elizebeth
        };

        // Variables to store statistics
        int totalAccidents = 0;
        int maxAccidents = Integer.MIN_VALUE;
        int minAccidents = Integer.MAX_VALUE;

        // Calculate total, max, and min deliveries
        for (int i = 0; i < accidents.length; i++) {
            for (int j = 0; j < accidents[i].length; j++) {
                totalAccidents += accidents[i][j];
                if (accidents[i][j] > maxAccidents) {
                    maxAccidents = accidents[i][j];
                }
            }
        }

        // Display the accidents report
        System.out.println("Accident Report of three major cities in South Africa:");
        System.out.println("Cities\tCar\tMotorbike");
        System.out.println("Cape Town\t" + accidents[0][0] + "\t" + accidents[0][1]);
        System.out.println("Johannesburg\t" + accidents[1][0] + "\t" + accidents[1][1]);
        System.out.println("Port Elizabeth\t" + accidents[2][0] + "\t" + accidents[2][1]);

        // Display the statistics
        System.out.println("\nAccident Statistics:");
        System.out.println("Total Accidents: " + totalAccidents);
        System.out.println("Maximum Accidents: " + maxAccidents);
    }
}



    
    
    

