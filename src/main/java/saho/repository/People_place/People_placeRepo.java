package saho.repository.People_place;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.People_place;
@Repository
public interface People_placeRepo  extends JpaRepository <People_place, String> {
}
