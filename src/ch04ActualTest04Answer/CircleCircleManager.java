package ch04ActualTest04Answer;

import java.util.Arrays;
import java.util.Scanner;

public class CircleCircleManager {

	public static void main(String[] args) {
		CircleCircle[] circles = new CircleCircle[3];
		Scanner sc = new Scanner(System.in);
		//System.out.println(Arrays.toString(circles));
		
		double x;
		double y;
		int radius;
		for(int i=0; i<circles.length; i++) {
			System.out.print("x, y, radius >>> ");
			//double x = sc.nextDouble();
			//double y = sc.nextDouble();
			//int radius = sc.nextInt();
			x = sc.nextDouble();
			y = sc.nextDouble();
			radius = sc.nextInt();
			circles[i] = new CircleCircle(x, y, radius);
		}
		System.out.println(Arrays.toString(circles));
		
		int bigCircleCircleIdx = 0;
		for(int i=0; i<circles.length; i++) {
			if(circles[bigCircleCircleIdx].getArea() < circles[i].getArea()) {
				bigCircleCircleIdx = i;
			}
		}
		System.out.println("가장 큰 면적인 원은 : " + circles[bigCircleCircleIdx]);
		sc.close();
	}

}
