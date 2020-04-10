package saho.factory.domain;

import saho.domain.Collection;
import saho.util.GeneratId;
import java.util.List;

public class CollectionFactory {
    public  static Collection getCollection (String id, String name,List<String>image_code,String profile_description,String history){

        return new Collection.Builder(GeneratId.getId(CollectionFactory.class))
        .setName(name)
        .setImage_code(image_code)
        .setProfile_description(profile_description)
        .setHistory(history)
        .build();

    }




}
