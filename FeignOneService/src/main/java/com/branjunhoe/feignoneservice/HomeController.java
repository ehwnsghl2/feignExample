package com.branjunhoe.feignoneservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create by DJH on 2021/10/05.
 */
@RestController
@RequestMapping("/api/home")
public class HomeController {

    private final FeignUserClient feignUserClient;

    public HomeController(FeignUserClient feignUserClient) {
        this.feignUserClient = feignUserClient;
    }

    @GetMapping
    public String helloWorld() {
        return "FeignOneService HelloWorld";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return feignUserClient.getUsers();
    }

}
