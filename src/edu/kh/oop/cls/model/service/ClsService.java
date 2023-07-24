package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
//import edu.kh.oop.cls.model.vo.TestVO;
// The type edu.kh.oop.cls.model.vo.TestVO is not visible
import edu.kh.oop.cls.model.vo.User;

public class ClsService /*extends Student*/ {
						// 부모 Student를 상속받음

	public void ex1() {
		
		// 클래스 접근 제한자 확인하기
		
		Student std = new Student();
		// public class인 Student는 import가 가능
		
		//TestVO test = new TestVO();
		// (default) class인 TestVO는 import 불가(다른패키지)
		
		System.out.println(std.v1);
		// 다른 패키지에서도 접근 가능한 public만 에러 X
		
		//System.out.println(std.v2);
		//System.out.println(std.v3);
		//System.out.println(std.v4);
		
		
		// 상속 관계에서 직접 접근 가능
	}
	
	public void ex2() {
		
		// static 필드 확인 예제
		
		// 학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		// 학생 객체에 name 세팅
		std1.setName("홍길동");
		std2.setName("김영희");
		
		// 정보 출력
		System.out.println(std1.schoolName); // public 이기 때문에 직접 접근 가능
		
		// schoolName에 노란 줄이 뜨는 이유 -> 제대로 작성을 안해서
		
		// *** static이 붙은 필드(변수)는 '클래스명.변수명' 으로 사용함 ***
		System.out.println(Student.schoolName);
		
		Student.schoolName = "KH";
		System.out.println("변경 후 : " + Student.schoolName);
		
		/* static
		 * 
		 * 1) 공유 메모리 영역(또는 정적 메모리 영역) 이라고 함.
		 * 
		 * why? 프로그램 시작 시 static이 붙은 코드들이 모두
		 * static 영역에 생성되고,
		 * 프로그램이 종료될 때까지 사라지지 않음 (정적)
		 * 그리고, static 영역에 생성된 변수는 어디서든지 공유 가능(공유)
		 * 
		 * 2) 사용 방법 : 클래스명.변수명
		 * 
		 */
	}
	
	public void ex3() {
		
		// 생성자 확인 테스트
		
		// Student 객체를 기본 생성자를 이용해 생성하고 이를 참조하는 s1에 대입 
		Student s1 = new Student();
						// 기본 생성자
		
		
		// User 기본 생성자를 이용해서 객체 생성
		User u1 = new User();
		
		// User 객체 필드 초기화 확인
		System.out.println( u1.getUserId() );
		System.out.println( u1.getUserPw() );
		System.out.println( u1.getUserName() );
		System.out.println( u1.getUserAge() );
		System.out.println( u1.getUserGender() );
		
	}
}
