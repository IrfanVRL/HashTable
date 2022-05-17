/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.registerapp;

import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class RegisterApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numara, ort;
        String ad;
        Tablo ht = new Tablo(5);
        int secim = 1;

        while (secim != 0) {
            System.out.println("1 - ekle");
            System.out.println("2 - sil");
            System.out.println("3 - ara");
            System.out.println("4 - yazdir");
            System.out.println("0 - kapat");
            System.out.println("Seciminiz -> ");
            secim = sc.nextInt();

            if (secim == 1) {
                System.out.println("ad : ");
                ad = sc.next();

                System.out.println("numara : ");
                numara = sc.nextInt();

                System.out.println("ort : ");
                ort = sc.nextInt();
                ht.ekle(numara, ad, ort);
            }
            if (secim == 2) {
                System.out.println("numara : ");
                numara = sc.nextInt();
                ht.sil(numara);
            }
            if (secim == 3) {
                System.out.println("numara : ");
                numara = sc.nextInt();
                ht.ara(numara);
            }
            if (secim == 4) {
                ht.yazdir();
            }
            if (secim == 0) {
                System.out.println("bye bye");
                break;
            }
        }

    }
}
