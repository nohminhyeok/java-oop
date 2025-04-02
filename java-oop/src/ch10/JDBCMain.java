package ch10;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import dto.Actor;

public class JDBCMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// MVC (model view controller)
		// 1)키보드를 통해 매개값 입력받기 (컨트롤러 역할)
		Scanner scanner = new Scanner(System.in);
		System.out.println("firstName을 입력하세요: ");
		String firstName = scanner.nextLine();
		System.out.println("lastName을 입력하세요: ");
		String lastName = scanner.nextLine();
		System.out.println("firstName: "+firstName);
		System.out.println("lastName: "+lastName);
		scanner.close();
		// 2) 매개값으로 묶은거 (컨트롤러 역할)
		Actor actor = new Actor();
		actor.setFirstName(firstName);
		actor.setLastName(lastName);

		// 3) 입력 insert 모듈(메서드) 호출 (컨트롤러 역할)
		ActorDAO actorDao = new ActorDAO();
		int row = actorDao.insertActor(actor);
		
		// 4) 조회 select 모듈(메서드) 호출 (컨트롤러 역할)
		ArrayList<Actor> list = actorDao.selecctActorList(5);
		
		// 5) 출력 (뷰 역할)
		for(Actor a : list) {
			System.out.println(a.getActorId()+"\t"+ a.getFirstName()+"\t"+ a.getLastName()+"\t"+a.getLastUpdate());
		}
	}
}