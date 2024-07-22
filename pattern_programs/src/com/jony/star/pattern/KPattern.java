package com.jony.star.pattern;

public class KPattern {

	public static void main(String[] args) {
		int row=7;
		int star=4;
		
		for (int i = 1; i <=row; i++) {
			
			for (int s = 1; s <=star; s++) {
				System.out.print(" *");
			}
			System.out.println();
			if (i<=row/2) {
				star--;
			}else {
				star++;
			}
			
		}

	}

}
