package ex;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	System.out.println("month:");
	int month = scan.nextInt();
	System.out.println("day:");
	int day = scan.nextInt();
	
	
	int temp= 0;
	int[] days = { 0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for(int i=1; i<=12; i++) { 
        if(i==month) {
            break;
        }
        temp += days[i];                  
    }
    
    temp += day;
		
	switch(temp % 7) { case 1: System.out.println("MON"); break;
	case 2: System.out.println("TUE"); break; 
	case 3: System.out.println("WED"); break;
	case 4: System.out.println("THU"); break; 
	case 5: System.out.println("FRI"); break; 
	case 6: System.out.println("SAT"); break; 
	case 0: System.out.println("SUN"); break; }


	
	}

}
//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.