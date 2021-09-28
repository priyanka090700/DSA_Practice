import java.util.Scanner;

public class MaxSubarraySum {
	
	static int sum(int arr[],int n) {
		int max_so_far=arr[0];
		int curr_max=arr[0];
		for (int i = 1; i < n; i++)
	    {
	           curr_max = Math.max(arr[i], curr_max+arr[i]);
	        max_so_far = Math.max(max_so_far, curr_max);
	    }
	    return max_so_far;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int [] arr= new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(sum(arr,n));
		s.close();

	}

}
