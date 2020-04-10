package saho.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Collection {

    @Id
    private String id;
    private String name;
    private List<String> image_code;
    private String profile_description;
    private String history;

private Collection(){}

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

    public List<String> getImage_code() {
        return image_code;
    }

    public void setImage_code(List<String> image_code) {
        this.image_code = image_code;
    }

    public String getProfile_description() {
        return profile_description;
    }

    public void setProfile_description(String profile_description) {
        this.profile_description = profile_description;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image_code=" + image_code +
                ", profile_description='" + profile_description + '\'' +
                ", history='" + history + '\'' +
                '}';
    }

    public static class Builder{

        private String id;
        private String name;
        private List<String> image_code;
        private String profile_description;
        private String history;


        public Builder (String id) {
            this.id = id;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setImage_code(List<String> image_code) {
            this.image_code = image_code;
            return this;
        }

        public Builder setProfile_description(String profile_description) {
            this.profile_description = profile_description;
            return this;
        }

        public Builder setHistory(String history) {
            this.history = history;
            return this;
        }

        public Collection build(){
          Collection collect = new Collection();
          collect.id=this.id;
          collect.name=this.name;
          collect.image_code = this.image_code;
          collect.profile_description =this.profile_description;
          collect.history = this.history;
          return collect;
        }

    }
}
