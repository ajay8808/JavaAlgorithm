//자연수 A, B가 주어지면 A부터 B까지의 합을 수식과 함께 출력하세요.

package ex;

import java.util.Scanner;


public class ex04 {
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int a, b, i, sum = 0;
	        a = scan.nextInt();
	        b = scan.nextInt();
	        for(i=a;i<b;i++){
	            System.out.printf("%d + ",i);
	            
	        }
	        //System.out.printf("%d",b);
	        System.out.printf("%d",i);
	        //sum = sum + b;
	        sum = sum + i;
	        System.out.printf(" = %d",sum);
	    }
	}

