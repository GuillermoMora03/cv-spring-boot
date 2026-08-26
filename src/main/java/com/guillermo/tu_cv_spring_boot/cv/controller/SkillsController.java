package com.guillermo.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SkillsController {

    @GetMapping("/skills")
    public String skills(Model model) {
        List<String> skills = List.of("Java", "Spring Boot", "Thymeleaf", "HTML", "CSS");
        List<String> list = new ArrayList<>();

        model.addAttribute("skills", list);

        return "skills";
    }

}
