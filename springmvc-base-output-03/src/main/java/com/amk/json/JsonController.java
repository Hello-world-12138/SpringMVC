package com.amk.json;

import com.amk.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/10/25:16:08
 * @See:
 */
/*@Controller*/
@RequestMapping("json")/*
@ResponseBody*/
@RestController
public class JsonController {

    @GetMapping("data")

    public User data(){
    User user=new User();
    user.setName("tow dogs");
    user.setAge(23);
    return user;
    }

    @GetMapping("data2")

    public List<User> data1(){
        User user=new User();
        user.setName("tow dogs");
        user.setAge(23);

    List<User> users=new ArrayList<>();
    users.add(user);
    return users;

    }
}
