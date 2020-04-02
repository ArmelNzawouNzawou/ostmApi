package domain;

public class People_profession_image {
    private String people_profession_image;
    private String image_id;
    private String desc;

    public String getPeople_profession_image() {
        return people_profession_image;
    }

    public void setPeople_profession_image(String people_profession_image) {
        this.people_profession_image = people_profession_image;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "People_profession_image{" +
                "people_profession_image='" + people_profession_image + '\'' +
                ", image_id='" + image_id + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static class Builder {

        private String people_profession_image;
        private String image_id;
        private String desc;


        public Builder setPeople_profession_image(String people_profession_image) {
            this.people_profession_image = people_profession_image;
            return this;
        }

        public Builder setImage_id(String image_id) {
            this.image_id = image_id;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public People_profession_image build(){

            People_profession_image pplProfI = new People_profession_image();

            pplProfI.people_profession_image = this.people_profession_image;
            pplProfI.image_id = this.image_id;
            pplProfI.desc = this.desc;

            return pplProfI;

        }
    }
}
