package com.coderandyli.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author lizhenzhen
 * @version 1.0
 * @date 2020/11/8 下午9:15
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/name")
    public String hello() {
        return "my name is andy001";
    }
}
