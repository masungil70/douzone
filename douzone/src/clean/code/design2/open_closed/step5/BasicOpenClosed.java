package clean.code.design2.open_closed.step5;

import java.util.ArrayList;
import java.util.List;

enum Color {
	RED, GREEN, BLUE
}

enum Size {
	SMALL, MEDIUM, LARGE
}

class Product {
	private String name;
	private Color color;
	private Size size;

	public Product(String name, Color color, Size size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public Size getSize() {
		return size;
	}

}

class ProductFilter {
	static List<Product> by_color(List<Product> items, Color color) {
		List<Product> result = new ArrayList<Product>();

		for (Product item : items) {
			if (item.getColor() == color) {
				result.add(item);
			}
		}
		return result;
	}
}

public class BasicOpenClosed {

	public static void main(String[] args) {

		Product apple = new Product("사과", Color.GREEN, Size.SMALL);
		Product tree = new Product("나무", Color.GREEN, Size.LARGE);
		Product house = new Product("말", Color.BLUE, Size.LARGE);
		List<Product> all = new ArrayList<Product>();
		all.add(apple);
		all.add(tree);
		all.add(house);

		List<Product> greenItems = ProductFilter.by_color(all, Color.GREEN);
		for (Product item : greenItems) {
			System.out.println(item.getName() + " is green");
		}
	}

}
