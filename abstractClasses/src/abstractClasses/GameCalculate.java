package abstractClasses;

public abstract class GameCalculate {
	public abstract void caculate(); //method imzasını tutar.
	
	public final void gameOver() {// tamamlanmış method final methodun overriding etmesini engeliyor miras alan classlar methodu bu şekilde kullanmak zorundadırlar
		System.out.println("Oyun bitti...");
	}

}
