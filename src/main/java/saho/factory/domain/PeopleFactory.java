package saho.factory.domain;

import saho.domain.People;
import saho.util.GeneratId;

public class PeopleFactory {
    public static People getPeople( String name,String surname,String birth_date,String orgine,String history,String profession){
        return new People.Builder(GeneratId.getId(PeopleFactory.class))
                .buildBirthDate(birth_date)
                .builderSurname(surname)
                .buildHistory(history)
                .buildName(name)
                .buildOrigine(orgine)
                .buildProfession(profession)
                .build();
    }
}
