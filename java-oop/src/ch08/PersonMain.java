package ch08;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.HashMap;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("admin" , "1234");
		// p1.id = admin,  p1.pw = 1234

		
		// 1-1
		p1.m11(); // hello
		p1.m11a(); // Good Morning
		
		
		// 1-2
		p1.m12(9); // AM
		Calendar c = Calendar.getInstance();
		int h = c.get(Calendar.HOUR);
		p1.m12(h); // AM
		p1.m12a(false); // true
		// 매개변수로 값이 전달
		boolean x = false;
		p1.m12a(x); // true > x의 값인 false 가 flag에 입력
		System.out.println(x); // false
		
		
		// 1-3
		p1.m13a(null);
		p1.m13a("홍길동");
		String name="신사임당";
		p1.m13a(name);
		
		p1.m13b("admin", "1234");
		p1.m13b("guest", "1234");
		
		
		// 1-4
		int[] arr = new int[5];
		p1.m14a(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");			
		}
		System.out.println("");
		
		// 1-5
		String[] names = new String[2];
		names[0] = "루피";
		names[1] = "조로";
		p1.m15a(names);
		
		// 1-6
		Data d = new Data(7, 7);
		p1.m16a(d);
		System.out.println(d.x);
		System.out.println(d.y);
		
		
		// 1-7
		Data[] datas = new Data[4];
		datas[0] = new Data(13, 100);
		datas[1] = new Data(23, 200);
		datas[2] = new Data(20, 300);
		datas[3] = new Data(39, 400);
		p1.m17a(datas);
		p1.m17b(datas, 400);
		
		// 1-8
		ArrayList<Integer> year = new ArrayList<Integer>();
		int y = 2000;
		for(int i=0; i<50; i++) {
			year.add(y);
			y=y+1;
		}
		p1.m18a(year);
		
		// 1-9
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("name", "샹크스");
		map.put("age", 40);
		String[] myHobby = {"술","패왕색","견문색","카무사리","밀집모자 짬처리하기"};
		map.put("hobby", myHobby);
		Data myData = new Data(7, 11);
		map.put("data", myData);
		
		p1.m19a(map);
	}

}