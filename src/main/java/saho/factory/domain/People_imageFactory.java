package saho.factory.domain;

import saho.domain.People_image;
import saho.util.GeneratId;

public class People_imageFactory {
    public static People_image getPeople_image(  String image_id,String image_type){

        return new People_image.Builder(GeneratId.getId(People_imageFactory.class))

                .setImage_id(image_id)
                .setImage_id(image_type)
                .build();
    }
}
