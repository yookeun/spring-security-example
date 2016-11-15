package example.web.user;

import lombok.Data;

/**
 * Created by yookeun on 2016. 9. 15..
 */
@Data
public class UserDto {
    private Integer id;
    private String username;
    private String password;
    private String isadmin;
}
