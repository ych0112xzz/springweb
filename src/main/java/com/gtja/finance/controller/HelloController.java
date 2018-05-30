package com.gtja.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/spring")
    public void spring(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.getWriter().write("hello my spring ccc");
    }
}
