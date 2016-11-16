package example.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yookeun on 2016. 9. 13..
 */

@Controller
public class UserController {

    @Autowired
    private UserService service;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(LoginUser loginUser) {
        ModelAndView model = new ModelAndView("index");
        model.addObject("user", loginUser);
        return model;
    }


}
