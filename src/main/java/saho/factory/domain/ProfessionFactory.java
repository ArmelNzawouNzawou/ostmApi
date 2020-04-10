package saho.factory.domain;

import saho.domain.Profession;
import saho.util.GeneratId;

public class ProfessionFactory {
    public static Profession getProfession (String profession,String description){

        return new Profession.Builder(GeneratId.getId(ProfessionFactory.class))
                .setProfession(profession)
                .setDescription(description)
                .build();
    }
}
