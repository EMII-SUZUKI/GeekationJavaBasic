package objectExercise;

public class Property {
	private String name;
	private String owner;
	private String type;
	private double price;

	public Property(String name, String owner, String type, double price) {
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void printInfo() {
		System.out.println("=============================");
		System.out.println("物件名：" + name);
		System.out.println("物件所有者名：" + owner);
		System.out.println("物件種別：" + type);
		System.out.println("物件価格：" + String.format("%,.0f", price) + "円");
	}
}