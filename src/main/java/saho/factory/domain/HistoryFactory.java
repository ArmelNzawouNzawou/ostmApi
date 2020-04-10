package saho.factory.domain;

import saho.domain.History;
import saho.util.GeneratId;

import java.util.Date;
import java.util.List;



public class HistoryFactory {
    public static History getHistory( String description, List<String> image_id, String content, Date date){

        return new History.Builder(GeneratId.getId(HistoryFactory.class))

                .setDescription(description)
                .setImage_id(image_id)
                .setContent(content)
                .setDate(date)
                .build();
    }
}
