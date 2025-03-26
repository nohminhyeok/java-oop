package ch03;
// import ch03.*;
// import java.lang.*;
// 자동으로 만들어 짐

public class Car {
	public Car() {} // 생성자라 부름, 만들지 않아도 컴파일러에 의해 자동으로 생성, 숫자는 0, String은 null 등 자동으로 입력
	
	public boolean onOff;
	public String name;
	public String color;
	
	public void move() {
		System.out.println("move");
	}
}
