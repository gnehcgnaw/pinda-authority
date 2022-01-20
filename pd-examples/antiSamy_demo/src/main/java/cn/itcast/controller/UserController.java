package cn.itcast.controller;

import cn.itcast.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gnehcgnaw
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save")
    public String save(User user){
        System.out.println("UserController save.... " + user);
        return user.getName();
    }
}