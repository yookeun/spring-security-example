package example.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yookeun on 2016. 9. 15..
 */

@Service
public class UserService {
    @Autowired
    private UserDao dao;
    public UserDto select(String userName) {
        return dao.select(userName);
    }
}
