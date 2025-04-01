package ch09;
import java.util.ArrayList;
import java.util.HashMap;

public class MethodEx2 {
	// 반환타입 : 숫자, 매개타입 : 배열(.length API 사용금지)
	// 배열을 입력하면 반환값으로 배열의 길이가 반환
	public int m24a(int[] arr) { // ex) int x = new int[7]
		int result = 0;
	      for (int a : arr) {
	          result++;
	       }
	    return result;
	}
	public int m24b(int[] arr) {
		int i=0;		// arr.length 사용 금지
		boolean flag = true;
		while(flag) { 		// 무한루프
			try {
				int temp = arr[i];
			} catch(Exception e) {
				return i;
			}
			i++;
		}
		return i;
	}	
	public boolean m24c(Student s2, Student s3) {
		boolean result = false;
		// s1, s2 를 비교하는 코드
		if(s2.num == s3.num && s2.name.equals(s3.name)) {
			result = true;
		}
		return result;
	}
	
	
	// Student 타입을 디버깅한 문자열을 반환하는 메서드
	// 반환타입 : String, 매개타입 : 클래스 하나
	public String m25a(Student s) {
		String result = "";
		result += "번호는 "+ s.num + "이고, ";
		result += "이름은 "+ s.name + "입니다.";
		return result; // 번호는 ?이고, 이름은 ?입니다.
	}
	
	
	// 반환타입 : 배열, 매개타입 : ArrayList
	// ArrayList를 입력받아서 배열로 변경하여 반환
	public int[] m4a(ArrayList<String> list) {
		int[] result = new int[list.size()]; // list의 크기만큼 배열
		int i = 0;
		for(String s : list) {
			result[i] = Integer.parseInt(s);
			i++;
		}
		return result;
	}
	
	
	// 오전 과제....
	// 반환타입 : 배열, 매개타입 : int
	// 252를 입력 받았으면 {2, 5, 2} 로 
    public int[] m5a(int num) {
        int length = 0;
        int i = num;
        
        if (num == 0) {
            length = 1;
        } else {
            // 숫자의 자릿수를 구하기
            while (num != 0) {
                num /= 10;
                length++;
            }
        }
        
        int[] result = new int[length]; // 결과 배열

        // 원래 숫자로 돌아가서 각 자릿수를 배열에 넣기
        for (int j = length - 1; j >= 0; j--) {
            result[j] = i % 10;  // i의 마지막 자릿수 구해서 배열에 저장
            i /= 10;  // i를 10으로 나누어 한 자릿수를 줄임
        }

        return result;  // 결과 배열 반환
    }
	
	// 252 -> {"2", "5", "2"}
	public String[] m5b(int num) { // substring() 메서드
		String[] result = null;
		String str = num+""; 
		result = new String[str.length()];
		for(int i=0; i<result.length; i++) {
			if(i != result.length-1) {
				result[i] = str.substring(i, i+1); // (0,1) (1,2)
			} else { // (2)
				result[i] = str.substring(i);
			}
		}
		return result;
	}
	
	
	// 반환타입 : 클래스, 매개타입 : int, String
	public Student m6a(int num, String name) {
		Student s = new Student();
		s.num = num;
		s.name = name;
		return s;
	}
	
	
	
	// 반환타입 : 클래스의 배열 Student[], 매개타입 : ArrayList<HashMap>
	public Student[] m7a(ArrayList<HashMap<String, Object>> list) {
		Student[] arr = new Student[list.size()];
		int i = 0;
		for(HashMap<String,Object> m : list) {
			arr[i] = new Student();
			arr[i].num = (Integer)(m.get("num"));
			arr[i].name = (String)(m.get("name"));
			i++;
		}
		return arr;
	}
	
	
	// 반환타입 : ArrayList<String>, 매개타입 : 임의의 개수의 문자열
	public ArrayList<String> m8a(String ... name) { // ... < 몇개가 들어올지 모를때
		ArrayList<String> result = new ArrayList<String>();
		for(String n : name) {
			result.add(n);
		}
		return result;
	}
	
	
	// 반환타입 : HashMap, 매개타입 : Student
	public HashMap<String, Object> m9a(Student s){
		HashMap<String,Object> result = new HashMap<String, Object>();
		result.put("num", s.num);
		result.put("name", s.name);
		return result;
	}
}
