package saho.repository.History_image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.History_image;

@Repository
public interface History_imageRepo extends JpaRepository <History_image, String> {
}
