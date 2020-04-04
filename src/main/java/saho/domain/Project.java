package saho.domain;

public class Project {
    private String id;
    private String title;
    private String description;
    private String image_code;
    private String profile_desc;

private Project(){}
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_code() {
        return image_code;
    }

    public void setImage_code(String image_code) {
        this.image_code = image_code;
    }

    public String getProfile_desc() {
        return profile_desc;
    }

    public void setProfile_desc(String profile_desc) {
        this.profile_desc = profile_desc;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image_code='" + image_code + '\'' +
                ", profile_desc='" + profile_desc + '\'' +
                '}';
    }

    public static class Builder{

        private String id;
        private String title;
        private String description;
        private String image_code;
        private String profile_desc;


        public Builder(String id) {
            this.id = id;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setImage_code(String image_code) {
            this.image_code = image_code;
            return this;
        }

        public Builder setProfile_desc(String profile_desc) {
            this.profile_desc = profile_desc;
            return this;
        }

        public Project build (){

            Project proj = new Project();

            proj.id = this.id;
            proj.title = this.title;
            proj.description = this.description;
            proj.image_code = this.image_code;
            proj.profile_desc = this.profile_desc;

            return proj;
        }
    }
}
