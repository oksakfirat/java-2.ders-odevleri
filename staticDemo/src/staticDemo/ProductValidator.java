package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static Yap�c� Blok �al��t� ");
	}
	public ProductValidator() {
		System.out.println("Yap�c� Blok �al��t�");
	}
	public static boolean isValid(Product product) { // methodu static yapt���m�zda class�n ismi ile do�rudan �a��rabiliriz. 
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	
		
	}
	
	

}
