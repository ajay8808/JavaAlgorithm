//�����

package ex;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
       int i =1 ;   
     
         //1��
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
        
        //2��
        for (i=1; i<=3; i++) {
            for (int j=1; j<=i; j++){            
            System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();  
 
        //3��    
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
       
         // 4��
         // 3���� Ȱ���Ϸ� ������ ���ǰ��� �޶� Ȱ��Ұ�
         int a, b;
         for(i = 0; i < 15; i++) { //������ ũ��(15)��ŭ �ݺ�
             a = i/5;// ��
             b = i%5;//������
             if(b < 2-a || 2+a < b) { // 2-���� ������ ���� ũ�ų� 2+���� ���������� ������ " "�� ���
                 System.out.print(" ");
             }else {
                 System.out.print("*");
             }
            
             if(b == 4)System.out.println(""); // 5ȸ �ݺ��� �ٹٲ�
         }
         System.out.println("");
         
         //5��
         for(i=0; i < 25; i++) { //������ ũ��(25)��ŭ �ݺ�
             if(i/5 <= 2) {
                 a = i/5;     // �� ��Ī���� �ֱ����� ���ǹ�
             }else {
                 a = 4-i/5;  
             }           
             b = i%5; //������
             if(b < 2-a || 2+a <b) {  //���� ����
                 System.out.print(" ");
             }else {
                System.out.print("*"); 
             }
             
             if(b ==4) {
                 System.out.println(""); //5ȸ �ݺ����� �ٹٲ�
             }
         }
         
 
         //6�� �Է¹޴� Ȧ���� ��ŭ�� �� �׸�
         //scaner ��� Ȧ���� ���� �޴´�         
         int size ;       
         Scanner sc= new Scanner(System.in);  //��ĳ�� ���         
         System.out.println("����� ���� Ȧ���� �Է����ּ��� :  ");
         size = sc.nextInt();                             // size�� �Է¹���               
 
         for( i = 0; i<size*size; i++) {
             b = i%size;        // ������           
             if(i/size <= (size-1)/2){    //���� ��Ī������ ����
                 a = i/size;
             }else {
                 a = (size-1)- i/size;
             }
                   
             if((size-1)/2-a > b || (size-1)/2+a <b) {         //���� ���� ��� ��� �������� ũ�⸦ �߾Ӱ����� ����
                 System.out.print(" ");
             }else {
                 System.out.print("*");
             }           
             if(b == size - 1)System.out.println(""); 
         }
 
             
 
     }
}
