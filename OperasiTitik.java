/**
*OperasiTitik.java 01/3/2022
*Penulis : Abigail Metanoia Melody
*Deskripsi : Kelas OperasiTitik
*/

public class OperasiTitik{
	
	public void refleksiSumbuX(Titik titik){
		double y = titik.getOrdinat();
		
		y *= -1;
		titik.setOrdinat(y);
	}
	public void refleksiSumbuY(Titik titik){
		double x = titik.getAbsis();
		
		x *= -1;
		titik.setAbsis(x);
	}
	
	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}
	
	public Titik refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return titik;
	}
	
}