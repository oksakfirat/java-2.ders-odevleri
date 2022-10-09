package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCrediManager[] kredis=new BaseCrediManager[] {new OgretmenCrediManager(),new TarimCrediManager(),new OgrenciCrediManager()};
		for (BaseCrediManager kredi : kredis) {
			System.out.println(kredi.hesapla(1000));
			
		}

	}

}
