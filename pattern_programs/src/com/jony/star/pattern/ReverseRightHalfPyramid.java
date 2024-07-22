package com.jony.star.pattern;

public class ReverseRightHalfPyramid {

	public static void main(String[] args) {
		int row=5;
		int star=5;
		
		for (int i = 1; i <=row; i++) {
			
			for (int s = 1; s <=star; s++) {
				System.out.print(" *");
			}
			System.out.println();
			star--;
		}
		

	}

}
