package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem=new DortIslem();
		int toplama=dortIslem.topla(5, 8);
		System.out.println(toplama);
		int toplama2=dortIslem.topla(2, 6, 7);
		System.out.println(toplama2);
		
	}

}
