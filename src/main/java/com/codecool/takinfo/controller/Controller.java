package com.codecool.takinfo.controller;

import com.codecool.takinfo.modal.PropertyCalcLog;
import com.codecool.takinfo.service.PropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    PropService propService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        return "index";
    }

    @RequestMapping(value = "/calculate", method = RequestMethod.POST)
    public String addProperty(Model model ,@RequestParam("sqmeter") int sqmeter,
                              @RequestParam("longitude") double longitude,
                              @RequestParam("latitude") double latitude) {

        int price = propService.calcPropertyPrice(sqmeter,longitude,latitude);
        propService.addPropertyLog(price,sqmeter,longitude,latitude);

        model.addAttribute("price",price);
        return "index";
    }
}
