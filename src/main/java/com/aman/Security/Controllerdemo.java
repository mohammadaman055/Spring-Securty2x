package com.aman.Security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerdemo {
    @GetMapping("/all")
    public String all(){
        return "Welcome All!";
    }

    @GetMapping("/user")
    public String user(){
        return "Welcome User!";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Welcome Admin!";
    }
}
