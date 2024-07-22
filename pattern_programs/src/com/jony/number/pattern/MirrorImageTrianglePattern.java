package com.jony.number.pattern;

public class MirrorImageTrianglePattern {

	public static void main(String[] args) {
		int row=9;
		int star=5;
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
			if(i<=row/2){
				star--;
				spc++;
				temp++;
				
			}else {
				star++;
				spc--;
				temp--;
			}
			
			
		}
		
		

	}

}
