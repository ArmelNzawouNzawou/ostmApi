package saho.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class People_place {
    @Id
    private String place_id;
    private String people_id;

    private People_place(){}
    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getPeople_id() {
        return people_id;
    }

    public void setPeople_id(String people_id) {
        this.people_id = people_id;
    }

    @Override
    public String toString() {
        return "People_place{" +
                "place_id='" + place_id + '\'' +
                ", people_id='" + people_id + '\'' +
                '}';
    }

    public static class Builder{

        private String place_id;
        private String people_id;

        public Builder(String place_id) {
            this.place_id = place_id;
        }

        public Builder setPeople_id(String people_id) {
            this.people_id = people_id;
            return this;
        }

        public People_place build(){

            People_place pplPlc = new People_place();

            pplPlc.place_id =this.place_id;
            pplPlc.people_id = this.people_id;

            return pplPlc;
        }
    }
}
