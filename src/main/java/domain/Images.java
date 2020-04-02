package domain;

public class Images {
    private String id;
    private byte[] image;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  static class Builder{

        private String id;
        private byte[] image;
        private String description;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setImage(byte[] image) {
            this.image = image;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        Images buid(){

            Images img = new Images();

            img.id = this.id;
            img.image = this.image;
            img.description = this.description;

            return img;


        }
    }
}
