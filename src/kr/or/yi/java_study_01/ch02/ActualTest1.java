package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ActualTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// dollar1(sc);
		// integer2(sc);
		// money(sc);
		// middle(sc);
		// triangle(sc);
		// game(sc);
		// rectangle(sc);
		// circle(sc);
		// circle2(sc);
		//  season(sc);
			calculation(sc);
		sc.close();
	}

	








	//1. Scanner클래스를 이용하여 원화를 입력받아 달러로 바꾸고,
	// 다음 예시와 같이 출력하는 프로그램을 작성하라. (1달러 = 1100)
	private static void dollar1(Scanner sc) {
		System.out.print("원화를 입력하세요(단위 원) >> ");
		int won = sc.nextInt();
		int dollar = won/1100;
		
		
		System.out.print(won + "원은 $" + dollar + "입니다.");
		

	}

	//2.Scanner클래스를 이용하여 2자리의 정수를 입력받고,
	//10의 자리와 1의 자리가 같은지 판별하여 출력하시오. 

	private static void integer2(Scanner sc) {
		System.out.print("2자릿수 정수 입력(10~99) >>>");
		int integer = sc.nextInt();
		
		if(integer == (integer%10)*11) {
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		
		
		
	}
	
	
// 3. 정수로 된 돈의 액수를 입력받아 오만원권, 만원, 천원, 오백원, 백원, 오십원, 1원으로 각 몇개인지 출력하시오
	private static void money(Scanner sc) {
		System.out.print("금액을 입력하시오. >> ");
		int amount = sc.nextInt();
		
		System.out.print(
		"오만원권 " + amount/50000 + "매, "
		+ "만원권 " + (amount%50000)/10000 + "매, "
 		+ "천원권 " + ((amount%50000)%10000)/1000 + "매, "
 		+ "오백원 " + (((amount%50000)%10000)%1000)/500 + "개, "
 		+ "백원 " + ((((amount%50000)%10000)%1000)%500)/100 + "개, "
 		+ "십원 " + (((((amount%50000)%10000)%1000)%500)%100)/10 + "개, "
 		+ "일원 " + ((((((amount%50000)%10000)%1000)%500)%100)%10) + "개 입니다. "
				);
		
	}



//4. 정수 3개를 입력 받고 3개의 숫자 중에 중간 크기의 수를 출력하시오. (평균 값 아님)
	private static void middle(Scanner sc) {
		System.out.print("첫번째 정수를 입력하세요. >> ");
		int integer1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요. >> ");
		int integer2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요. >> ");
		int integer3 = sc.nextInt();
		
		
		if(integer1 > integer2) {
			if(integer2 > integer3) { //1 > 2 > 3
				System.out.print("중간 값은 " + integer2);
			}
			else { //1 > 3 > 2
				System.out.print("중간 값은 " + integer3);
			}
		}
		else if(integer2 > integer3) {
			if(integer1 > integer3){ //2 > 1 > 3
				System.out.print("중간 값은 " + integer1);
			}
			else { // 2 > 3 > 1
				System.out.print("중간 값은" + integer3);
			}
		}
		else if(integer3 > integer2){
			if(integer1 > integer2) {
				System.out.print("중간 값은 " + integer1);
			}
			else {
				System.out.print("중간 값은 " + integer2);
			}
		}
		
	
	}




//5. 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하시오.
	//삼각형을 만드려면 두 변의 합이 다른 한 변의 합보다 커야한다.
	private static void triangle(Scanner sc) {
		System.out.print("첫번째 정수를 입력하세요. >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요. >> ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요. >> ");
		int num3 = sc.nextInt();
		
	
		
		if(num1 > num2) {
			if(num2 > num3 || num3 > num2){
				if(num2 + num3 > num1) { //num1 이 제일 클 때 다른 두 변의 합이 num1 보다 클 때
					System.out.print("삼각형이 됩니다.");
				}else { //num1 보다 작을 때
					System.out.print("삼각형이 안됩니다.");
				}
			}
		}
		else if(num2 > num1) {
			if(num1 > num3 || num3 > num1) {
				if(num1 + num3 > num2) {
					System.out.print("삼각형이 됩니다.");
				}else {
					System.out.print("삼각형이 안됩니다.");
				}
			}
		}
		else if(num3 > num1) {
			if(num2 > num1 || num1 > num2) {
				if(num1 + num2 > num3) {
					System.out.print("삼각형이 됩니다.");
				}else {
					System.out.print("삼각형이 안됩니다.");
				}
			}
		}
		
		
	}

	
	
	


//6. 369게임. 1~99까지의 정수를 입력받고 3,6,9 중에 하나가 있는 경우는 "박수짝" 출력
	//두 개 있으면 "박수 짝짝" 
	//ex.13 -> 박수짝, 36 -> 박수짝짝

	private static void game(Scanner sc) {
		System.out.print("정수를 입력하세요. >> ");
		int num = sc.nextInt();
		
		int num1 = Math.round(num/10);
		int num2 = num%10;
		
		
		if(num1 == 3 || num1 == 6 || num1 == 9) {
			if(num2 == 3 || num2 == 6 || num2 == 9) {
				System.out.print("박수 짝짝");
			}
			else {
				System.out.print("박수 짝");
			}
		}
		else if(num2 == 3 || num2 == 6 || num2 == 9) {
			System.out.print("박수 짝");
		}
		
		else {
			System.out.print("다른 숫자를 입력하세요.");
		}
		
		
		/*
		 * if(num1 == 3 || num1 == 6 || num1 == 9) { System.out.print("박수 짝"); } else
		 * if(num2 == 3 || num2 == 6 || num2 == 9) { System.out.print("박수 짝짝"); }
		 */
		
	}




//8. x, y 좌표를 입력받고 (100,100), (200,200) 좌표를 가진 직사각형 안에 들어가는지 확인하기


	private static void rectangle(Scanner sc) {
		System.out.print("x 좌표를 입력하세요.");
		int xcode = sc.nextInt();
		System.out.print("y 좌표를 입력하세요.");
		int ycode = sc.nextInt();
		
		
		if (xcode >= 100 && xcode <= 200) {
			if(ycode >= 100 && ycode <= 200) {
				System.out.printf("(" + xcode + "," + ycode + ")" + "는 사각형 안에 있습니다. ");
			}
			else {
				System.out.printf("다시 입력하세요.");
			}
		}
		else {
			System.out.printf("다시 입력하세요.");
		}
		
	}



// 9. 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받고, 
	//실수 값으로 다른 점 (x,y) 를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력


	private static void circle(Scanner sc) {
		System.out.print("x좌표를 입력하세요.");
		int xcode = sc.nextInt();
		System.out.print("y좌표를 입력하세요.");
		 int ycode = sc.nextInt();
		System.out.print("반지름 길이를 입력하세요.");
		double radius = sc.nextDouble();
		System.out.print("원 안에 있는지 확인할 x좌표를 입력하세요.");
		int xcircle = sc.nextInt();
		System.out.print("원 안에 있는지 확인할 y좌표를 입력하세요.");
		int ycircle = sc.nextInt(); 
		
		if(xcircle <= xcode + radius && xcircle >= xcode - radius) {
			System.out.print("원 안에 있다.");
		}
		else if(ycircle <= ycode + radius && ycircle >= ycode - radius){
			System.out.print("원 안에 없다.");
		}
		else { 
			System.out.print("원 안에 없다.");
		}
		
		
		
		
	}



	
	//10. 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다.
	// 두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라. 

	private static void circle2(Scanner sc) {
		System.out.print("원1의 중심 x좌표를 입력하세요.");
		int xcode1 = sc.nextInt();
		System.out.print("원1의 중심 y좌표를 입력하세요.");
		int ycode1 = sc.nextInt();
		System.out.print("원1의 반지름 길이를 입력하세요.");
		double radius1 = sc.nextDouble();
		System.out.print("원2의 중심 x좌표를 입력하세요.");
		int xcode2 = sc.nextInt();
		System.out.print("원2의 중심 y좌표를 입력하세요.");
		int ycode2 = sc.nextInt();
		System.out.print("원2의 반지름 길이를 입력하세요.");
		double radius2 = sc.nextDouble();
		
		
		if(xcode2 <= xcode1 + radius1 && xcode2 >= xcode1 - radius1) {
			if(ycode2 <= ycode1 + radius1 && ycode2 >= ycode1 - radius1) {
				System.out.print("두 원은 서로 겹친다.");
			}
			else {
				System.out.print("두 원은 서로 겹치지지 않는다.");
			}
		}
		else { 
			System.out.print("두 원은 서로 겹치지지 않는다.");
		}
	
	}




	
	//11. 숫자를 입력받아 3~5는 '봄',
	 //             6~8은 '여름', 
	 //             9~11 은 '가을', 
	//              12,1,2는 '겨울', 
	//              그 외 숫자는 '잘못입력' 

	/* ----------- if 문 -----------
	 * private static void season(Scanner sc) {
		System.out.print("달을 입력하세요. (1월~12월/숫자만 입력) >> ");
		int month = sc.nextInt();
		
		if(month >= 3 && month <= 5) {
			System.out.print("3~5월은 봄입니다.");
		}
		else if(month >= 6 && month <= 8) {
			System.out.print("6~8월은 여름입니다.");
		}
		else if(month >= 9 && month <= 11) {
			System.out.print("9~11월은 가을입니다.");
		}
		else if(month == 12 || month == 1 || month == 2) {
			System.out.print("12,1,2 월은 겨울입니다.");
		}
		else { 
			System.out.print("잘못 입력하셨습니다. ");
		}*/
		

/* ---------- case 문 -------------*/
	private static void season(Scanner sc) {
		System.out.print("달을 입력하세요. (1월~12월/숫자만 입력) >> ");
		int month = sc.nextInt();
		
		switch(month) {
						case 3:
						case 4:
						case 5:
							System.out.print("3~5월은 봄입니다.");break;
						case 6:
						case 7:
						case 8:
							System.out.print("6~8월은 여름입니다.");break;
						case 9:
						case 10:
						case 11:
							System.out.print("9~11월은 가을입니다."); break;
						case 12:
						case 1:
						case 2:
							System.out.print("12,1,2 월은 겨울입니다."); break;
						default:
							System.out.print("잘못 입력하셨습니다. ");
		}
		
	}



//12. 사칙연산을 입력받아 계산하는 프로그램을 작성하고자 한다.
	//연산자는 +, -, *, / 네가지로 하고 피연산자는 모두 실수다. 
	// 피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.
	// 0으로 나누기 시 "0으로 나눌 수 없습니다." 를 출력하고 종료한다. 

	
	
	// 77페이지 참고 
	
	private static void calculation(Scanner sc) {
		System.out.print("연산을 입력하세요. (공백 넣기, 연산자:+, - , * , /)>> ");
		int num1 = sc.nextInt();
		String cal = sc.next();
		int num2 = sc.nextInt();
	
	/* ---------- if 문 -----------*/	
	/*	if(cal.equals("+")) {
			System.out.print(num1 + num2);
		}
		else if(cal.equals("-")) {
			System.out.print(num1 - num2);
		}
		else if(cal.equals("*")) {
			System.out.print(num1 * num2);
		}
		else if(cal.equals("/")) {
			System.out.print(num1 / num2);
		}
		else {
			System.out.print("다시 입력하세요.");
		}*/
			
	
	/* ---------- case 문 -----------*/
	
		switch(cal) {
					  case "+":
						  System.out.print(num1 + num2); break;
					  case "-":
						  System.out.print(num1 - num2); break;
					  case "*":
						  System.out.print(num1 * num2); break;
					  case "/":
						  System.out.print(num1 / num2); break;
					  default:
						  System.out.print("다시 입력하세요."); break;
		}

		
	}





	
	
	
	
//닫음	
}
