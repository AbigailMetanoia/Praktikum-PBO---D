/**
 * File: PersegiPanjang.java
 * Penulis: Abigail Metanoia Melody
 * Deskripsi: Representasi dasar dari objek poligon (segi banyak)
 */

package org.bangundatar;

import org.poligon.poligon;

public class PersegiPanjang extends poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public void printInfo() {
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}
