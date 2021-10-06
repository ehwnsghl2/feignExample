package com.branjunhoe.feignoneservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Create by DJH on 2021/10/05.
 */
@FeignClient(name = "feign-user", url = "http://localhost:8081")
public interface FeignUserClient {

    @GetMapping("/api/home/users")
    public List<User> getUsers();

}
