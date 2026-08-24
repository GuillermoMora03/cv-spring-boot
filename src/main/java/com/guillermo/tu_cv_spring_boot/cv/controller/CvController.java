package com.guillermo.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CvController {

    @GetMapping("")
    public String index() {
        return "index";
    }
}
