package ch09;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodEx2Main {
	public static void main(String[] args) {
		MethodEx2 m2 = new MethodEx2();
		
		int[] arr = new int[7];
		System.out.println(m2.m24a(arr));
		System.out.println(m2.m24b(arr));
		System.out.println("============================================");

		
		// 디버깅 (변수 값 = Student) < 로깅 ( 전체? 같은  느낌)
		// Student 변수를 디버깅하는 메서드 반환타입 String, 매개타입 Student
		// System.out.println(s.num + "," + s.name);
		Student s = new Student();
		s.num = 2;
		s.name = "조로";
		System.out.println(m2.m25a(s));
		
		// System.out.println(s2.num + "," + s2.name);
		Student s2 = new Student();
		s2.num = 3;
		s2.name = "나미";
		System.out.println(m2.m25a(s2));

		Student s3 = new Student();
		s3.num = 3;
		s3.name = "나미";
		
		// Student 변수를 비교하는 메서드
		System.out.println(s2 == s3); // 주소값이 다른 위치여서 false
		System.out.println(s2.equals(s3)); // false
		System.out.println(m2.m24c(s2, s3)); // false를 true가 나오게 만들기	
		System.out.println("============================================");
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("101");
		list.add("200");
		list.add("999");
		int[] result = m2.m4a(list);
		if(result != null) {
			for(int n : result) {
				System.out.println(n);
			}
		}
		System.out.println("============================================");
		
		
        int inum = 252;
        int[] result3 = m2.m5a(inum);  // 252의 자릿수를 배열로 반환
        for (int inum2 : result3) {
            System.out.println(inum2);  // 2, 5, 2 출력
        }
		System.out.println("============================================1");
		
		
		int num=18887;
		String[] result2 = m2.m5b(num);
		for(String str : result2) {
			System.out.println(str);
		}
		System.out.println("============================================");
		
		
		
		Student student = m2.m6a(8, "로빈");
		System.out.println(m2.m25a(student));
		
		System.out.println("============================================");
		
		ArrayList<HashMap<String, Object>> list1 = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> map1 = new HashMap<String, Object>();
		map1.put("num", 11);
		map1.put("name", "샹크스");
		list1.add(map1);

		HashMap<String, Object> map2 = new HashMap<String, Object>();
		map2.put("num", 21);
		map2.put("name", "버기");
		list1.add(map2);
		
		HashMap<String, Object> map3 = new HashMap<String, Object>();
		map3.put("num", 7);
		map3.put("name", "프랑키");
		list1.add(map3);		
		
		Student[] arr1 = m2.m7a(list1);
		for(Student s1 : arr1) {
			System.out.println(m2.m25a(s1));
		}
		System.out.println("============================================");
		
		
		ArrayList<String> nameList = m2.m8a("루피", "조로", "상디", "나미");
		for(String n : nameList) {
			System.out.println(n);
		}
		System.out.println("============================================");

	
		Student s9 = new Student();
		s9.num = 99;
		s9.name = "티치";
		HashMap<String,Object> map9 = m2.m9a(s9);
		System.out.println(map9.get("num"));
		System.out.println(map9.get("name"));
	}

}