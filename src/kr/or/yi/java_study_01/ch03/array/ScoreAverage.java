package kr.or.yi.java_study_01.ch03.array;

public class ScoreAverage {

	public static void main(String[] args) {
		score();

	}

	private static void score() {
		double [][] score = {
				{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}
		};
		int year;
		int term;
		
		double sum = 0;
		double yearSum = 0;
		for(year=0; year<score.length; year++) {
			System.out.println();
			System.out.print((year+1) + "학년");
			yearSum = 0;
			for(term=0; term<score[year].length; term++) {
				sum += score[year][term];
				yearSum += score[year][term];
					System.out.print("  "  + score[year][term] + " ");
			}
			System.out.printf("%.2f%n", yearSum/2.0);
		
		}
	
		int n = score.length;
		int m = score[0].length;
		System.out.println();
		System.out.print("전체  ");
		System.out.print(" 학년       ");
		System.out.println(sum/(n*m));
		
	}

}
