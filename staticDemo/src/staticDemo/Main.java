package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		Product product=new Product();
		product.id=1;
		product.name="Kahve";
		product.price=20;
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.creatConnection();//Static yapýlmýþ

	}

}
