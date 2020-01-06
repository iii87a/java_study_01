package kr.or.yi.java_study_01.ch03.array;

import java.util.Random;

public class Practice02 {

	public static void main(String[] args) {
		   Random rnd = new Random();
		   
		   String[] nameArr =  {"권수진", "정아름", "황태원", "장현서", "현재승", "배진우", "박인선", "이상원", "유경진", "권태헌", "황하나", "이동주"  };
		   int[] scoreArr = new int[3]; //과목이 3개
		   examStudent(rnd, nameArr, scoreArr);
		}

		private static void examStudent(Random rnd, String[] nameArr, int[] scoreArr){
		        System.out.print("이름     ");
				System.out.print("국어       ");
				System.out.print("영어       ");
				System.out.print("수학       ");
				System.out.print("총점       ");
				System.out.print("평균       ");    
		       
		        int sumKor = 0;
				int sumEng = 0;
				int sumMath = 0; 
		        //int sumTotal = 0;
				//int sumAvg = 0;

		    for(int n=0; n<nameArr.length; n++){
		       System.out.println();
		       System.out.print(nameArr[n] + "    "); 

		      for(int s=0; s<scoreArr.length; s++){

		          scoreArr[s] = rnd.nextInt(40) + 60;
		          System.out.print(scoreArr[s] + "    ");
		       }

		    int sum = scoreArr[0] + scoreArr[1] + scoreArr[2];
					System.out.print(sum + "    ");
		    double avg = sum/3;
					System.out.print(avg);
		            sumKor += scoreArr[0];
					sumEng += scoreArr[1];
					sumMath += scoreArr[2];
		            
		    
		    }
		     System.out.println();
				 System.out.print("전체      ");
		        System.out.print(sumKor/12 + "     ");
				 System.out.print(sumEng/12 + "    ");
				 System.out.print(sumMath/12 + "    ");
		         System.out.print((sumKor/12)+(sumEng/12)+(sumMath/12) + "   ");
			 	 System.out.printf("%.2f ",(double)((sumKor/12)+(sumEng/12)+(sumMath/12))/3);
		}
}
