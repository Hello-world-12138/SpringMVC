package com.amk.param;

import com.amk.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/10/24:16:07
 * @See:
 */
@Controller
@RequestMapping("param")
public class ParamController {
    //直接接收

    @RequestMapping("data")
    @ResponseBody
    public String data(@RequestParam("name")String name, @RequestParam("age")int age) {
        System.out.println("name="+name+",age="+age);
        return "name="+name+",age="+age;
    }

    //注解指定
    @GetMapping("data1")
    @ResponseBody
    public  String data1(@RequestParam(value = "account")String username,
                         @RequestParam(value = "page", required = false,defaultValue = "1")int page){

        System.out.println("username="+username+",page="+page);
        return "username="+username+",page="+page;
    }

    //特殊值
    @GetMapping("data2")
    @ResponseBody
    public  String data2(@RequestParam List<String> hbs){
        System.out.println("hbs="+hbs);
        return "ok";

    }
    //使用实体对象接值

    @RequestMapping("data3")
    @ResponseBody
    public String data3(User user){
        System.out.println("user="+user);
        return user.toString();
    }

}
