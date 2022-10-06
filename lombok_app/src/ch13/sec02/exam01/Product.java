package ch13.sec02.exam01;

//제네릭 타입
public class Product<K, M> {
	//필드
	private K kind;
	private M model;
	
	//셍성자
	public Product(K kind, M model) {
		super();
		this.kind = kind;
		this.model = model;
	}
	
	//메소드
	public K getKind() { return this.kind; }
	public M getModel() { return this.model; }
	public void setKind(K kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
}