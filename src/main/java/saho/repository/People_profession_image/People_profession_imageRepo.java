package saho.repository.People_profession_image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.People_profession_image;

@Repository
public interface People_profession_imageRepo extends JpaRepository<People_profession_image, String> {
}
