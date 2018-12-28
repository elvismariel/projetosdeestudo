package com.elvismariel.traking.model;

public class PhoneLocation {
    private String phone;
    private double latitude;
    private double longitude;

    public PhoneLocation(String phone, double latitude, double longitude) {
        this.phone = phone;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private String getPhone(String phone, double latitude, double longitude) {
        return phone;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public static PhoneLocation reload(String phone, double latitude, double longitude){
        return new PhoneLocation(phone, latitude, longitude);
    }
}
