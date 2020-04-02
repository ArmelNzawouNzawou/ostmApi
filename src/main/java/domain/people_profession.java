package domain;

public class people_profession {
    private String profession_id;
    private String people_id;
    private String description;

    public String getProfession_id() {
        return profession_id;
    }

    public void setProfession_id(String profession_id) {
        this.profession_id = profession_id;
    }

    public String getPeople_id() {
        return people_id;
    }

    public void setPeople_id(String people_id) {
        this.people_id = people_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "people_profession{" +
                "profession_id='" + profession_id + '\'' +
                ", people_id='" + people_id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {

        private String profession_id;
        private String people_id;
        private String description;

        public Builder setProfession_id(String profession_id) {
            this.profession_id = profession_id;
            return this;
        }

        public Builder setPeople_id(String people_id) {
            this.people_id = people_id;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public people_profession build (){

            people_profession pplProf =new people_profession();

            pplProf.profession_id = this.profession_id;
            pplProf.people_id = this.people_id;
            pplProf.description = this.description;

            return pplProf;

        }
    }
}
