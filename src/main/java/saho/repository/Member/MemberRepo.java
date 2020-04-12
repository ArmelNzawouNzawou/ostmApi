package saho.repository.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saho.domain.Member;

@Repository
public interface MemberRepo extends JpaRepository<Member, String> {
}
