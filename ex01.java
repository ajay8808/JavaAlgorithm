package ex;
import java.util.*;

class ex01 {
	public static void main(String[] args) {
		System.out.println("***备备窜1***");
		for (int dan=2;dan<10;dan++){
			for(int i=1;i<10;i++){
				System.out.print(dan + "*" + i + "=" + dan*i + "\t");
				if(i==9)
				System.out.println("");
			}
		}
		System.out.println("\n\n***备备窜2***");
		for (int i=1;i<10;i++){
			for(int dan=2;dan<10;dan++){
				System.out.print(dan + "*" + i + "=" + dan*i + "\t");
				if(dan==9)
				System.out.println();
			}
		}
	}
}
//备备窜
