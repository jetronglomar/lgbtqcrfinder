package com.scriptrepublic.lgbtqcrfinder;

public class LocationObj {

    public String getLocDescription() {
        return locDescription;
    }

    String locDescription;

    public double getLng() {
        return lng;
    }

    public double getLat() {
        return lat;
    }

    double lng;
    double lat;

    public LocationObj (String locDescription, double lat, double lng) {
        this.locDescription = locDescription;
        this.lng = lng;
        this.lat = lat;
    }

}
