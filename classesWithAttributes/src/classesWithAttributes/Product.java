package classesWithAttributes;

public class Product {
	public Product() {//parametresiz constructor
		
	}
	public Product(int id,String name,String description,double price,int stockAmount,String color) {//Constructor Product class�n� newledi�imizde otomotik olarak �al���r class ile ayn� ad� al�r.
		System.out.println("Yap�c� blok �al��t�");
		this.id=id;
		this.name=name;
		this.description=description;
		this.stockAmount=stockAmount;
		this.color=color;
		this.price=price;
		
	}
	
	// Attributes / Field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getKod() {
		return "L1";
	}

}
