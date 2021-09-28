import java.util.Scanner;

public class Seperate_Negative_and_Positive {
	
	static void seperate(int arr[],int n) {
		int beg=0,end=n-1;
		while(beg<=end) {
			if(arr[beg]<0 && arr[end]<0) {
				beg++;
			}else if(arr[beg]>0 && arr[end]<0) {
				int temp = arr[beg];
	            arr[beg] = arr[end];
	            arr[end] = temp;
	            beg++;
	            end--;
			}else if(arr[beg]>0 && arr[end]>0){
				end--;
			}else {
				beg++;
				end--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// An array contains both positive and negative numbers in random order.
		// Rearrange the array elements so that all negative numbers appear before all positive numbers.
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int [] arr= new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=s.nextInt();
		}
		seperate(arr,n);
		for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
		s.close();

	}

}
