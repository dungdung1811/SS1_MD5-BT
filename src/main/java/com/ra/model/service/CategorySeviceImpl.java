package com.ra.model.service;

import com.ra.model.entity.Category;
import com.ra.model.repository.CategoryReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategorySeviceImpl implements  CategoryService{
    @Autowired
    CategoryReponsitory categoryReponsitory;
    @Override
    public List<Category> findAll() {
        return categoryReponsitory.findAll();
    }
    @Override
    public Boolean create(Category category) {
        return categoryReponsitory.create(category);
    }

    @Override
    public Category saveOrUpdate(Category category) {
        return categoryReponsitory.saveOrUpdate(category);
    }
    @Override
    public Category findById(Integer integer) {
        return categoryReponsitory.findById(integer);
    }
    @Override
    public void delete(Integer id) {
        categoryReponsitory.delete(id);
    }


}
