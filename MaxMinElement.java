// Ques 2. Write a function to return minimum and maximum in an array. Your program should make the minimum number of comparisons. 

import java.util.Scanner;

public class MaxMinElement {
	
	static void finMinMax(int arr[],int size) {
		int min=arr[0],max=arr[0],temp=0;
		for(int i=1;i<size;i++) {
			if(min>arr[i]) {
				temp = arr[i];
	            arr[i] = min;
	            min = temp;
			}
			if(max<arr[i]) {
				temp = arr[i];
	            arr[i] = max;
	            max = temp;
			}
		}
		System.out.println("Minimum= "+min+" Maximum= "+max);
		
	}
	// we can do comparison in pairs as well
	 /* In the while loop, pick elements in pair and 
        compare the pair with max and min so far 
       while (i < n - 1) {
           if (arr[i] > arr[i + 1]) {
               if (arr[i] > max) {
                   max = arr[i];
               }
               if (arr[i + 1] < min) {
                   min = arr[i + 1];
               }
           } else {
               if (arr[i + 1] > max) {
                   max = arr[i + 1];
               }
               if (arr[i] < min) {
                   min = arr[i];
               }
           }
           i += 2;
              Increment the index by 2 as two 
              elements are processed in loop 
       }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To return minimum and maximum in an array. Your program should make the minimum number of comparisons.
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int [] arr= new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=s.nextInt();
		}
		finMinMax(arr,n);
		s.close();

	}

}
