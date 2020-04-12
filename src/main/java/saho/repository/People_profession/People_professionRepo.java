package saho.repository.People_profession;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.People_profession;

@Repository
public interface People_professionRepo extends JpaRepository<People_profession, String> {
}
