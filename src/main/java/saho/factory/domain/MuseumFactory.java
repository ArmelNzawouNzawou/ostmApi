package saho.factory.domain;

import saho.domain.Museum;
import saho.util.GeneratId;

public class MuseumFactory {
    public static Museum getMuseum (String profile, String address, String time, String image_id){

        return new Museum.Builder()
                .setProfile(profile)
                .setAddress(address)
                .setTime(time)
                .setImage_id(image_id)
                .build();
    }
}
