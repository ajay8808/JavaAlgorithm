//�ڿ��� N�� �־����� �ڿ��� N�� ������� ���� ���İ� �Բ� ����ϴ� ���α׷��� �ۼ��ϼ���.

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
