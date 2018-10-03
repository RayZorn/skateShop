package skateshop;

public class Shoes {
	
	int qty;
	String brand;
	double price;
	
	
	public Shoes(int qty, String brand, double d) {
		super();
		this.qty = qty;
		this.brand = brand;
		this.price = d;
	}

	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
