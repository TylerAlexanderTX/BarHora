package com.barhora.android.barhora;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tyler on 1/28/2016.
 */
public final class Database {

    public static List<Bar> barList = new ArrayList<>();
    public static Map<String, Bar> barMap = new HashMap<>();


    /*
    Name, Hours, Description, City, ZipCode, Address
    saveLocation("","","","","","");
     */
    static {
        saveLocation("On The Border", "Happy Hour: M-F 3-7pm,\nSunday-Thursday 9-11\nWednesday: $3 Margaritas", "Mexican Food", "College Station", "77840","Texas Ave, College Station, TX 77340");
        saveLocation("BJ's Restaurant & Brewhouse", "Happy Hour: M-F 3-7pm,\nSunday-Thursday 9-11", "Burgers and American", "The Woodlands", "77385","19075 IH-45 S #600, Shenandoah, TX 77385");
        saveLocation("Baker St. Pub & Grill","Happy Hour: PENDING","Pub with popular happy hour, occasional live music, and games!","The Woodlands","77380","25 Waterway Ave, The Woodlands, TX 77380");
        saveLocation("A","","","","","");
        saveLocation("B","","","","","");
        saveLocation("C","","","","","");
        saveLocation("D","","","","","");
        saveLocation("E","","","","","");
        saveLocation("F","","","","","");
        saveLocation("G","","","","","");
        saveLocation("H","","","","","");
        saveLocation("I","","","","","");
        saveLocation("J","","","","","");
        saveLocation("K","","","","","");
        saveLocation("L","","","","","");
        saveLocation("M","","","","","");
        saveLocation("N","","","","","");
        saveLocation("O","","","","","");
        saveLocation("P","","","","","");
        saveLocation("Q","","","","","");
        saveLocation("R","","","","","");
        saveLocation("S","","","","","");
        saveLocation("T","","","","","");
        saveLocation("U","","","","","");
        saveLocation("V","","","","","");
        saveLocation("W","","","","","");
        saveLocation("X","","","","","");
        saveLocation("Y","","","","","");
        saveLocation("Z","","","","","");
        saveLocation("A1","","","","","");
        saveLocation("B2","","","","","");
        saveLocation("C3","","","","","");
        saveLocation("D4","","","","","");
        saveLocation("E5","","","","","");
        saveLocation("F6","","","","","");
        saveLocation("G7","","","","","");
        saveLocation("H8","","","","","");
        saveLocation("I9","","","","","");
        saveLocation("J1","","","","","");
        saveLocation("K2","","","","","");
        saveLocation("L3","","","","","");
        saveLocation("M4","","","","","");
        saveLocation("N5","","","","","");
        saveLocation("O6","","","","","");
        saveLocation("P7","","","","","");
        saveLocation("Q8","","","","","");
        saveLocation("R9","","","","","");
        saveLocation("S1","","","","","");
        saveLocation("T2","","","","","");
        saveLocation("U3","","","","","");
        saveLocation("V4","","","","","");
        saveLocation("W5","","","","","");
        saveLocation("X6","","","","","");
        saveLocation("Y7","","","","","");
        saveLocation("Z8","","","","","");
        saveLocation("A9","","","","","");
        saveLocation("B0","","","","","");
        saveLocation("C1","","","","","");
        saveLocation("D2","","","","","");
        saveLocation("E3","","","","","");
        saveLocation("F4","","","","","");
        saveLocation("G5","","","","","");
        saveLocation("H6","","","","","");
        saveLocation("I7","","","","","");
        saveLocation("J8","","","","","");
        saveLocation("K9","","","","","");
        saveLocation("L0","","","","","");
        saveLocation("M1","","","","","");
        saveLocation("N2","","","","","");
        saveLocation("O3","","","","","");
        saveLocation("P4","","","","","");
        saveLocation("Q5","","","","","");
        saveLocation("R6","","","","","");
        saveLocation("S7","","","","","");
        saveLocation("T8","","","","","");
        saveLocation("U9","","","","","");
        saveLocation("V0","","","","","");
        saveLocation("W1","","","","","");
        saveLocation("X2","","","","","");
        saveLocation("Y3","","","","","");
        saveLocation("Z4","","","","","");
        saveLocation("A5","","","","","");
        saveLocation("B6","","","","","");
        saveLocation("C7","","","","","");
        saveLocation("D8","","","","","");
        saveLocation("E9","","","","","");
        saveLocation("F0","","","","","");
        saveLocation("G1","","","","","");
        saveLocation("H2","","","","","");
        saveLocation("I3","","","","","");
        saveLocation("J4","","","","","");
        saveLocation("K5","","","","","");
        saveLocation("L6","","","","","");
        saveLocation("M7","","","","","");
        saveLocation("N8","","","","","");
        saveLocation("O9","","","","","");
        saveLocation("P0","","","","","");
        saveLocation("Q1","","","","","");
        saveLocation("R2","","","","","");
        saveLocation("S3","","","","","");
        saveLocation("T4","","","","","");
        saveLocation("U5","","","","","");
        saveLocation("V6","","","","","");
        saveLocation("W7","","","","","");
        saveLocation("X8","","","","","");
        saveLocation("Y9","","","","","");
        saveLocation("Z0","","","","","");
        saveLocation("A1","","","","","");
        saveLocation("B2","","","","","");
        saveLocation("C3","","","","","");
        saveLocation("D4","","","","","");
        saveLocation("E5","","","","","");
        saveLocation("F6","","","","","");
        saveLocation("G7","","","","","");
        saveLocation("H8","","","","","");
        saveLocation("I9","","","","","");
        saveLocation("J0","","","","","");
        saveLocation("K1","","","","","");
        saveLocation("L2","","","","","");
        saveLocation("M3","","","","","");
        saveLocation("N4","","","","","");
        saveLocation("O5","","","","","");
        saveLocation("P6","","","","","");
        saveLocation("Q7","","","","","");
        saveLocation("R8","","","","","");
        saveLocation("S9","","","","","");
        saveLocation("T0","","","","","");
        saveLocation("U1","","","","","");
        saveLocation("V2","","","","","");
        saveLocation("W3","","","","","");
        saveLocation("X4","","","","","");
        saveLocation("Y5","","","","","");
        saveLocation("Z6","","","","","");
        saveLocation("A7","","","","","");
        saveLocation("B8","","","","","");
        saveLocation("C8","","","","","");
        saveLocation("D9","","","","","");
        saveLocation("E0","","","","","");
        saveLocation("F1","","","","","");
        saveLocation("G2","","","","","");
        saveLocation("H3","","","","","");
        saveLocation("I4","","","","","");
        saveLocation("J5","","","","","");
        saveLocation("K6","","","","","");
        saveLocation("L7","","","","","");
        saveLocation("M8","","","","","");
        saveLocation("N9","","","","","");
        saveLocation("O0","","","","","");
        saveLocation("P1","","","","","");
        saveLocation("Q2","","","","","");
        saveLocation("R3","","","","","");
        saveLocation("S4","","","","","");
        saveLocation("T5","","","","","");
        saveLocation("U6","","","","","");
        saveLocation("V7","","","","","");
        saveLocation("W8","","","","","");
        saveLocation("X9","","","","","");
        saveLocation("Y0","","","","","");
        saveLocation("Z11","","","","","");


    }

    private static void saveLocation(String name, String hours, String description, String city, String ZIP, String address){
        Bar bar = new Bar(name, hours, description, city,ZIP, address);
        barList.add(bar);
        barMap.put(name, bar);

    }
}
