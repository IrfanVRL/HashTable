/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registerapp;

/**
 *
 * @author irfan
 */
public class Tablo {

    // hash table
    Ogrenci dizi[];
    int size;

    public Tablo(int size) {
        this.size = size;
        dizi = new Ogrenci[size];
        for (int i = 0; i < size; i++) {
            dizi[i] = new Ogrenci();

        }
    }

    int indisUret(int numara) {
        return numara % size;
    }

    void ekle(int numara, String ad, int ort) {
        int indis = indisUret(numara);

        Ogrenci ogr = new Ogrenci(numara, ad, ort);

        Ogrenci temp = dizi[indis];

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = ogr;
        System.out.println(ad + " eklendi");
    }

    void sil(int numara) {
        int indis = indisUret(numara);
        Ogrenci temp = dizi[indis];
        Ogrenci temp2 = temp;
        boolean sonuc = false;
        if (temp.next == null) {
            sonuc = true;
            System.out.println(numara + " numarali ogrenci yok");

        } else if (temp.next.next == null && temp.next.numara == numara) {
            sonuc = true;
            temp.next = null;
            System.out.println(numara + " numarali ogrenci silindi");
        } else {
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
                if (temp.numara == numara) {
                    sonuc = true;
                    temp2.next = temp.next;
                    System.out.println(numara + " numarali ogrenci silindi");

                }
            }
        }
        if (sonuc = false) {
            System.out.println(numara + " numarali ogrenci kaydi bulunamadi");

        }

    }

    void yazdir() {
        System.out.println("Numara\tAd\tortalama\tdurum");
        for (int i = 0; i < size; i++) {
            Ogrenci temp = dizi[i];
            while (temp.next != null) {
                System.out.println(temp.next.numara + "\t" + temp.next.ad + "\t" + temp.next.ort + "\t" + temp.next.durum);
                temp = temp.next;
            }
        }
    }

    void ara(int numara) {
        boolean sonuc = false;
        int indis = indisUret(numara);
        Ogrenci temp = dizi[indis];
        while (temp.next != null) {
            

            if (temp.next.numara == numara) {
                sonuc = true;
                System.out.println(numara + " numarali ogrenci bilgileri");
                System.out.println("ad      :" + temp.next.ad);
                System.out.println("ortalama      :" + temp.next.ort);
                System.out.println("durum      :" + temp.next.durum);
                

            }
            temp = temp.next;
        }
        if (sonuc=false) {
            System.out.println(numara + " numarali ogrenci bulunamadi");
                    
        }
    }
}
