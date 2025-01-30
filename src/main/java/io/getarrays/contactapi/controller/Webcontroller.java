package io.getarrays.contactapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Webcontroller {
    @GetMapping("/{path:[^\\.]*}")
    public String forward() {
        return "forward:/index.html";
    }
}