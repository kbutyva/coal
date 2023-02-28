/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sayan.coal.repository;

import com.sayan.coal.entity.Vizit;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VizitRepository extends JpaRepository<Vizit, Long>{
 
    public Vizit findByPhone(long phone);
    public List<Vizit> findAllByPhone(long phone);
}
