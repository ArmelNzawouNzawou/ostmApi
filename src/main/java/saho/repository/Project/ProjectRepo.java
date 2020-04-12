package saho.repository.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project,String> {
}
