package ablock;

public class One {
	public int a;     // 모두 사용 가능
	protected int b; // 부모 자식관계에서 사용 가능
	int c; 			// ?
	private int d; // 자기 자신만 사용 가능 
	
	public void test() {
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;
	}
}
