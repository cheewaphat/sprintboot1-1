package com.ks.demo1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaoController {

    @Value("${dao.info}")
    private String daoInfo;

    @GetMapping("/hello")
    public String getHelloWorl(){
        return "Hello XXAAAAAAAXXX"+daoInfo;
    }
}
