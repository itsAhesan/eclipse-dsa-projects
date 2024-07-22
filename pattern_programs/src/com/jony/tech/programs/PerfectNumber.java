package com.jony.tech.programs;

public class PerfectNumber {

	public static void main(String[] args) {
		int input=6;
		int res=0;
		
		for (int i = 1; i < input; i++) {
			if (input%i==0) {
				res=res+i;
			}
		}
		if (res==input) {
			System.out.println(input+ " is a Perfect Number");
		}else {
			System.out.println(input+ " is not a Perfect Number");
		}

	}

}
