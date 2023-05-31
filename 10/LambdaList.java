/**
 * File : LambdaList.java 31/05/2023
 * Nama : Abigail Metanoia Melody
 * NIM  : 24060121120038
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter pada method.
 */
 import java.util.ArrayList;
 public class LambdaList{
	public static void main (String[] args){
	ArrayList<String> mahasiswaList = new ArrayList<>();
	mahasiswaList.add("Adi");
	mahasiswaList.add("Bambang");
	mahasiswaList.add("Cici");
	mahasiswaList.add("Didi");
	 
	
	mahasiswaList.forEach((nama)-> System.out.println(nama));
	
	}
 
 }
