package example.spring.config;

import example.web.user.LoginUser;
import example.web.user.UserDao;
import example.web.user.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by yookeun on 2016. 11. 9..
 */
@Service
public class UserDetailService implements UserDetailsService {


    @Autowired
    private UserDao dao;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDto userDto = dao.select(username);
        if (userDto == null) {
            throw new UsernameNotFoundException("UsernameNotFound [" + username + "]");
        }
        LoginUser user = createUser(userDto);
        return user;
    }

    private LoginUser createUser(UserDto userDto) {
        LoginUser loginUser = new LoginUser(userDto);
        if (loginUser.getIsAdmin().equals("Y")) {
            loginUser.setRoles(Arrays.asList("ROLE_ADMIN"));
        } else {
            loginUser.setRoles(Arrays.asList("ROLE_USER"));
        }
        //System.out.println("username === "+loginUser.getUsername());
        //System.out.println("role == " + loginUser.getRoles());
        return loginUser;
    }
}

