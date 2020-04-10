package saho.factory.domain;

import saho.domain.People_place;
import saho.util.GeneratId;

public class People_placeFactory {

    public static People_place getPeople_place(String plac_id, String people_id){

        return new People_place.Builder(GeneratId.getId(People_placeFactory.class))

                .setPeople_id(people_id)
                .build();
    }
}
