package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by User on 12.02.2017.
 */

public interface PriceRepository extends MongoRepository<Price, String> {

    public Price findByProductId(String productId);
}
