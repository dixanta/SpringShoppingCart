/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springcart.dao.impl;

import com.leapfrog.springcart.dao.ProductDAO;
import com.leapfrog.springcart.entity.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository(value = "ProductDAO")
public class ProductDAOImpl implements ProductDAO {
    
    @Override
    public List<Product> getAll() {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(1, "Sunsilk Shampoo", "Sunsilk Shampoo",100,200, true));
        productList.add(new Product(2, "Dove Shampoo", "Dove Shampoo",100,200, true));
        productList.add(new Product(3, "Pantene Shampoo", "Pantene Shampoo",100,200, true));
        productList.add(new Product(4, "Garnier Shampoo", "Garnier Shampoo",100,200, true));
        return productList;
    }

    @Override
    public Product getById(int id) {
        for(Product p:getAll()){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }
    
}
