package trident.healthx.milestone2.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import trident.healthx.milestone2.domain.security.Client;
import trident.healthx.milestone2.domain.security.ClientGrants;

import java.util.Optional;

public interface ClientGrantsRepository extends JpaRepository<ClientGrants, Integer> {

    //Optional<ClientGrants> findClientGrantsByClientId( String clientId);

}