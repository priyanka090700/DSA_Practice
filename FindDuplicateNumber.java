import java.util.Scanner;

public class FindDuplicateNumber {
	
	static int findDuplicate(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int calsum=n*(n-1)/2;
        return sum-calsum;
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
		System.out.println(findDuplicate(arr));
		s.close();

	}

}
