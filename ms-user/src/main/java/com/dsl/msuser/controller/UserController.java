package com.dsl.msuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping(path = "/UserController")
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${HELLOSERVICEURL}")
    private String HELLOSERVICEURL;

    @RequestMapping(path = "/ping")
    public String ping(){
        return "pong,this is ms-user/UserController/ping";
    }

    @RequestMapping(path = "ping-hello")
    public String pingHello(){
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                HELLOSERVICEURL + "/HelloController/HelloWorld",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<String>() {}
        );
        String str = responseEntity.getBody();
        return str;
    }


}
