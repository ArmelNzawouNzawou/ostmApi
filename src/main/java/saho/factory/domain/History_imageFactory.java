package saho.factory.domain;

import saho.domain.History_image;
import saho.util.GeneratId;

public class History_imageFactory {
    public static History_image getHistory_image(String history_image_id,String description){
        return new History_image.Builder(GeneratId.getId(History_image.class))
                .setHistory_image_id(history_image_id)
                .setDescription(description)
                .build();
    }
}
