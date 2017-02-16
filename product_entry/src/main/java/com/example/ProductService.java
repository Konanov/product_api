package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by user01 on 2/14/17.
 */

@FeignClient(name = "product-client", url = "http://localhost:8080")
public interface ProductService {

    @RequestMapping(method = RequestMethod.GET, value = "/products", produces = "application/json")
    List<Product> findAll();
}
