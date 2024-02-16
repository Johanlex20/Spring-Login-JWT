package SpringLoginJWT.SpringLoginJWT.Demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
@RequiredArgsConstructor // obtener todos los argumentos del metodo constructor

public class DemoController {

    @PostMapping(value = "demo")
    public String welcome(){
        return "Welcome from secure endpoint";
    }

}


