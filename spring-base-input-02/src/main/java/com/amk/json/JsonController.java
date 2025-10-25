package com.amk.json;

import com.amk.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 阿明楷
 * @Date 2025/10/25:10:35
 * @See:
 */
@Controller
@RequestMapping("data")
@ResponseBody
public class JsonController {

    @RequestMapping("data")
    public String data(@RequestBody Person person){

        System.out.println("person="+person);
        return person.toString();
    }
}
