package saho.repository.Collection_image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.Collection_image;

@Repository
public interface Collection_imageRepo extends JpaRepository<Collection_image,String> {
}
