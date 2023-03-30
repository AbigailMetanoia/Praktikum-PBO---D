/**
 * AngkaSialException.java 10/04/2023
 * Penulis: Abigail Metanoia Melody
 * Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13!
 */
 
 public class  AngkaSialException extends Exception{
    public AngkaSialException(){
		super("jangan masukkan angka 13 karena angka sial !!!");
    }
}