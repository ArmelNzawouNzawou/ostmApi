package domain;

public class Profession {
    private String id;
    private String profession;
    private String description;

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

        public Builder setId(String id) {
            this.id = id;
            return this;
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
