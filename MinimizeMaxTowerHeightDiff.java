import java.util.Arrays;
import java.util.Scanner;

public class MinimizeMaxTowerHeightDiff {
	
	static int getMinDiff(int[] arr, int n, int k) {
        // code here
        if(n==1){
            return 0;
        }
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int smallest = arr[0] + k, largest = arr[n-1]-k;
        for(int i = 0; i < n-1; i++){
            int min = Math.min(smallest, arr[i+1]-k);
            int max = Math.max(largest, arr[i]+k);
            if(min < 0) 
                continue;
            ans = Math.min(ans, max-min);
        }
        return ans;
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
		int k=s.nextInt();
		System.out.println(getMinDiff(arr,n,k));
		s.close();

	}

}
