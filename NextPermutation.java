import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
	
	static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void nextPermutation(int[] nums) {
        int n=nums.length;
        int key=0,ind=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                key=nums[i-1];
                ind=i-1;
                break;
            }
        }
        if(ind==-1){
            Arrays.sort(nums);
        }else{
            for(int i=n-1;i>0;i--){
                if(nums[i]>key){
                    nums[ind]=nums[i];
                    nums[i]=key;
                    break;
                }
            }
            reverse(nums, ind+1);
            
        }
        
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
		nextPermutation(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		s.close();

	}

}
