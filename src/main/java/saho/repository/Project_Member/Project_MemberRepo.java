package saho.repository.Project_Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.Project_Member;

@Repository
public interface Project_MemberRepo extends JpaRepository<Project_Member,String> {
}
