import java.util.Arrays;
import java.util.Scanner;

public class CountInversion {
	
	static long inversionCount(long arr[], int n)
    {
        // Your Code Here
        long m=sort(arr,0,n-1);
        return m;
        
    }
    static long sort(long[] arr,int l,int r){
        long count=0;
        if(l<r){
            int m=(l+r)/2;
            count+=sort(arr,l,m);
            count+=sort(arr,m+1,r);
            count+=merge(arr,l,m,r);
        }
        return count;
    }
    static long merge(long[] arr,int l,int m,int r){
        long[] left=Arrays.copyOfRange(arr,l,m+1);
        long[] right=Arrays.copyOfRange(arr,m+1,r+1);
        int i=0,j=0,k=l;
        long swaps=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
                swaps+=(m+1)-(l+i);
            }
        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
        return swaps;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		long [] arr= new long[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=s.nextLong();
		}
		long m=inversionCount(arr,n);
		
		System.out.print(m);
		s.close();

	}

}
