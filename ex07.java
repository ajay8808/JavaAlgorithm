//��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� ��YES", �ùٸ��� ������ ��NO"�� ����մϴ�.
//(())() �̰��� ��ȣ�� ���� �ùٸ��� ��ġ�ϴ� ������,
//(()()))�� �ùٸ� ��ȣ�� �ƴϴ�.

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
