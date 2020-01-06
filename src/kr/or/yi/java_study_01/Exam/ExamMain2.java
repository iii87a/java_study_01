package kr.or.yi.java_study_01.Exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExamMain2 {

	public static void main(String[] args) {
		/*
		 * 1. 학생 정보를 관리하는 프로그램을 작성하시오. 2. 학생 클래스를 정의 (번호, 성명, 국어, 영어, 수학) 3.10개의 학생정보를
		 * 담을 수 있는 배열 4. 메뉴작성 (1. 학생목록 , 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생 검색, 6. 종료)
		 */

		// sort 메서드
		// int[] intArr = {5,4,3,2,1};
		// Arrays.sort(intArr);
		// System.out.println(Arrays.toString(intArr));
		Scanner sc = new Scanner(System.in);

		Student[] stdArr = new Student[15];
		initStd(stdArr);
		Student findStd = new Student();

		int res;
		do {
			System.out.println("1. 학생목록 , 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생 검색, 6. 종료");
			res = sc.nextInt();
			switch (res) {
			case 1:
				prnStudent(stdArr);
				break;
			case 2:
				addStudent(stdArr, sc);
				break;
			case 3:
				updateStudent(stdArr, findStd, sc);
				break;
			case 4:
				delStudent(stdArr, findStd, sc);
				break;
			case 5:
				int idx = findStudent(stdArr, findStd, sc);
				if(idx == -1) {
					System.out.println("존재하지 않는 학생");
				}else {
					System.out.println(stdArr[idx]);
				}
				
				break;
			default:
				System.out.println("종료");
			}
		} while (res < 6);

		sc.close();

	}

	private static void initStd(Student[] arr) {
		Random rnd = new Random(1234567);
		String[] names = { "권수진", "정아름", "장현서", "황태원", "배진우", "현재승", "이동주", "황하나", "유경진", "이상원", "박인선" };
		for (int i = 0; i < names.length; i++) {
			arr[i] = new Student(i + 1, names[i], rnd.nextInt(60) + 41, rnd.nextInt(60) + 41, rnd.nextInt(60) + 41);
			// (int)(Math.random()*60) +41, (int)(Math.random()*60) +41,
			// (int)(Math.random()*60) +41

		}

	}

	/*
	 * private static void prnStudent(Student[] stdArr, int idx) {
	 * 
	 * System.out.print(stdArr[idx]);
	 * 
	 * }
	 */

	private static int findStudent(Student[] stdArr, Student findStd, Scanner sc) {
		System.out.println("학생 이름을 입력하세요.");
		String searchKey = sc.next();
		//System.out.println(Arrays.toString(stdArr));
		findStd.setStdName(searchKey);
		//System.out.println(findStd);
		int i;

		for (i = 0; i < stdArr.length; i++) {
			if(stdArr[i] != null) {
				if (findStd.getStdName().equals(stdArr[i].getStdName())) {
					return i;
				}
			}
		}

		return -1;

	}

	private static void delStudent(Student[] stdArr, Student findStd, Scanner sc) {
		System.out.println("학생 삭제 구현하기");

		int idx = findStudent(stdArr, findStd, sc);
		System.out.print("삭제하려는 학생의 이름이 " + stdArr[idx].getStdName() + " 이(가) 맞는지 확인하세요. (맞으면 1번, 틀리면 2번)");
		int answer = sc.nextInt();
		if (answer == 1) {
			
			for (int i = idx; i < stdArr.length - 1; i++) {
				stdArr[i] = stdArr[i + 1]; // 삭제되면 한 칸씩 앞으로 밀림
				if(stdArr[i] != null) {
					stdArr[i+1].setStdNo(i+1); 
				}
			}
			//stdArr[stdArr.length - 1] = null;
			//System.out.println(Arrays.toString(stdArr));
		} else if (answer == 2) {
			System.out.println("종료합니다.");
			return;
		}

		prnStudent(stdArr); // 출력
	}

	private static void updateStudent(Student[] stdArr, Student findStd, Scanner sc) {
			System.out.println("학생 수정 구현하기");

		int idx = findStudent(stdArr, findStd, sc);
			System.out.println("수정하려는 학생의 이름이 " + stdArr[idx].getStdName() + " 이(가) 맞는지 확인하세요. (맞으면 1번, 틀리면 2번)");
		int answer = sc.nextInt();
		int selectNum = 0;

		if (answer == 1) {
			System.out.println("수정할 부분을 선택하세요.  1.이름 2.국어점수 3.수학점수 4. 영어점수 ");
			selectNum = sc.nextInt();
		} else if (answer == 2) {
			System.out.println("종료합니다.");

			return;
		}

		switch (selectNum) {
		case 1:
			System.out.println("새 이름을 입력하세요.");
			String stdName = sc.next();
			stdArr[idx].setStdName(stdName);
			break;
		case 2:
			System.out.println("새 국어점수를 입력하세요.");
			int kor = sc.nextInt();
			stdArr[idx].setKor(kor);
			break;
		case 3:
			System.out.println("새 수학점수를 입력하세요.");
			int math = sc.nextInt();
			stdArr[idx].setMath(math);
			break;
		case 4:
			System.out.println("새 영어점수를 입력하세요.");
			int eng = sc.nextInt();
			stdArr[idx].setEng(eng);
			break;
		default:
			System.out.println("다시 입력하세요.");
		}
		prnStudent(stdArr); // 출력
	}

	private static void addStudent(Student[] stdArr, Scanner sc) {
		System.out.println("학생 추가 구현하기");
			int idx = 11;
		System.out.println("추가할 학생 정보를 입력하세요.");
			String stdName = sc.next();
			int kor = sc.nextInt();
			int math = sc.nextInt();
			int eng = sc.nextInt();

		stdArr[idx++] = new Student(idx++, stdName, kor, math, eng);

		prnStudent(stdArr); // 출력
	}

	private static void prnStudent(Student[] stdArr) {
		for (Student std : stdArr) {
			System.out.println(std);
		}

	}

}
