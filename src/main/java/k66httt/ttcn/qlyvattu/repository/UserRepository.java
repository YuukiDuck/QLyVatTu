package k66httt.ttcn.qlyvattu.repository;

import k66httt.ttcn.qlyvattu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findByPhone(String phone);
    Optional<User> findById(Long id);
    boolean existsByEmail(String email);
}