package mate.academy.spring.dto.request;

import javax.validation.constraints.NotNull;

public class UserRequestDto {
    @NotNull
    private String email;
    @NotNull
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
