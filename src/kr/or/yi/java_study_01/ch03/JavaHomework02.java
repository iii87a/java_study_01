package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class JavaHomework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//work1(sc);
		//work2(sc);
		//work3(sc);
		//work4(sc);
		  work5(sc);
		  
		sc.close();

	}






	//1. 상점에서 하나에 100원인 물건을 판매하고 있다. 물건을 10개 이상은 10% 할인, 20개 이상은 15%, 100개 이상은 20% 할인한다. 
	private static void work1(Scanner sc) {
		System.out.print("물건을 몇 개 샀나요?");
			int item = sc.nextInt();
			int price = 100;
			int total = item*price;
			double sale10 = (total-(total*0.1));
			double sale15 = (total-(total*0.15));
			double sale20 = (total-(total*0.2));
			

			
		if(item >= 10 && item < 20) { //10개 이상
			System.out.print("총 가격은 " + sale10 + " 원입니다.");
		}
		else if(item >= 20 && item < 99){//20개 이상 
			System.out.print("총 가격은 " + sale15 + " 원입니다.");
		}
		else if(item >= 100) {//100개 이상
			System.out.print("총 가격은 " + sale20 + " 원입니다.");
		}
		else {//10개 이하
			System.out.print("총 가격은 " + total + " 원입니다.");
		}
		
		
	}

	
	
	
//2. 사용자로부터 하나의 문자를 입력받는다. 만약 입력받은 문자가 대문자이면 소문자로 변환한다.
// 소문자이면 대문자를 입력하라는 메시지를 출력한다. 
//참고: 대문자에서 A를 빼고 a 를 더해주면 소문자로 변환됨. 
	
	
	private static void work2(Scanner sc) {
		System.out.print("하나의 문자를 입력하세요. (영어)");
		char a = sc.next().charAt(0); 
		
		if(a >= 65 && a <= 90 ) {
			System.out.print(Character.toString((char) (a + 32)));
		}
		else if(a >= 97 && a <= 122) {
			System.out.print("대문자를 입력하세요.");
		}
		else {
			System.out.print("다시 입력하세요.");
		}
		 
	}
	
	
	
	
//3. 놀이공원 입장료를 계산하는 프로그램을 작성하여 보자.
//입장료는 다음과 같은 조건으로 결정된다.
//먼저 사용자에게 자유이용권인지, 아니면 입장권인지를 질문한 후에 사용자의 나이, 현재시각을 입력받아서 지불해야하는 요금을 화면에 출력한다.
	
	
private static void work3(Scanner sc) {
		System.out.print("입장권 종류를 입력하세요. (자유이용권:0, 일반 입장권:1)");
			int type = sc.nextInt();
		System.out.print("현재시간을 입력하세요. (오후 5시 이전:0, 오후 5시 이후:1)");
			int time = sc.nextInt();
		System.out.print("나이를 입력하세요.");
			int age = sc.nextInt();
		
		//자유 + 주간 + 대인  13,50,64,65
		//자유 + 주간 + 소인  3,12,25,68,90,1,2,3
		//자유 + 야간 + 대인 
		//자유 + 야간 + 소인
		//입장 + 주간 + 대인
		//입장 + 주간 + 소인
		//입장 + 야간 + 대인
		//입장 + 야간 + 소인
		//else 무료
		
		
		if(type == 0) {//자유 이용권
			if(time == 0) {//자유 + 주간
				if(age > 12 && age < 65) {//자유 + 주간 + 대인 //12보다 크고 65보다 작음
						System.out.print("총 금액은 34,000원 입니다.");
					}
				else if(age > 2  && age < 13 || age >= 65) { //자유 + 주간 + 소인 //3보다 많거나 13보다 작거나 65보다 큼 
					System.out.print("총 금액은 25,000원 입니다.");
					}
				else {//무료 
					System.out.print("무료 입니다.");
					}
			}
			else if(time == 1) {//자유 + 야간
				if(age > 12  && age < 65) {//자유 + 야간 + 대인
					System.out.print("총 금액은 29,000원 입니다.");
				}
			else if(age > 2 && age < 13 || age >= 65) { //자유 + 야간 + 소인
					System.out.print("총 금액은 21,000원 입니다.");
				}
			else {//무료 
					System.out.print("무료 입니다.");
				}
				
			}
			else {//자유, 입장 말고 다른 거 입력했을 때
				System.out.print("다시 입력하세요.");
				}
		}
			
		
		else if(type == 1 ) {//입장권
			if(time == 0) {//입장 + 주간
				if(age > 12  && age < 65) {//입장 + 주간 + 대인
						System.out.print("총 금액은 27,000원 입니다.");
					}
				else if(age > 2  && age < 13  || age >= 65) { //입장 + 주간 + 소인
					System.out.print("총 금액은 20,000원 입니다.");
					}
				else {//무료 
					System.out.print("무료 입니다.");
					}
			}
			else if(time == 1) {//입장 + 야간
				if(age > 12  && age < 65) {//입장 + 야간 + 대인
					System.out.print("총 금액은 23,000원 입니다.");
				}
			else if(age > 2  && age < 13  || age >= 65) { //입장 + 야간 + 소인
					System.out.print("총 금액은 17,000원 입니다.");
				}
			else {//무료 
					System.out.print("무료 입니다.");
				}
				
			}
			else {//자유, 입장 말고 다른 거 입력했을 때
				System.out.print("다시 입력하세요.");
				}
		}
		else {
			System.out.print("다시 입력하세요.");
		}
			
	}






//4. 체중 / 키 제곱 / 

private static void work4(Scanner sc) {
		System.out.print("나이를 입력하세요.");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요.");
		int height = sc.nextInt();
		System.out.print("몸무게를 입력하세요.");
		int weight = sc.nextInt();
		double bmi = weight/(((double)height*0.01)*((double)height*0.01));
		String low = "저체중";
		String middle = "표준체중";
		String high = "과체중";
		String overhigh = "비만";
		
		if(age < 30 && age > 19 ) {//20대
			if(bmi <= 17.9) {//20대 + 저체중
				System.out.print("귀하는 " + age + "살이고, " + low + "입니다." );
			}
			else if(bmi >= 18 && bmi <= 23 ) {//20대 + 표준 체중
				System.out.print("귀하는 " + age + "살이고, " + middle + "입니다." );
			}
			else if(bmi >= 24 && bmi <= 30) {//20대 + 과제중
				System.out.print("귀하는 " + age + "살이고, " + high + "입니다." );
			}
			else  {//20대 + 비만
				System.out.print("귀하는 " + age + "살이고, " + overhigh + "입니다." );
			}
		}
		else if (age < 40 && age > 29) {// 30대
			if(bmi <= 18.4) {//30대 + 저체중 
				System.out.print("귀하는 " + age + "살이고, " + low + "입니다.");
			}
			else if (bmi >= 18.5 && bmi <= 24) {
				System.out.print("귀하는 " + age + "살이고, " + middle + "입니다.");
			}
			else if (bmi >= 25 && bmi <= 30) {
				System.out.print("귀하는 " + age + "살이고, " + high + "입니다.");
			}
			else {
				System.out.print("귀하는 " + age + "살이고, " + overhigh + "입니다.");
			}
		}
		else {
			System.out.print("귀하는 " + age + "살입니다. 다시 입력해주세요.");}
	
}



	
//5. 사용자로부터 3개 정수를 읽어 들인 후에가장 작은 값을 결정하시오.

private static void work5(Scanner sc) {
	System.out.print("첫번째 정수를 입력하세요.");
	int a = sc.nextInt();
	System.out.print("두번째 정수를 입력하세요.");
	int b = sc.nextInt();
	System.out.print("세번째 정수를 입력하세요.");
	int c = sc.nextInt();
	
	
	if(c > a) {//a가 제일 작을 때
		if(b > c && c > b) {//b > c > a
			System.out.print("가장 작은 수는" + a + "입니다.");
		}
		else {//b 와 c 가 같을 때 
			if(b > a) {
				System.out.print("가장 작은 수는" + a + "입니다.");
			}
		}
	}
	else if(a > b) {//b가 제일 작을 때
		if(a > c || c > a) {// a > c > b, c > a > b
			System.out.print("가장 작은 수는" + b + "입니다.");
		}
		else {//a, c가 같을 때
			System.out.print("가장 작은 수는" + b + "입니다.");
		}
	}
	else if(a > c) {//c가 제일 작을 때
		if(a > b || b > a) {
			System.out.print("가장 작은 수는" + c + "입니다.");
		}
		else {//a,b 가 같을 때
			System.out.print("가장 작은 수는" + c + "입니다.");
		}
	}
	else {// a, b, c 가 같을 때
		System.out.print("a, b, c 가 모두 같습니다.");
	}
	
	
	
	
}

	
	
	
	
	
	
	
	
}
