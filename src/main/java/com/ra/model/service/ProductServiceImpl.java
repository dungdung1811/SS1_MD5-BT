package com.ra.model.service;

import com.ra.model.entity.Product;
import com.ra.model.repository.ProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProductServiceImpl  implements ProductService{
    @Autowired
    ProductReponsitory productReponsitory;
    @Override
    public List<Product> findAll() {
        return productReponsitory.findAll();
    }

    @Override
    public Product saveOrUpdate(Product product) {
        return productReponsitory.saveOrUpdate(product);
    }

    @Override
    public Product findById(Integer integer) {
        return productReponsitory.findById(integer);
    }

    @Override
    public void delete(Integer integer) {
        productReponsitory.delete(integer);

    }

    @Override
    public Boolean create(Product product) {
        return productReponsitory.create(product);
    }
}
