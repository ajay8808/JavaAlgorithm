//�ζ� 

package ex;

public class ex12 {

    public static void main(String[] args) {
 
        int lotto[] = new int[6];
 
        boolean a;
 
        for (int i = 0; i < lotto.length; i++) {  //lotto�� ���̸�ŭ �ݺ�
 
            int num = (int) (Math.random() * 45 + 1);  // ��������
 
            a = true;        //a= true
 
 
 
            for (int j = 0; j < lotto.length; j++) {    
 
                if (lotto[j] == num) {                //�ߺ��˻�
 
                    i--;                            //�ߺ��϶� i����
 
                    a = false;                        //a = false ��Ŵ
 
                    System.out.println(num + "�ߺ�");        //����Ȯ���� ���� ����Ʈ
 
                    break;                            //�ݺ����� �ٽ� ����
 
                }
 
            }
 
 
 
            if (a) {                            //�ߺ��� �ƴҶ� ����
 
 
 
                lotto[i] = num;                            //�ߺ��˻簡 ���� ���� �Է�
 
                System.out.println(lotto[i] + " ");        //���
 
            }
        }
    }
 
}
