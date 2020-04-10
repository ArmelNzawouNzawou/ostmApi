package saho.factory.domain;

import saho.domain.Member;
import saho.util.GeneratId;

public class MemberFactory {
    public static Member getMember( String name,String surname,String birthday,String image_code){

        return new Member.Builder(GeneratId.getId(MemberFactory.class))

                .setName(name)
                .setSurname(surname)
                .setBirthday(birthday)
                .setImage_code(image_code)
                .build();
    }

}
