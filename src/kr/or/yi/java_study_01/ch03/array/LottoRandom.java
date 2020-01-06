package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoRandom {

	public static void main(String[] args) {
		//10진수를 2진수로 변경하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		//numberChange(sc);
		//lotto_generator();
		// lotto_generator2();
		 lotto_rank();
		sc.close();

	}

	private static void lotto_rank() {
		int [] test = {16, 21, 22, 25, 31, 41};//당첨번호
		
		int[][] lotto = {{16, 21, 22, 25, 31, 41},
				{16, 21, 22, 25, 31, 40},
				{16, 21, 24, 25, 31, 41},
				{16, 21, 24, 26, 31, 41},
				{16, 21, 22, 25, 31, 41}};
		
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto[i].length ; j++) {
				System.out.print(lotto[i][j] + " " );
			}
			System.out.print( i + "개 " + (i+1) + "등");
			System.out.println();
		}
		
		
	}

	private static void lotto_generator2() {
		 int[][] lotto = new int[6][6];
		 
		 
		 //System.out.println(Arrays.deepToString(lotto));
		 Random rnd = new Random(1234567);
		 
		
			for(int i=0; i<lotto.length; i++) {
				lotto[0][i] = rnd.nextInt(44)+1;
				for(int j=0; j<i; j++) {
					if(lotto[0][i] == lotto[0][j]) {
						i--;
					}
					
				}
				
			}
			
			for(int n=0; n<lotto.length; n++) {
		 		for(int p=0; p<lotto.length; p++) {//sorting 
			 			if(lotto[0][n]<lotto[0][p]) {
			 				int temp = lotto[0][n];
			 				lotto[0][n] = lotto[0][p];
			 				lotto[0][p] = temp;
			 			}
		 		}
		 		
		 	}
			
//			for(int ar=1; ar<lotto.length; ar++) {
//				for(int arry=0; arry<lotto.length; arry++) {
//					lotto[ar][arry] = lotto[0][arry];
//				}
		
//		}
		
			for(int b=0; b<lotto.length; b++) {
				System.out.print(lotto[0][b] + " ");
			}
			
			
		
		// System.out.println(Arrays.deepToString(lotto));
		 
		 
		 
	}

	private static void lotto_generator() {
		
		int[] lotto = new int[6];
		
		 Random rnd = new Random(1234567);
	
		 

			for(int i=0; i<lotto.length; i++) {//중복 제거
					lotto[i] = rnd.nextInt(44)+1;
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
					}
				}
			}
		 
		 	for(int n=0; n<lotto.length; n++) {
		 		for(int p=0; p<lotto.length; p++) {//sorting 
			 			if(lotto[n]<lotto[p]) {
			 				int temp = lotto[n];
			 				lotto[n] = lotto[p];
			 				lotto[p] = temp;
			 			}
			 			
		 			
		 		}
		 	}
		 
		
		 System.out.println(Arrays.toString(lotto));
		 
		 
	}

	


	private static void numberChange(Scanner sc) {
		System.out.println("2진수로 변경할 숫자를 입력하세요.");
		int num = sc.nextInt();
		int[] numArray = new int[10];
		
		int i = 9;
		while(i>0) {
			int left = (num%2);
				num = num/2;
			numArray[i] = left;
			i--;
		}
		System.out.println(Arrays.toString(numArray));
			
	}
	
	
	
	
	
	

}
