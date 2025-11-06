package k66httt.ttcn.qlyvattu.repository;

import k66httt.ttcn.qlyvattu.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {

//     Optional<Authority> findByNameRole(String nameRole);
}
