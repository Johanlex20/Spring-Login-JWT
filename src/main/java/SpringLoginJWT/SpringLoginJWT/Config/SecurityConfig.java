package SpringLoginJWT.SpringLoginJWT.Config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration // indica que tiene metodos con la anotacion Bean
@EnableWebSecurity
@RequiredArgsConstructor

public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable()) // validaciones csrf se instancia que se desabilite

                .authorizeHttpRequests(authRequest ->
                        authRequest
                            .requestMatchers("/auth/**").permitAll()
                            .anyRequest().authenticated()
                        )
                .formLogin(withDefaults()) //habilita el formulario por defecto de spring security
                .build();
    }

}
