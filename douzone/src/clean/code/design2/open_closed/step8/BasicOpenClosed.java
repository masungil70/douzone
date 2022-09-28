package clean.code.design2.open_closed.step8;

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

//조건을 비교할 수 있는 템플릿 클래스 선언 
abstract class Specification<T> {
	abstract boolean is_satisfied(T item);
}

//목록을 대상으로 하여 조건에 맞는 자료를 찾을 수 있는 템플릿 필터 기능 클래스 
abstract class Filter<T> {
	abstract List<T> filter(List<T> items, Comparable<T> comparable);
}


//좀더 나은 필터를 구현한다 
class BetterFitler<T> extends  Filter<T> {
	@Override
	public List<T> filter(List<T> items, Comparable<T> comparable) {
      List<T> result = new ArrayList<T>();
      for (T item : items) {
          if (comparable.compareTo(item) == 0) {
              result.add(item);
          }
      }
      return result;
  }

}

//색상에 대한 조건 검색 기능 구현  
class ColorComparable implements Comparable<Product> {
    private Color color;
    public ColorComparable(Color color) {
    	this.color = color;
    }
    
	@Override
	public int compareTo(Product o) {
		return o.getColor().ordinal() - color.ordinal();
	}
 
}

//크기에 대한 조건 검색 기능 구현  
class SizeComparable implements Comparable<Product> {
	private Size size;

	public SizeComparable(Size size) {
		this.size = size;
	}
  
	@Override
	public int compareTo(Product o) {
		return o.getSize().ordinal() - size.ordinal();
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

	    BetterFitler<Product> betterFilter = new BetterFitler<Product>();
	    ColorComparable green = new ColorComparable(Color.GREEN);

	    List<Product> greenItems = betterFilter.filter(all, green);
		for (Product item : greenItems) {
			System.out.println(item.getName() + " is green");
		}
		
	    SizeComparable size = new SizeComparable(Size.LARGE);

	    List<Product> sizeItems = betterFilter.filter(all, size);
		for (Product item : sizeItems) {
			System.out.println(item.getName() + " is large");
		}		
		
	}

}
