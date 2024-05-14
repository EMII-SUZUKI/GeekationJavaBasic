package objectExercise;

public class Land extends Property {
	private double area;

	public Land(String name, String owner, double price, double area) {
		super(name, owner, "土地", price);
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("広さ：" + area + "㎡");
		System.out.println("=============================");
	}
}
