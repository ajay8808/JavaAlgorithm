//�ڿ��� N�� �ԷµǸ� 1���� N������ �� ���ڵ��� ����� ������ ����ϴ� ���α׷��� �ۼ��� ����. 
//���� N�� 8�� �Էµȴٸ� 1(1��), 2(2��), 3(2��), 4(3��), 5(2��), 6(4��), 7(2��), 8(4 ��) �� ���� �� ������ ����� ������ �������ϴ�. 
//����� ������ ���� 1���� ���ʴ�� ����� ������ ����ϸ� �˴ϴ�. 
//1 2 2 3 2 4 2 4 �� ���� ����Ѵ�.

package ex;
import java.util.Scanner;

public class ex06 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n, i, j, cnt;
	        n = sc.nextInt();
	        for(i=1; i<= n; i++){
	            cnt=0;
	            for(j=1;j<=i;j++){
	                if(i%j==0)cnt++;
	            }
	            System.out.printf("%d ",cnt);
	        }
	    }
	}

