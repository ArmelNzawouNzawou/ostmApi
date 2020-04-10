package saho.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Place {
    @Id
    private String id;
    private String title;
    private String latitude;
    private String longititude;

private Place(){}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongititude() {
        return longititude;
    }

    public void setLongititude(String longititude) {
        this.longititude = longititude;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longititude='" + longititude + '\'' +
                '}';
    }

    public static class Builder{

        private String id;
        private String title;
        private String latitude;
        private String longititude;


        public Builder(String id) {
           this.id=id;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongititude(String longititude) {
            this.longititude = longititude;
            return this;
        }

        public Place build(){

            Place place = new Place();

            place.id = this.id;
            place.title = this.title;
            place.latitude = this.latitude;
            place.longititude = this.longititude;
            
            return place;

        }
    }
}
