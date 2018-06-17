package com.example.shopmanagement.controllers;

import com.example.shopmanagement.models.ShopModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/main")
public class MainController
{
    @GetMapping(path = "/index")
    public String index(Model model)
    {
        List<ShopModel> models = new ArrayList<>();
        ShopModel sm1 = new ShopModel();
        sm1.setId(100L);
        models.add(sm1);

        ShopModel sm2 = new ShopModel();
        sm2.setId(120L);
        models.add(sm2);


        model.addAttribute("models", models);
        return "index";
    }
}
