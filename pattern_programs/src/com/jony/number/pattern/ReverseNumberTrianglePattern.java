package com.jony.number.pattern;

public class ReverseNumberTrianglePattern {

	public static void main(String[] args) {
		int row=4;
		int star=4;
		int temp=1;
		int spc=0;
		for (int i = 1; i <= row; i++) {
			
			for (int s = 1; s <=spc; s++) {
				System.out.print(" ");
			}
			
			int num=temp;
			for (int j = 1; j <=star ; j++) {
				System.out.print(num+" ");
				num++;
				
				
			}
			System.out.println();
			star--;
			spc++;
			temp++;
			
			
		}
		

	}

}
