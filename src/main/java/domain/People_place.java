package domain;

public class People_place {
    private String place_id;
    private String people_id;

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

    public static class Builder{

        private String place_id;
        private String people_id;

        public Builder setPlace_id(String place_id) {
            this.place_id = place_id;
            return this;
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
