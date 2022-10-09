package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static Yapýcý Blok çalýþtý ");
	}
	public ProductValidator() {
		System.out.println("Yapýcý Blok çalýþtý");
	}
	public static boolean isValid(Product product) { // methodu static yaptýðýmýzda classýn ismi ile doðrudan çaðýrabiliriz. 
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	
		
	}
	
	

}
