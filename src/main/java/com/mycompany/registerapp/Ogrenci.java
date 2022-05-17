/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registerapp;

/**
 *
 * @author irfan
 */
public class Ogrenci {
    // Node class
    
    int numara; // key
    String ad;
    int ort;
    String durum;
    Ogrenci next;

    public Ogrenci() {
    next = null;
    }

    public Ogrenci(int numara, String ad, int ort) {
        this.numara = numara;
        this.ad = ad;
        this.ort = ort;
        this.durum =   ort < 50 ? "kaldi" : "gecti";
        next = null;
    }
    
    
    
        
}
