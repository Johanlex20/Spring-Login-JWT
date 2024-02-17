package SpringLoginJWT.SpringLoginJWT.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"}) })

public class User {

    @Id
    @GeneratedValue
    Integer id;

    @Column(nullable = false)
    String username;
    String lastname;
    String firstname;
    String country;
    String password;
    Role role;

}
