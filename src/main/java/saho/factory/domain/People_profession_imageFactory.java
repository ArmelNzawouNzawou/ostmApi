package saho.factory.domain;

import saho.domain.People_profession_image;
import saho.util.GeneratId;

public class People_profession_imageFactory {

    public static People_profession_image getPeople_profession_image(String image_id, String desc){

        return new People_profession_image.Builder(GeneratId.getId(People_profession_imageFactory.class))

                .setImage_id(image_id)
                .setDesc(desc)
                .build();
    }


}
