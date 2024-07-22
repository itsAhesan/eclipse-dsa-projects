package com.jony.star.pattern;

public class RightHalfPyramid {

	public static void main(String[] args) {
		
		int row=5;
		int star=1;
		
		for (int i = 1; i <=row; i++) {
			for (int s = 1; s <=star; s++) {
				System.out.print(" *");
				
			}
			System.out.println();
			star++;
			
		}
		
		

	}

}
