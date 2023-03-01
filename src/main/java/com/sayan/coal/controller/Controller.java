/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sayan.coal.controller;

import com.sayan.coal.entity.Vizit;
import com.sayan.coal.repository.VizitRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    
    @Autowired
    VizitRepository vizitRepository;
    
    @GetMapping("/allVizits")
    public List<Vizit> getVizits(){
        List<Vizit> list = new ArrayList<>();
        vizitRepository.findAll().forEach(list::add);
        return list;
    }
    
    @GetMapping("/vizits")
    public List<Vizit> getLast10Vizits(){
        List<Vizit> list = new ArrayList<>();
        vizitRepository.findLast10Vizits().forEach(list::add);
        return list;
    }
    
    @PostMapping("/add")
    public void addVizit(@RequestBody Vizit vizit){
        LocalDate date = LocalDate.now();
        vizit.setDate(date);
        vizitRepository.save(vizit);
    }
    @GetMapping("/search/byPhone")
    public List<Vizit> findVizit(@RequestParam("phone") long phone){
        List<Vizit> list = new ArrayList<>();

        vizitRepository.findAllByPhone(phone).forEach(list::add);
        System.out.println(list);
         return list;   
    }
//    @PostMapping("/add")
//    public void addVizit(long phone, String ulitsa, String dom, int kv){
//        Vizit vizit = new Vizit(phone, ulitsa, dom, kv);
//        
//        vizitRepository.save(vizit);
//    }
}
