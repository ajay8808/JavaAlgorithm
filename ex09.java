//�ֹε������ ��ȣ�� �־����� �ֹε���� ������ ���̿� ������ �Ǵ��Ͽ� ����ϴ� ���α׷� �� �ۼ��ϼ���.
//�ֹε������ ��ȣ�� -�� �������� ���ڸ��� ���ڸ��� ���еȴ�.
//���ڸ��� ù ��° ���� 1�̸� 1900���� �����̰�, 2�̸� 1900���� ����, 3�̸� 2000��� �� ����, 4�̸� 2000���� �����̴�. 
//���ش� 2020���Դϴ�. �ش� �ֹε���� ������ ���̿� ������ ����ϼ���.

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
