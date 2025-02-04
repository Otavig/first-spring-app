package com.otavig.first_spring_app.controller;

import com.otavig.first_spring_app.service.HelloWorldService;
import com.otavig.first_spring_app.domain.User; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// @ResponseBody 
// STATELES -> {TOKEN} A CADA REQUISIÇÃO EU RECEBO TODAS AS INFORMAÇÕES QUE EU PRECISO PARA FAZER AQUELA FUNIONALIDADE QUE O CLIENTE PEDE
// STATEFULL -> O ESTADO DE CADA CLIENTE É MANTIDO NO SERVIDOR
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

//    @Autowired
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {;
        this.helloWorldService = helloWorldService;
    }
    
//    @Autowired
//    private SDKAWS sdkAWS;
    
    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Otávio");
    }
    
    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World, " + body.getName() + " " + id + " " + filter;
    }
}
