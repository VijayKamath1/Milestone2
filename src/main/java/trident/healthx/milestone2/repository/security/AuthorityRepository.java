package trident.healthx.milestone2.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import trident.healthx.milestone2.domain.security.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}