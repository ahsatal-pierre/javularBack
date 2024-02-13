package com.crudtemp.javular.controller;

import org.springframework.boot.web.servlet.error.ErrorController; 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping; 
  
@Controller
public class Error implements ErrorController { 
  
    @GetMapping("/error") 
    public String handleError() { 
        return "error_page"; 
    } 
}
     
