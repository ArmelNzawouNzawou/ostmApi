package domain;

public class Member {
    private String id;
    private String name;
    private String surname;
    private String birthday;
    private String image_code;
private Member(){}

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getImage_code() {
        return image_code;
    }

    public void setImage_code(String image_code) {
        this.image_code = image_code;
    }


    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", image_code='" + image_code + '\'' +
                '}';
    }

    public static class Builder {

       private String id;
       private String name;
       private String surname;
       private String birthday;
       private String image_code;


       public Builder(String id) {
           this.id = id;
       }

       public Builder setName(String name) {
           this.name = name;
           return this;
       }

       public Builder setSurname(String surname) {
           this.surname = surname;
           return this;
       }

       public Builder setBirthday(String birthday) {
           this.birthday = birthday;
           return this;
       }

       public Builder setImage_code(String image_code) {
           this.image_code = image_code;
           return this;
       }

        public Member build(){

           Member memb = new Member();

           memb.id = this.id;
           memb.name = this.name;
           memb.surname = this.surname;
           memb.birthday = this.birthday;
           memb.image_code = this.image_code;

           return memb;


        }
   }

}
