package abstractClasses;

public abstract class GameCalculate {
	public abstract void caculate(); //method imzas�n� tutar.
	
	public final void gameOver() {// tamamlanm�� method final methodun overriding etmesini engeliyor miras alan classlar methodu bu �ekilde kullanmak zorundad�rlar
		System.out.println("Oyun bitti...");
	}

}
