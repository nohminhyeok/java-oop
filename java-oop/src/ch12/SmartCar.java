package ch12;

public class SmartCar extends Car {
	// 상위 부모 순서
	// Object -> Car
	
	public String display;

	// super.onOff()
	
	@Override // 시스템 주석 오버라이딩 했을때 맞는지 아닌지 확인 상속받는 값이 오타가 있으면 찾아줌
	public void onOff() {
		System.out.println("버튼 사용");
	}
	
	
	public static void main(String[] args) {
		SmartCar sc = new SmartCar();
		sc.onOff();
	}
	
}
