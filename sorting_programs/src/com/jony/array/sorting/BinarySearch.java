package com.jony.array.sorting;

public class BinarySearch {

	public static void main(String[] args) {

		int noOfPainter=3;
		int rateOfPaint=3;
		int[] wallHeights={4,3,5,6,2};
		int timeTaken= findMinTime(noOfPainter,rateOfPaint,wallHeights);
		System.out.println(timeTaken);

		
		
		
		
		

	}

	private static int findMinTime(int noOfPainter, int rateOfPaint, int[] wallHeights) {
		int r=totalTime(wallHeights,rateOfPaint);
		int l=0;
		int mid;
		while(l<r){
			mid=(l+r)/2;
			boolean possible= possibleTme(noOfPainter,rateOfPaint,wallHeights,mid);
			if (possible) {
				r=mid;
			}else {
				l=mid+1;
			}
			
		}
		
		
		return l;
	}

	private static boolean possibleTme(int noOfPainter, int rateOfPaint, int[] wallHeights, int mid) {
		int painterCounter=0;
		
		
				
		for (int i = 0; i < wallHeights.length; i++) {
			int currentTime=0;
			painterCounter++;
			
			if (painterCounter>noOfPainter) {
				return false;
			}
			while((currentTime+wallHeights[i]* rateOfPaint)<mid){
				currentTime+=wallHeights[i++]* rateOfPaint;
			}
			i--;
		}
		
		
		return true;
	}

	private static int totalTime(int[] wallHeights, int rateOfPaint) {
		int height=0;
		for (int i = 0; i < wallHeights.length; i++) {
			height+=wallHeights[i];
		}
		return height*rateOfPaint;
	}

}
