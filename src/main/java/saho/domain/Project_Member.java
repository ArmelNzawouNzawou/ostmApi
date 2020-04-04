package saho.domain;

public class Project_Member {
    private String project_id;
    private String member_id;
    private String description;

private Project_Member(){}
    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Project_Member{" +
                "project_id='" + project_id + '\'' +
                ", member_id='" + member_id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public  static class Builder {

        private String project_id;
        private String member_id;
        private String description;


        public Builder setProject_id(String project_id) {
            this.project_id = project_id;
            return this;
        }

        public Builder setMember_id(String member_id) {
            this.member_id = member_id;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Project_Member build(){

            Project_Member projMemb = new Project_Member();

            projMemb.project_id = this.project_id;
            projMemb.member_id = this.member_id;
            projMemb.description = this.description;

            return projMemb;

        }




    }
}
