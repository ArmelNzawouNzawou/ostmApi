package domain;

public class People {
    private String id;
    private String name;
    private String surname;
    private String birth_date;
    private String orgine;
    private String history;
    private String profession;

    private People(){}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getOrgine() {
        return orgine;
    }

    public void setOrgine(String orgine) {
        this.orgine = orgine;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", orgine='" + orgine + '\'' +
                ", history='" + history + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
    public static class Builder{

        private String id;
        private String name;
        private String surname;
        private String birth_date;
        private String orgine;
        private String history;
        private String profession;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Builder builderSurname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder buildBirthDate(String birth_date){
            this.birth_date=birth_date;
            return this;
        }
        public Builder buildOrigine(String orgine){
            this.orgine=orgine;
            return this;
        }
        public Builder buildHistory(String history){
            this.history=history;
            return this;
        }
        public Builder buildProfession(String profession){
            this.profession=profession;
            return this;
        }
        public People build(){
            People people=new People();
            people.birth_date=this.birth_date;
            people.history=this.history;
            people.id=this.id;
            people.name=this.name;
            people.orgine=this.orgine;
            people.profession=this.profession;
            people.surname=this.surname;
            return people;
        }
    }
}
