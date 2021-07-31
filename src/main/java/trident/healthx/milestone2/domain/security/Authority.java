package trident.healthx.milestone2.domain.security;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;

    private String role;

    @ManyToOne
    private User users;



}
