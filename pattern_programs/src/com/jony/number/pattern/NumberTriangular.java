package com.jony.number.pattern;

public class NumberTriangular {

	public static void main(String[] args) {
		int row=4;
		int star=1;
		int num=1;
		int spc=4;
		for (int i = 1; i <= row; i++) {
			
			for (int s = 1; s <=spc; s++) {
				System.out.print(" ");
			}
			
		
			for (int j = 1; j <=star ; j++) {
				System.out.print(num+" ");
				
				
			}
			System.out.println();
			star++;
			spc--;
			num++;
			
		}
		

	}

}
