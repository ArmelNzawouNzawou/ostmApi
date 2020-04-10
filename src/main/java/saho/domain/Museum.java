package saho.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Museum {
    @Id
    private String profile;
    private String Address;
    private String time;
    private String image_id;
    private String place_id;

    private Museum(){}

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    @Override
    public String toString() {
        return "Museum{" +
                "profile='" + profile + '\'' +
                ", Address='" + Address + '\'' +
                ", time='" + time + '\'' +
                ", image_id='" + image_id + '\'' +
                ", place_id='" + place_id + '\'' +
                '}';
    }

    public static class Builder {

        private String profile;
        private String Address;
        private String time;
        private String image_id;
        private String place_id;

        public Builder setProfile(String profile) {
            this.profile = profile;
            return this;
    }

        public Builder setAddress(String address) {
            Address = address;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Builder setImage_id(String image_id) {
            this.image_id = image_id;
            return this;
        }

        public Builder setPlace_id(String place_id) {
            this.place_id = place_id;
            return this;
        }

        public Museum build(){

           Museum mus = new Museum();

            mus.profile =this.profile;
            mus.Address =this.Address;
            mus.time =this.time;
            mus.image_id = this.image_id;
            mus.place_id = this.place_id;
            
            return mus;


        }
    }
}

