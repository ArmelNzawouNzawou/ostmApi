package saho.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profession {
    @Id
    private String id;
    private String profession;
    private String description;

    private Profession(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "id='" + id + '\'' +
                ", profession='" + profession + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {

        private String id;
        private String profession;
        private String description;

        public Builder (String id) {
            this.id = id;
        }

        public Builder setProfession(String profession) {
            this.profession = profession;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Profession build(){

            Profession prof = new Profession();
            prof.id = this.id;
            prof.profession = this.profession;
            prof.description = this.description;

            return prof;


        }
    }
}
