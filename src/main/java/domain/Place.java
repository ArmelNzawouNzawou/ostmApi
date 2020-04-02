package domain;

public class Place {
    private String id;
    private String title;
    private String latitude;
    private String longititude;


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

    public static class Builder{

        private String id;
        private String title;
        private String latitude;
        private String longititude;


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
