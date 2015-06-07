package com.example.myApplication.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class OrderController {

    @RequestMapping("/orders")
    @ResponseBody
    public List<Order> orders() {
        return Arrays.asList(new Order("12345"));
    }
}
