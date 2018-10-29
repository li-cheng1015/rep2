package com.itcast.controller;

import com.itcast.domain.Items;
import com.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService service;
    @RequestMapping("/findById")
    public String findById(Model model){
        Items items = service.findById(1);
        model.addAttribute("items",items);
        System.out.println("ooooooooo");
        return "success";
    }
}
