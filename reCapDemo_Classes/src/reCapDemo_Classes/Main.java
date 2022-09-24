package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int toplam = dortIslem.topla(23, 12);
		int cikarma = dortIslem.cikar(23, 12);
		int carpma = dortIslem.carp(12, 23);
		double bolme = dortIslem.bolme(23, 12);

		System.out.println(toplam);
		System.out.println(cikarma);
		System.out.println(carpma);
		System.out.println(bolme);

	}

}
