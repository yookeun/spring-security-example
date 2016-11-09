package example.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yookeun on 2016. 9. 13..
 */

@Controller
public class UserController {

    @Autowired
    private UserService service;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginProcess(@RequestParam String username, @RequestParam String password ) {

        System.out.println("username====="+username);
        System.out.println("username====="+password);


        return "/user";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser(LoginUser user, Model model) {
        UserDto userDto = service.select(user.getUsername());
        model.addAttribute("user", userDto);
        return "profile";
    }
}
