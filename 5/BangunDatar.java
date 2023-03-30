/**
 * BangunDatar.java 10/04/2023
 * Penulis: Abigail Metanoia Melody
 * Deskripsi: Kelas abstrak, berisi abstraksi bangun datar
 */

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getLuas() {
        return this.luas;
    }
}