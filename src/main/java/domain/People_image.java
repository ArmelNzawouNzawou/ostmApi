package domain;

public class People_image {
    private String people_id;
    private String image_id;
    private String image_type;

    public String getPeople_id() {
        return people_id;
    }

    public void setPeople_id(String people_id) {
        this.people_id = people_id;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getImage_type() {
        return image_type;
    }

    public void setImage_type(String image_type) {
        this.image_type = image_type;
    }

    public static class Builder {

        private String people_id;
        private String image_id;
        private String image_type;

        public Builder setPeople_id(String people_id) {
            this.people_id = people_id;
            return this;
        }

        public Builder setImage_id(String image_id) {
            this.image_id = image_id;
            return this;
        }

        public Builder setImage_type(String image_type) {
            this.image_type = image_type;
            return this;
        }

        public People_image build(){

            People_image ppleImg = new People_image();

            ppleImg.people_id = this.people_id;
            ppleImg.image_id = this.image_id;
            ppleImg.image_type = this.image_type;

            return ppleImg;
        }
    }
}
