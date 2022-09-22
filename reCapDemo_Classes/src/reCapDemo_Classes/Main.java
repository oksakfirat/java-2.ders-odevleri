package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int toplam = dortIslem.Topla(23, 12);
		int cikarma = dortIslem.Cikar(23, 12);
		int carpma = dortIslem.Carp(12, 23);
		double bolme = dortIslem.Bolme(23, 12);

		System.out.println(toplam);
		System.out.println(cikarma);
		System.out.println(carpma);
		System.out.println(bolme);

	}

}
