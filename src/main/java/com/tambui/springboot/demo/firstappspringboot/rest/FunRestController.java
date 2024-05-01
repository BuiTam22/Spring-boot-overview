package com.tambui.springboot.demo.firstappspringboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Khai báo chú thích này nhằm mục đích để controller này liên kết với phần mềm
@RestController
// Tương tự như Route trong Nodejs, đây là đường dẫn localhost:8080/
@RequestMapping("/")
public class FunRestController {
    // xây dựng các URL con thuộc URL localhost:8080/
    // expose "/" that return "Hello World!"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
}

