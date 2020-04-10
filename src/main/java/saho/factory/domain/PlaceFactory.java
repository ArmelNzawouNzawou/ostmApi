package saho.factory.domain;

import saho.domain.Place;
import saho.util.GeneratId;

public class PlaceFactory {
    public static Place getPlace(String title, String latitude, String longititude){

     return new Place.Builder(GeneratId.getId(PlaceFactory.class))

             .setTitle(title)
             .setLatitude(latitude)
             .setLongititude(longititude)
             .build();
    }
}
