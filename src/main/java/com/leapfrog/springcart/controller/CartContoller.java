/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springcart.controller;

import com.leapfrog.springcart.dao.ProductDAO;
import com.leapfrog.springcart.entity.CartItem;
import com.leapfrog.springcart.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping(value = "/cart")
@SessionAttributes("cartItems")
public class CartContoller {
    @Autowired
    private ProductDAO productDAO;
    private List<CartItem> cartItems=new ArrayList<CartItem>();
    
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public String list(ModelMap map){
        map.addAttribute("items", cartItems);
        return "cart/list";
    }

    @RequestMapping(value = "/add/{id}",method = RequestMethod.POST)
    public String add(HttpServletRequest req,@PathVariable("id")int id){
        CartItem item=new CartItem();
        Product product=productDAO.getById(id);
        item.setId(cartItems.size()+1);
        item.setProduct(product);
        item.setQuantity(Integer.parseInt(req.getParameter("quantity")));
        item.setPrice(Double.parseDouble(req.getParameter("price")));
        cartItems.add(item);
        return "redirect:/cart/list";
    }
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable("id")int id){
        for(CartItem item:cartItems){
            if(item.getId()==id){
                cartItems.remove(item);
            }
        }
        return "redirect:/cart/list";
    }
}
