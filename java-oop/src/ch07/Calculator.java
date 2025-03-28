package ch07;

public class Calculator {
	public Calculator() {
		this.power = false;
	}
	public boolean power;
	public int num;
	
	// this.num * (0.5 ~ 1.5)
	public double setRateNum(double rate) {
		double result = 0;
		if(!this.power) { // this.power == false
			System.out.println("계산기가 OFF 상태입니다.");
		} else {
			if(!(rate >= 0.5 && rate <= 1.5)) {
				System.out.println("입력값 ERROR");
			} else {
				result = this.num * rate;
			}
		}
		return result;
	}
	
	
	
	
	
	public void setPower() {
		this.power = !this.power;
	}
	
	public void setNum(int num) {
		// 계산기 파워가 ON(true)일때만 실행
		if(this.power) { // this.power == true
			this.num = num;
		} else {
			System.out.println("계산기가 OFF 상태입니다.");
		}
			
	}
	
	// this.num이 짝수인지 홀수인지 알고싶은 메소드
	public String checkNum() {
		String result = "";
		if(this.power == false) { // !this.power
			System.out.println("계산기가 OFF 상태입니다");
			result = "ERROR";
		} else {
			if(this.num % 2 == 0) {
				result = "짝수";
			} else {			
			}
			result = "홀수";
		}
		return result;
	}
}