package kr.or.yi.java_study_01.Exam;

import java.util.Arrays;
import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		/*
		 * 1. 학생 정보를 관리하는 프로그램을 작성하시오.
		 * 2. 학생 클래스를 정의 (번호, 성명, 국어, 영어, 수학) 
		 * 3.10개의 학생정보를 담을 수 있는 배열
		 * 4. 메뉴작성 (1. 학생목록 , 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생 검색, 6. 종료)
		 */

	   //sort 메서드
		//int[] intArr = {5,4,3,2,1};
		//Arrays.sort(intArr);
		//System.out.println(Arrays.toString(intArr));
		

		
		Student std01 = new Student(1, "배진우", 80 , 90, 80);
		Student std02 = new Student(2, "이동주", 60, 90, 80);
		Student std03 = new Student(3, "권수진", 60, 90, 80);
		Student std04 = new Student(4, "정아름", 60, 90, 80);
		Student std05 = new Student(5, "황태원", 60, 90, 80);
		Student std06 = new Student(6, "장현서", 60, 90, 80);
		Student std07 = new Student(7, "현재승", 60, 90, 80);
		Student std08 = new Student(8, "박인선", 60, 90, 80);
		Student std09 = new Student(9, "이상원", 60, 90, 80);
		Student std10 = new Student(10, "유경진", 60, 90, 80);
		Student std11 = new Student(11, "권태헌", 60, 90, 80);
		Student std12 = new Student(12, "황하나", 60, 90, 80);
		Student std13 = new Student("null");
		Student std14 = new Student("null");
		Student std15 = new Student("null");
		
		Student[] stdArr = {std01, std02, std03, std04, std05, std06, std07, std08, std09, std10, std11, std12, std13, std14, std15};
		
		//System.out.println(Arrays.toString(stdArr));
		Scanner sc = new Scanner(System.in);
		
	
		
		int res;
		do {
			System.out.println("1. 학생목록 , 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생 검색, 6. 종료");
			res = sc.nextInt();
			switch(res) {
			case 1:
				prnStudentInfo(stdArr);
				break;
			case 2:
				addStudent(stdArr, sc);
				break;
			case 3:
				updateStudent(stdArr, sc);
				break;
			case 4:
				delStudent(stdArr, sc);
				break;
			case 5:
				Student findStd = new Student();
				findStudent(stdArr, findStd, sc);
				//System.out.println(stdArr[idx]);
				
				break;
			default:
				System.out.println("종료");
			}
		} while(res < 5);
		
	
		sc.close();
		
	}

	private static void findStudent(Student[] stdArr, Student findStd, Scanner sc) {
		System.out.println("학생 이름을 입력하세요.");
		String searchKey = sc.next();
		
		findStd.setStdName(searchKey);
		//findStudent(stdArr, findStd);
		//int idx = findStudent(stdArr, findStd);
		int i;
		
		for(i=0; i<stdArr.length; i++) {
			if(findStd.getStdName().equals(stdArr[i].getStdName())) {
				System.out.println(stdArr[i]);
				break;
			}
		}
		
		if(i == stdArr.length) {
			System.out.println("없는 학생 입니다.");
		}
		
		
	}

	private static void delStudent(Student[] stdArr, Scanner sc) {
		System.out.println("학생 삭제 구현하기");
		
		 System.out.println("삭제할 학생의 번호를 입력하세요."); int stdNo = sc.nextInt();
		 System.out.println("삭제할 학생의 이름이 " + stdArr[stdNo-1].getStdName() +
		 "가 맞나요? (맞으면 1, 틀리면2)"); int answer = sc.nextInt();
		 
		
	//	findStudent(stdArr, sc);
		if(answer == 1) {
			stdArr[stdNo-1] = null;
			
			for(int i=stdNo-1; i<stdArr.length-1; i++) {
				stdArr[i] = stdArr[i+1];
			}// 삭제되면 null 맨뒤로 보내기
		}
		else if (answer == 2){
			System.out.println("종료합니다.");
			
			return;
		}
		//삭제한 후에 뒷번호가 앞번호로 덮어쓰기 (null x)
		//학생 번호 찾을 때 수정&삭제할 때 학생번호를 대조하는 공통된 함수를 하나로 만들어서 빼기 
		
		for(Student std : stdArr) {
			System.out.println(std);
		}
	}

	private static void updateStudent(Student[] stdArr, Scanner sc) {
		System.out.println("학생 수정 구현하기");
		System.out.println("수정할 부분을 선택하세요.  1.이름 2.국어점수 3.수학점수 4. 영어점수 ");
		int selectNum = sc.nextInt();
		System.out.println("수정할 학생 번호를 입력하세요.");
		int studentNum = sc.nextInt();
		switch(selectNum) {
					case 1:
						System.out.println("새 이름을 입력하세요.");
						String stdName = sc.next(); 
						stdArr[studentNum-1].setStdName(stdName);
						break;
					case 2:
						System.out.println("새 국어점수를 입력하세요.");
						int kor = sc.nextInt(); 
						stdArr[studentNum-1].setKor(kor);
						break;
					case 3:
						System.out.println("새 수학점수를 입력하세요.");
						int math = sc.nextInt();  
						stdArr[studentNum-1].setMath(math);
						break;
					case 4:
						System.out.println("새 영어점수를 입력하세요.");
						int eng = sc.nextInt();  
						stdArr[studentNum-1].setEng(eng);
						break;
					default:
						System.out.println("다시 입력하세요.");
		}
		for(Student std : stdArr) {
			System.out.println(std);
		}
	}

	private static void addStudent(Student[] stdArr, Scanner sc) {
		System.out.println("학생 추가 구현하기");
		int idx = 11;
		System.out.println("추가할 학생 정보를 입력하세요.");
		String stdName = sc.next();
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();
		
		stdArr[++idx] = new Student(++idx, stdName, kor, math, eng);
		for(Student std : stdArr) {
			System.out.println(std);
		}
	}

	private static void prnStudentInfo(Student[] stdArr) {
		System.out.println("학생목록 구현하기");
		
		for(Student std : stdArr) {
			System.out.println(std);
		}
	}

	private static void Test() {
		Student std01 = new Student(1, "배진우", 80 , 90, 80);
		   System.out.println(std01);
		   Student std02 = new Student(2, "이동주", 60, 90, 80);
		   System.out.println(std02);
		   
		  // Student[] stdArr = {std01, std02};
		   
		   //for(Student std : stdArr) {
		//	   System.out.println(std);
		  // }
	}

}
