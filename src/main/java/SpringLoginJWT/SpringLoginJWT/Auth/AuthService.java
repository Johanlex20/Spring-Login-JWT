package SpringLoginJWT.SpringLoginJWT.Auth;

import SpringLoginJWT.SpringLoginJWT.Jwt.JwtService;
import SpringLoginJWT.SpringLoginJWT.User.Role;
import SpringLoginJWT.SpringLoginJWT.User.User;
import SpringLoginJWT.SpringLoginJWT.User.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class AuthService {

    private final UserRepository userRepository; // esto es igual a @Autowire
    private final JwtService jwtService;
    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse regiter(RegisterRequest request) {
        User user = User.builder()
            .username(request.getUsername())
                .password(request.getPassword())
                .firstname(request.getFirstname())
                .lastname(request.lastname)
                .country(request.getCountry())
                .role(Role.USER)
                .build();

        userRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();
    }
}
