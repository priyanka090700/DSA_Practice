// Ques 3.Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array.

import java.util.Scanner;

public class KthSmallestElement {
	static void sort(int arr[],int size,int k) {
		for(int i=size/2-1;i>=0;i--) {
			heapify(arr,size,i);
		}
		for(int i=size-1;i>=size-k;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	
	
	static void heapify(int arr[],int size,int i) {
		int small=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<size && arr[l] <arr[small]) {
			small=l;
		}
		if(r<size && arr[r]<arr[small]) {
			small=r;
		}
		if(small!=i) {
			int temp=arr[i];
			arr[i]=arr[small];
			arr[small]=temp;
			heapify(arr,size,small);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given an array arr[] and a number K where K is smaller than size of array.
		//The task is to find the Kth smallest element in the given array.
		//It is given that all array elements are distinct.
		Scanner s=new Scanner(System.in);
		int n,k;
		n=s.nextInt();
		int [] arr= new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=s.nextInt();
		}
		k=s.nextInt();
		sort(arr,n,k);
		System.out.println("kth smallest element is "+arr[n-k]);
		s.close();

	}

}
