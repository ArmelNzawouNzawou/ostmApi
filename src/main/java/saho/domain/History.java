package saho.domain;

import java.util.Date;
import java.util.List;

public class History {
    private String id;
    private String description;
    private List<String> image_id;
    private String content;
    private Date date;
private History(){}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getImage_id() {
        return image_id;
    }

    public void setImage_id(List<String> image_id) {
        this.image_id = image_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "History{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", image_id=" + image_id +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }

    public static class Builder{

        private String id;
        private String description;
        private List<String> image_id;
        private String content;
        private Date date;

        public Builder(String id) {
            this.id = id;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setImage_id(List<String> image_id) {
            this.image_id = image_id;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public History build(){

            History hist =  new History();

            hist.id = this.id;
            hist.description = this.description;
            hist.image_id = this.image_id;
            hist.content = this.content;
            hist.date = this.date;
            return hist;

        }
    }
}
