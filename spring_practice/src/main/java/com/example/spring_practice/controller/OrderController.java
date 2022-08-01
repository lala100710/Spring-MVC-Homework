package com.example.spring_practice.controller;

import com.example.spring_practice.model.Order;
import com.example.spring_practice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id, Model model){
        Order order=this.orderService.getOrderById(id);
        model.addAttribute("orders",order);
        return "orders";
    }
    @GetMapping("/sale")
    public String getTotalSales(Model model){
        int sale=this.orderService.getOrderSales();
        model.addAttribute("sales",sale);
        return "sales";
    }

}
