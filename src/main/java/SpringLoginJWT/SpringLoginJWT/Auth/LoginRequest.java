package SpringLoginJWT.SpringLoginJWT.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder // para construcion de objetos
@AllArgsConstructor
@NoArgsConstructor

public class LoginRequest {

    String username;
    String password;

}
