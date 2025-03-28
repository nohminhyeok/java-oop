package ch05;

public class ClassMember {
		// 1. static : ClassMember 무관하고 공관과 이름만을 빌려다 쓰는 요소들
		// 1-1) static method	
		public static void sFun() {
			System.out.println("sFun()");
		}
		// 1-2) static field
		public static int x = 1+1 ;
		
		public static int[] arr = new int[3];
		
		// 1-3) static block
		static {
			for(int i=0; 1<ClassMember.arr.length; i++) {
				int rNum = (int)(Math.random()+10) +1;
				ClassMember.arr[i] = rNum;
			}
		}

		// 2. METHOD
		public void fun() {
			System.out.println("fun()");
			// 위를 실행하기 위해선 ClassMember cm(객체) = new ClassMember(); cm.fun(); <-- 식이 필요함
		}
		
		// 3. 필드
		public String name;
		
		// 4. 생성자
		public ClassMember() { // 없으면 기본형태로 자동으로 생성됨(컴파일러)
			// 필드 초기화 코드가 없다면 자동으로 코드가 구현됨(컴파일러)
			this.name=null;
		}
		public class Inclass{} // 내부클래스 맹글기
		public enum InEnum{ // 내부 Enum 맹글기
			x, y
		}
		public interface InInterface{} // 내부 인터페이스 맹글기
		public @interface InAnnotation{} // 내부 애노테이션
}
