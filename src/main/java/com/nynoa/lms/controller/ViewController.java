package com.nynoa.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
    @GetMapping("/main")
    public String mainView() {
        return "view/view-index";
    }

    @GetMapping("/insert")
    public String insertView(@RequestParam(value = "table") String table) {
        if(table.equals("STUDENTS_TB")) {
            return "view/create/insert-member";
        }

        return "view/view-index";
    }
}
