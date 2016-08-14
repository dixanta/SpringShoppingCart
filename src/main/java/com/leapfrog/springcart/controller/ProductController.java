/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springcart.controller;

import com.leapfrog.springcart.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductDAO productDAO;
    public String index(){
        return null;
    }
    
    @RequestMapping(value = "/{id}")
    public String detail(ModelMap map,@PathVariable("id") int id){
        map.addAttribute("product",productDAO.getById(id));
        return "product/detail";
    }
}
