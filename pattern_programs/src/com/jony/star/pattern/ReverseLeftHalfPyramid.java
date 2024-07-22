package com.jony.star.pattern;

public class ReverseLeftHalfPyramid {

	public static void main(String[] args) {

		int row=5;
		int star=5;
		int space=0;
		
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print("  ");
			}
			
			for (int s = 1; s <=star; s++) {
				System.out.print(" *");
				
			}
			System.out.println();
			star--;
			space++;
			
		}

	}

}
