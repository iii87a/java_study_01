package kr.or.yi.java_study_01.ch03;

public class ForLoop03 {

	public static void main(String[] args) {
		
		
		//factorial(5);
		  factorial2(5);

	}
	private static void factorial2(int cnt) {
		int res =1;
		
		for(int i=cnt; i>0; i--) {
			res *= i;
			System.out.printf("%d %s", i, i==1?"=":"*");
		}
		System.out.print(res);
		
	}


	private static void factorial(int cnt) {
		int res = 1;

		for(int i=1; i<cnt+1; i++){
		    res = res * i;
		    System.out.print(i);
		    if(i<cnt) {
		    	System.out.print("*");
		    }
		    else {
		    	  System.out.print("=");
		    }
		    
		}
		    System.out.print(res);
	}

}
