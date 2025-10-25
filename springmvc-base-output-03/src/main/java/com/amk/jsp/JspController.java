package com.amk.jsp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 阿明楷
 * @Date 2025/10/25:15:36
 * @See:
 */
@Controller
@RequestMapping("jsp")
public class JspController {

    @GetMapping("index")
    public String index(HttpServletRequest request) {
        request.setAttribute("data","hello Jsp!!!");
        System.out.println("JspController.index");
        return "index";
    }
}
