package com.brandjunhoe.feigntwoservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Create by DJH on 2021/10/05.
 */
@RestController
@RequestMapping("/api/home")
public class HomeController {

    @GetMapping
    public String helloWorld() {
        return "FeignTwoService HelloWorld";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return Arrays.asList(
                new User("김동수", 18, "남"),
                new User("김가은", 17, "여")
        );
    }

}
