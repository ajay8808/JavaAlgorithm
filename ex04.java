//�ڿ��� A, B�� �־����� A���� B������ ���� ���İ� �Բ� ����ϼ���.

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

