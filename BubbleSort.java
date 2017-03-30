package com.ashish.programs;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int []arr = {5, 1, 6, 2, 4, 3};
		int i, j;
		System.out.println("Array Length: " + arr.length);
		
		for(i = 0; i < arr.length; i++) {
			
			boolean flag = false;
			
			for(j = 0; j < arr.length - i - 1; j++) {
				
				
				System.out.println("i: " + i + " - j: " + j);
				System.out.println("arr[j]: " + arr[j] + " :: arr[j+1]: " + arr[j+1]);
				
				if(arr[j] > arr [j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
				
				System.out.println("Flag: " + flag);
				System.out.println("arr[j]: " + arr[j] + " :: arr[j+1]: " + arr[j+1]);
				
			}			
			
			if(!flag) {
				System.out.println("Inside break: " + "i: " + i + " - j: " + j);
				break; 
			}
		}
		
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]);
			System.out.print(" ");
		}
	}	
}