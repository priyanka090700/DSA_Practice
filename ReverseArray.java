// Ques 1. Write a program to reverse an array 

import java.util.Scanner;

public class ReverseArray {
	
	static void rvereseArray(int arr[],int start, int end){
        int temp;
  
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
         }
     }
	
	static void printArray(int arr[],int size){

		for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

       System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given an array, the task is to reverse the array/string.
		
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int [] arr= new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=s.nextInt();
		}
		rvereseArray(arr,0,n-1);
		System.out.println("Reversed array-");
		printArray(arr,n);
		s.close();

	}

}
