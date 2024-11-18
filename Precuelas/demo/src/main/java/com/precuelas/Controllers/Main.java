package com.precuelas.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Main {
    @GetMapping("/")
    String Main() {
        return "Hola";
    }
    
    
}
