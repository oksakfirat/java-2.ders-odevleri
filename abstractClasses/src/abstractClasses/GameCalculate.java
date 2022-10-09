package abstractClasses;

public abstract class GameCalculate {
	public abstract void caculate(); //method imzasýný tutar.
	
	public final void gameOver() {// tamamlanmýþ method final methodun overriding etmesini engeliyor miras alan classlar methodu bu þekilde kullanmak zorundadýrlar
		System.out.println("Oyun bitti...");
	}

}
