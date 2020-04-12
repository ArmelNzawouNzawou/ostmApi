package saho.repository.Place;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.Place;

@Repository
public interface PlaceRepo extends JpaRepository<Place,String> {
}
