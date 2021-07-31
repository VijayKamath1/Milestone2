package trident.healthx.milestone2.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import trident.healthx.milestone2.domain.security.Client;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, String> {

    Optional<Client> findClientByClientId( String clientId);

}