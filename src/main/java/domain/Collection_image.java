package domain;

public class Collection_image {
    private String image_id;
    private String collection_image_id;
    private String description;
private Collection_image(){}

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getCollection_image_id() {
        return collection_image_id;
    }

    public void setCollection_image_id(String collection_image_id) {
        this.collection_image_id = collection_image_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Collection_image{" +
                "image_id='" + image_id + '\'' +
                ", collection_image_id='" + collection_image_id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {

        private String image_id;
        private String collection_image_id;
        private String description;


        public Builder(String image_id) {
            this.image_id = image_id;
        }

        public Builder setCollection_image_id(String collection_image_id) {
            this.collection_image_id = collection_image_id;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Collection_image build() {
            Collection_image collectIm = new Collection_image();
            collectIm.image_id = this.image_id;
            collectIm.collection_image_id = this.collection_image_id;
            collectIm.description = this.description;
            return collectIm;
        }


    }
}
