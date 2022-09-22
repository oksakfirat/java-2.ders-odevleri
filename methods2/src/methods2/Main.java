package methods2;

public class Main {

	public static void main(String[] args) {
		//oluþturduðumuz methodlarý çaðýrýyoruz
		String sehir = sehirVer();
		int number = total(5, 9);
		System.out.println(sehir);
		System.out.println(number);
		
		int total2=total2(2,5,7,93,8);
		System.out.println(total2);
	}

	public static void add() {
		System.out.println("Eklendi");

	}

	public static void delete() {
		System.out.println("Silindi");
	}

	public static void update() {
		System.out.println("Güncellendi");

	}

	public static int total(int number1, int number2) {//iki parametreli int tipinde method oluþturduk. 
		return number1 + number2;
	}
	
	public static int total2(int... numbers) {//int... birden fazla deðer göndermemizi saðlar
		int total=0;
		for(int number:numbers) {//gelen sayýlarý for döngüsü ile taplayýp return ettik.
			total=total+number;
		}
		return total;
		
	}

	public static String sehirVer() {//String tipinde methdo oluþturduk.
		return "Bingöl-Elazýð";
	}
}
