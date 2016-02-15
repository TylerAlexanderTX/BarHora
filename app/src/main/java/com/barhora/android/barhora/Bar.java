package com.barhora.android.barhora;

/**
 * Created by tyler on 1/28/2016.
 */
public class Bar {
    //private static void saveLocation(String name, String hours, String description, String city, String ZIP, String address){
    private String name;
    private String hours;
    private String description;
    private String city;
    private String ZIP;
    private String address;

    public Bar(String name, String hours, String description, String city, String ZIP, String address) {
        this.name = name;
        this.hours = hours;
        this.description = description;
        this.city = city;
        this.ZIP = ZIP;
        this.address = address;
    }

    public String getName(){return name;}
    public String getHours(){return hours;}
    public String getDescription(){return description;}
    public String getCity(){return city;}
    public String getZIP(){return ZIP;}
    public String getAddress(){return address;}

}
