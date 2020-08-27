//별찍기

package ex;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
       int i =1 ;   
     
         //1번
        while ( i<=4 ) {
            int j =1 ;
            while ( j<=4 ) {
                System.out.print("*");
                j++;
                }
            i++;
            System.out.println();         
        }
        System.out.println();
        
        //2번
        for (i=1; i<=3; i++) {
            for (int j=1; j<=i; j++){            
            System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();  
 
        //3번    
        for (i=3; i>0; i--) {    
            for (int j=1; j<=3 ; j++){    
                if(j>=i) {
                System.out.print("*");
                }
                else{
                   System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();    
       
         // 4번
         // 3번을 활용하려 했으나 조건값이 달라서 활용불가
         int a, b;
         for(i = 0; i < 15; i++) { //공간의 크기(15)만큼 반복
             a = i/5;// 몫
             b = i%5;//나머지
             if(b < 2-a || 2+a < b) { // 2-몫이 나머지 보다 크거나 2+몫이 나머지보다 작으면 " "을 출력
                 System.out.print(" ");
             }else {
                 System.out.print("*");
             }
            
             if(b == 4)System.out.println(""); // 5회 반볶시 줄바꿈
         }
         System.out.println("");
         
         //5번
         for(i=0; i < 25; i++) { //공간의 크기(25)만큼 반복
             if(i/5 <= 2) {
                 a = i/5;     // 몫에 대칭성을 주기위한 조건문
             }else {
                 a = 4-i/5;  
             }           
             b = i%5; //나머지
             if(b < 2-a || 2+a <b) {  //위와 동일
                 System.out.print(" ");
             }else {
                System.out.print("*"); 
             }
             
             if(b ==4) {
                 System.out.println(""); //5회 반복마다 줄바꿈
             }
         }
         
 
         //6번 입력받는 홀수줄 만큼의 별 그리
         //scaner 사용 홀수의 수를 받는다         
         int size ;       
         Scanner sc= new Scanner(System.in);  //스캐너 사용         
         System.out.println("출력할 별의 홀수를 입력해주세요 :  ");
         size = sc.nextInt();                             // size에 입력받음               
 
         for( i = 0; i<size*size; i++) {
             b = i%size;        // 나머지           
             if(i/size <= (size-1)/2){    //몫을 대칭구조로 구함
                 a = i/size;
             }else {
                 a = (size-1)- i/size;
             }
                   
             if((size-1)/2-a > b || (size-1)/2+a <b) {         //위와 같은 출력 몫과 나머지의 크기를 중앙값으로 구분
                 System.out.print(" ");
             }else {
                 System.out.print("*");
             }           
             if(b == size - 1)System.out.println(""); 
         }
 
             
 
     }
}
