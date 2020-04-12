package saho.repository.Museum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.Museum;

@Repository
public interface MuseumRepo extends JpaRepository<Museum,String> {
}
