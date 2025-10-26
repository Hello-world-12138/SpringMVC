package com.amk.controller;

import com.amk.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/10/26:10:29
 * @See:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public List<User> page(@RequestParam(required = false,defaultValue = "1") int page,
                           @RequestParam(required = false,defaultValue = "10") int size){
        System.out.println("page="+page+",size="+size);
        return null;
    }


    @PostMapping
    public User save(@RequestBody User user){
        return user;
    }

    @GetMapping("{id}")
    public User detail(@RequestParam Integer id){
        return null;
    }

    @PutMapping
    public User update(@RequestBody User user){
        return user;
    }

    @DeleteMapping("{id}")
    public User delete(@PathVariable Integer id){
        return null;
    }
}
