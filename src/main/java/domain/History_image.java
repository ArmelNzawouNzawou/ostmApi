package domain;

public class History_image {
    private String image_id;
    private String history_image_id;
    private String description;

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getHistory_image_id() {
        return history_image_id;
    }

    public void setHistory_image_id(String history_image_id) {
        this.history_image_id = history_image_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static class Builder {

        private String image_id;
        private String history_image_id;
        private String description;

        public Builder setImage_id(String image_id) {
            this.image_id = image_id;
            return this;
        }

        public Builder setHistory_image_id(String history_image_id) {
            this.history_image_id = history_image_id;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public History_image build(){

            History_image histIm  = new History_image();

            histIm.image_id = this.image_id;
            histIm.history_image_id = this.history_image_id;
            histIm.description = this.description;

            return histIm;

        }
    }
}
