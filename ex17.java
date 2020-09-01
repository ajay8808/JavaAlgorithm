//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
//예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
//자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.


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
		 
		       // 아래는 테스트로 출력해 보기 위한 코드입니다.
		    public static void  main(String[] args){
		        ex17 sn = new ex17();
		        System.out.println(sn.isHarshad(18));
		    }
}
