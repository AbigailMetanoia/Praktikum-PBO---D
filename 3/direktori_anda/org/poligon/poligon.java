/**
 * File: Poligon.java
 * Penulis: Abigail Metanoia
 * Deskripsi: Representasi dasar dari objek poligon (segi banyak)
 */

package org.poligon;

public class poligon {
    protected int jumlahSisi; //hanya dapat diakses oleh turunannya
	
	public poligon(){
        this.jumlahSisi = 0;
    }

    public void setJumlahSisi(int jumlahSisi){
        this.jumlahSisi = jumlahSisi;
    }
	
    public int getJumlahSisi() {
        return this.jumlahSisi;
    }
}