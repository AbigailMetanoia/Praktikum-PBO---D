/**
 * File: MPoligon.java
 * Penulis: Abigail Metanoia Melody
 * Deskripsi: Representasi dasar dari objek poligon (segi banyak)
 */

package org.main;

import org.bangundatar.*; //semua class di import kedalam main

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(100, 100, 40);
		Segitiga segitiga = new Segitiga(3, 2);
        persegi.printInfo();
		segitiga.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
		System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}