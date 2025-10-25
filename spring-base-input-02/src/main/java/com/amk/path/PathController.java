package com.amk.path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 阿明楷
 * @Date 2025/10/25:10:23
 * @See:
 */
@Controller
@RequestMapping("path")
@ResponseBody
public class PathController {
    @RequestMapping("{account}/{password}")
    public String login(@PathVariable("account") String username, @PathVariable String password){
        System.out.println("username="+username+",password="+password);
        return"username="+username+",password="+password;
    }
}
