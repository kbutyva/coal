/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sayan.coal.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author kbuty
 */

@Controller
public class WebController {
    
    @RequestMapping("/logout")
    public String all(){
        return "all";
    }
    
    @RequestMapping("/index")
  
    public String index(){
        return "index";
    }
    
    @RequestMapping("/search")
  
    public String search(){
        return "search";
    }
}
