package gt.app.modules.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileUpdateDTO {

    @Email
    private String email;

    @NotNull
    @Size(min = 2, max = 30)
    private String firstName;

    @Size(min = 0, max = 30)
    private String lastName;
}
