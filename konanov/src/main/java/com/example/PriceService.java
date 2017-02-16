package com.example;

import org.apache.catalina.Store;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public interface PriceService {
    @RequestMapping(method = RequestMethod.GET, value = "/stores")
    List<Price> getStores();

    @RequestMapping(method = RequestMethod.POST, value = "/stores/{storeId}", consumes = "application/json")
    Store update(@PathParam("storeId") Long storeId, Store store);
}
