package ch06;
import java.util.ArrayList;

public class Car { // 값을 초기화 해도 되지만 안 한다
	public int num; // = 1;
	public boolean is; // = true;
	public String str; //  = null;
	public ArrayList<String> list; // = null;
	public Car() {
		this(1, true);
	}
	public Car(int num, boolean is) {

		this.num = num;
		this.is = is;
	}
	
	
	// this
	public void print() {
		System.out.println(this.num);
	}

	// 생성자
	// 생성자가 없으면 컴파일러가 기계어로 변경할때
	// 기본생성자(매개값이 없는거) 모양으로 자동으로 추가함
	/* public Car() { 
		// 만든거
		this.num = 1;
		this.is = true;
		this.str = "test";
		this.list = new ArrayList<String>();
		list.add("t");
		list.add("b");
	}
	*/
	/* public Car() {
		// 필드 초기화 코드도 자동으로 추가함
		// 필드는 초기화의 규칙이 필요
		// 자동으로 추가된거
		this.num = 0;
		this.is = false;
		this.str = null;
		this.list = null;
	}
	*/
	// 생성자 오버로딩
	// 일반생성자
	
	/*
	public Car(int num) {
		// 컴파일러가 일반생성자가 존재하므로 기본생성자를 추가하지 않음
		// 생성자안에 field 초기화 코드가 없다면 -> 컴파일러가 자동으로 추가함
		this.num = num;
	}
	public Car(boolean is) {
		// 컴파일러가 일반생성자가 존재하므로 기본생성자를 추가하지 않음
		// 생성자안에 field 초기화 코드가 없다면 -> 컴파일러가 자동으로 추가함
		this.is = is;
	}
	public Car(int num, boolean is) {
		this.is = is;
		this.num = num;
	}

	// 메서드 오버로딩이라 부름
	public void test() {}
	public void test(int x) {}
	*/
}
