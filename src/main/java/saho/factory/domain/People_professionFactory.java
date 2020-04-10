package saho.factory.domain;

import saho.domain.People_profession;
import saho.util.GeneratId;

public class People_professionFactory {

    public static People_profession getPeople_profession (String people_id,String description){

        return new People_profession.Builder(GeneratId.getId(People_professionFactory.class))

                .setPeople_id(people_id)
                .setDescription(description)
                .build();
    }
}
