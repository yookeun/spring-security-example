package example.web.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String postLogin(UserDto userDto) {
        int cnt = service.check(userDto);
        if (cnt > 0) {
            return "redirect:/user/"+userDto.getUsername();
        } else {
            return "redirect:/error";
        }


    }


    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public String getUser(@PathVariable String username, Model model) {
        UserDto userDto = service.select(username);
        model.addAttribute("user", userDto);
        return "profile";
    }
}
