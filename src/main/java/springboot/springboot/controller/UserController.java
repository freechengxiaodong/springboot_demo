package springboot.springboot.controller;

import springboot.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 我命倾尘
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/age")
    public int getAgeOfUser(){
        return userService.getAgeByUsername("springbootdemo");
    }
}
