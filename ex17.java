//���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�.
//���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�.
//�ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.


package ex;

public class ex17 {
	 public boolean isHarshad(int num){
		 
		    String[] temp = String.valueOf(num).split("");
		 
		    int sum = 0;
		    for (String s : temp) {
		        sum += Integer.parseInt(s);
		    }
		 
		    if (num % sum == 0) {
		            return true;
		    } else {
		      return false;
		    }
		}
		 
		       // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		    public static void  main(String[] args){
		        ex17 sn = new ex17();
		        System.out.println(sn.isHarshad(18));
		    }
}
