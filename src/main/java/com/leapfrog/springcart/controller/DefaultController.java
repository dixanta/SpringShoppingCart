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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping(value="/")
public class DefaultController {
    
    @Autowired
    private ProductDAO productDAO;
    @RequestMapping(method = RequestMethod.GET)
    
    public String index(ModelMap map){
        map.addAttribute("products", productDAO.getAll());
        return "index";
    }
}
