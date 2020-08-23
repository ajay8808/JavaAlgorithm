//자연수 N이 주어지면 자연수 N의 진약수의 합을 수식과 함께 출력하는 프로그램을 작성하세요.

package ex;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum =1;
		System.out.printf("%d ", 1);
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				System.out.printf(" + %d ", i);
				sum += i;
			}
		}
		System.out.printf("= %d  ",sum);
	}
}
