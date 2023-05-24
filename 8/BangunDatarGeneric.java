/**
 * File : BangunDatarGeneric.java 24/05/2023
 * Nama : Abigail Metanoia Melody
 * NIM  : 24060121120038
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 */
public class BangunDatarGeneric<T2 extends BangunDatar> {
    private T2 bangunDatar;

    public void set(T2 tipeBangunDatar) {
        this.bangunDatar = tipeBangunDatar;
    }

    public T2 get() {
        return this.bangunDatar;
    }

    public double hitungKeliling() {
        return this.bangunDatar.hitungKeliling();
    }
}