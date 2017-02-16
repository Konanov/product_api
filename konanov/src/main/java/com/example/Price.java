package com.example;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by User on 11.02.2017.
 */

@Document(collection = "prices")
public class Price {

    @Id
    private String id;

    private Long productId;

    private double price;

    public Price(Long productId, double price) {
        this.productId = productId;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
