package ch11;

public class D extends C{ // A를 상속 받은 후 C를 받음(C가 A를 상속받았기 때문)
	public int k;
	// A + C
	public D() {
		super(); // 부모생성자(C)를 호출하는 것 생략은 가능 C를 호출하고 A를 또 호출
		this.k = 0;
		// this ...
		
		// A() : super.super.x, name, m1()
		// C() : super.z, m3()
		// D() : this.k
	}
	
	public static void main(String args) {
		D d = new D();
		d.x = 1; // this.x 찾고 없으면 super.x 를 찾고 또 없으면 super.super.x 를 찾...
		d.name = "goodee";
		d.m1();
		d.z = 2;
		d.k = 3;
	}
}