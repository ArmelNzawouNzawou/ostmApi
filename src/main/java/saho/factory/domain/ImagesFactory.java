package saho.factory.domain;

import saho.domain.Images;
import saho.util.GeneratId;

public class ImagesFactory {
    public static Images getImages (byte[]image,String description){
     return new Images.Builder(GeneratId.getId(ImagesFactory.class))
             .setImage(image)
             .setDescription(description)
             .build();


    }
}
