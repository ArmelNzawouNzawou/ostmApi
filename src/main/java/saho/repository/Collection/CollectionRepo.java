package saho.repository.Collection;

import org.springframework.stereotype.Repository;
import saho.domain.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CollectionRepo extends JpaRepository<Collection, String>{
}
