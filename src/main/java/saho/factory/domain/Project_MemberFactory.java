package saho.factory.domain;

import saho.domain.Project_Member;
import saho.util.GeneratId;

public class Project_MemberFactory {

    public static Project_Member getProject_Member(String project_id,String member_id, String description){

        return new Project_Member.Builder()
                .setProject_id(project_id)
                .setMember_id(member_id)
                .setDescription(description)
                .build();

    }
}
