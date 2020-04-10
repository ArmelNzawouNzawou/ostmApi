package saho.factory.domain;

import saho.domain.Project;
import saho.util.GeneratId;

public class ProjectFactory {

    public static Project getProject (String title, String description, String image_code, String profile_desc){

        return new Project.Builder(GeneratId.getId(ProjectFactory.class))

                .setTitle(title)
                .setDescription(description)
                .setImage_code(image_code)
                .setProfile_desc(profile_desc)
                .build();
    }
}
