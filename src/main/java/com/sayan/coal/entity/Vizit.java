package com.sayan.coal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vizit {
    
    @Id
    @GeneratedValue
    private long id;
    
    private long phone;
    
    LocalDate date;
    
//    String marka;
//    String model;
//    int gosNomer;
    
    private String ulitsa;
    private String dom;
    private int kv;
    
    private float price;
//    float weight;
//    float sum;
    
    
}
