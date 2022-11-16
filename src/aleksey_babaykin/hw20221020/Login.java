package aleksey_babaykin.hw20221020;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Login {
    @Getter
    @Setter

    private String loginID;
    private String password;
    private String accessLevel;
    private User user;

}
