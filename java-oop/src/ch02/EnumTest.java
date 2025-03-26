package ch02;

public class EnumTest {
	public static void main(String[] args) {
		char gender = 'M'; // M, F가 아닌 다른 값이 올 수 있음

		if(gender == 'M') {
			System.out.println("남자");
		} else if(gender == 'F'){
			System.out.println("여자");
		} else {
			System.out.println("잘못된 값입니다.");
		}
		
		// Enum 사용시 잘못된 값이 대입될 수 있다.
		
		Gender gender2 = null;
		gender2 = Gender.MALE;
		
		if(gender2 == Gender.MALE) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		// Enum 사용시 if보다 switch가 가독성이 좋을 수 있다.(else if else 사용 안 해서)
		switch(gender2) {
		case Gender.MALE:
			System.out.println("남자");
			break;
		case Gender.FEMALE:
			System.out.println("여자");
			break;
		}
	}

}
