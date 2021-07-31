package trident.healthx.milestone2.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import trident.healthx.milestone2.domain.security.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername( String username);
}