//�� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
package ex;

import java.util.Arrays;
import java.util.Scanner;

public class ex16 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine();
	        int[] arr = new int[3];
	        String[] inputArr = input.split(" ");
	        arr[0]=Integer.parseInt(inputArr[0]);
	        arr[1]=Integer.parseInt(inputArr[1]);
	        arr[2]=Integer.parseInt(inputArr[2]);
	        Arrays.sort(arr); //������������ 10 20 30 ������ ������ϱ� arr[1]�� ���������
	        System.out.println(arr[1]);
	    }
}
