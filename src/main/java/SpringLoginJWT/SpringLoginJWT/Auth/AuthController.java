package SpringLoginJWT.SpringLoginJWT.Auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/auth")
@RequiredArgsConstructor //anotacion que solicita el contructor con todos los argumentos

public class AuthController {

    @PostMapping(value = "login")
    public String login(){
        return "Login from public endpoint";
    }

}
