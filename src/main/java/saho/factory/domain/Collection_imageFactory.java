package saho.factory.domain;

import saho.domain.Collection_image;
import saho.util.GeneratId;

public class Collection_imageFactory {
    public static Collection_image getCollection_image( String image_id,String collection_image_id,
             String description){
        return new Collection_image.Builder(GeneratId.getId(Collection_image.class))
               .setCollection_image_id(collection_image_id)
                .setDescription(description)
                .build();
    }

}
