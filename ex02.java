package ex;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int su =scan.nextInt();
	if(su%5==0)
	{
	System.out.println(su/5);
	return ;
	}else {
		int five = su /5;
		for (int i = five; i > 0; i--) {
			int tempsu= su - (i*5);
			if(tempsu%3==0)
				System.out.println(i+(tempsu/3));
			return;
		}
	}
	if(su%3==0)
		System.out.println(su/3);
	else
		System.out.println(-1);
	}
}

/*
 * ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. �������忡�� �����
 * ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
 * 
 * ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6����
 * �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
 * 
 * ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */