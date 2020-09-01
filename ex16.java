//세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
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
	        Arrays.sort(arr); //오름차순정렬 10 20 30 어차피 가운데꺼니까 arr[1]만 가져오면됨
	        System.out.println(arr[1]);
	    }
}
