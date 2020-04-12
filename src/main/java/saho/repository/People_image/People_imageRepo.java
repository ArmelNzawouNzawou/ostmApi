package saho.repository.People_image;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.People_image;

@Repository
public interface People_imageRepo extends JpaRepository<People_image, String> {
}
