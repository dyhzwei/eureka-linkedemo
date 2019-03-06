package com.dsl.mshello.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/HelloController")
public class HelloController {

    @RequestMapping(path = "/HelloWorld")
    public String Hello(){
        return "HelloWorld";
    }
}
