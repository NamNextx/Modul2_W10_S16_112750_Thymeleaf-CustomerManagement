package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("customers",customerService.findAll());
        return "index";
    }

    @GetMapping("/customer/create")
    public String create(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
    }

}

