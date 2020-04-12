package saho.repository.Profession;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.Profession;

@Repository
public interface ProfessionRepo extends JpaRepository<Profession,String> {
}
