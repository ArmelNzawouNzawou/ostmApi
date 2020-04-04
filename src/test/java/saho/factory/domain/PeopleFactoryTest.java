package saho.factory.domain;

import saho.domain.People;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class PeopleFactoryTest {
People people=PeopleFactory.getPeople("Armel","Nzawu","1995/10/06","Gabon","None","developer");

    @Test
    void getPeople() {
        Assert.isInstanceOf(People.class,people);
        System.out.println(people.toString());
    }
}