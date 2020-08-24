//괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
//(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만,
//(()()))은 올바른 괄호가 아니다.

package ex;

import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        int i,cnt=0;
        for(i=0; i<a.length; i++){
            if(a[i] == '(') cnt++;
            else if(a[i] == ')') cnt--;
            if(cnt<0) break;
        }
        if(cnt == 0) System.out.printf("YES\n");
        else System.out.printf("NO\n");
    }
}
