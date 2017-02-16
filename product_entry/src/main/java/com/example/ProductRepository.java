package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by user01 on 2/13/17.
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByName(@Param("name") String name);

    List<Product> findAll();

}
