package com.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

@Controller
public class ApplicationController {

    @RequestMapping(value = "/getDateAndTime")
    public ModelAndView getDateAndTime() {

        var now = LocalDateTime.now();
        var dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        var date_time = dtf.format(now);

        var params = new HashMap<String, Object>();
        params.put("date_time", date_time);

        return new ModelAndView("showMessage", params);
    }
}