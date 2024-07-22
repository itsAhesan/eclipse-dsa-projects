package com.jony.number.pattern;

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		int row=5;
		int star=1;
		
		for (int i = 1; i <= row; i++) {
			
			int num=1;
			for (int j = 1; j <=star ; j++) {
				System.out.print(num+" ");
				num++;
				
			}
			System.out.println();
			star++;
			
		}
		

	}

}
