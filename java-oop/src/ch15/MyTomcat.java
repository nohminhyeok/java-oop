package ch15;

public class MyTomcat {
	
	// 클라이언트(웹브라우저)의 요청이 있을때 마다 service()호출되는 구조
	public void service(Jsp jsp) { // Jsp 객체 a.jsp, b.jsp, ... jsp 파일
		jsp.post(); // Jsp => html
	}
	
	public static void main(String[] args) {
		MyTomcat t = new MyTomcat();
		// 클라이언트 (웹브라우저)의 요청이 있을때 마다 service() 호출되는 구조
		t.service(new Ajsp());
		t.service(new LoginAction());
	}
}
