//주민등록증의 번호가 주어지면 주민등록증 주인의 나이와 성별을 판단하여 출력하는 프로그램 을 작성하세요.
//주민등록증의 번호는 -를 기준으로 앞자리와 뒷자리로 구분된다.
//뒷자리의 첫 번째 수가 1이면 1900년대생 남자이고, 2이면 1900년대생 여자, 3이면 2000년대 생 남자, 4이면 2000년대생 여자이다. 
//올해는 2020년입니다. 해당 주민등록증 주인의 나이와 성별을 출력하세요.

package ex;

import java.util.Scanner;

public class ex09 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        char[] a = str.toCharArray();
	        int year,age;
	        if(a[7] == '1' || a[7] == '2' ){
	            year=1900+((a[0]-48)*10+(a[1]-48));
	        }else{
	            year = 2000+((a[0]-48)*10+(a[1]-48));
	        }
	        age = 2020-year+1;
	        System.out.printf("%d ", age);
	        if(a[7] == '1' || a[7] == '3' ) System.out.printf("M\n");
	        else System.out.printf("W\n");
	    }
}
