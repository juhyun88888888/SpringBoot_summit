package com.example.sjh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/sjh")
    @ResponseBody
    public String index() {
        return "안녕하세요 sjh입니다.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
