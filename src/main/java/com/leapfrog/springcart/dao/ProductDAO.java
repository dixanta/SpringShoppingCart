/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springcart.dao;

import com.leapfrog.springcart.entity.Product;
import java.util.List;

/**
 *
 * @author USER
 */
public interface ProductDAO {
    List<Product> getAll();
    Product getById(int id);
}
