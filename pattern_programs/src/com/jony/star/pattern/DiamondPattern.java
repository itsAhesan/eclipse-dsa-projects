package com.jony.star.pattern;

public class DiamondPattern {

	public static void main(String[] args) {
		int row=7;
		int star=1;
		int space=3;
		
		
		for (int i = 1; i <=row; i++) {
			
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
				
				
			}
			for (int s = 1; s <=star; s++) {
				System.out.print(" *");
			}
			System.out.println();
			if (i<=row/2) {
				star++;
				space--;
				
			}else {
				star--;
				space++;
			}
			
		}

	}

}
