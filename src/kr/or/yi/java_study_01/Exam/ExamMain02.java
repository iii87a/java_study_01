package kr.or.yi.java_study_01.Exam;

import java.util.Arrays;
import java.util.Random;

public class ExamMain02 {

	public static void main(String[] args) {
		
		
		Student[] stdArr = new Student[11];
		System.out.println(Arrays.toString(stdArr));
		initArr(stdArr);
		System.out.println(Arrays.toString(stdArr));
		
		Student findStd = new Student();
		findStd.setStdNo(3);
		//int idx = indexOf(stdArr, new Student(3));
		int idx = indexOf(stdArr, findStd); //학생번호가 3번인 학생의 위치
		//출력하면 2
		
		System.out.println(stdArr[idx]);
		
		findStd.setStdNo(12);
		idx = indexOf(stdArr, findStd); 
		//출력하면 존재하지 않는 학생 
		
		if (idx == -1) {
			System.out.println("해당 학생이 존재하지 않음");
		}

	}

	private static int indexOf(Student[] stdArr, Student findStd) {
	
		
		for(int i=0; i<stdArr.length; i++) {
			if(findStd.getStdNo() == stdArr[i].getStdNo()) {
				return i;
			}
			
		}
		return -1;
	}

	private static void initArr(Student[] arr) {
		Random rnd = new Random();
		String[] names = {"권수진", "정아름", "장현서", "황태원", "배진우", "현재승", "이동주", "황하나", "유경진", "이상원", "박인선"};
		for(int i=0; i< arr.length; i++) {
			arr[i] = new Student(i+1, names[i], rnd.nextInt(60)+41, rnd.nextInt(60)+41, rnd.nextInt(60)+41); 
			//(int)(Math.random()*60) +41,  (int)(Math.random()*60) +41,  (int)(Math.random()*60) +41
		}
		
	}
	


}
