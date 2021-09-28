import java.util.Scanner;

public class Sort_0_1_2 {
	
	public static void sort012(int arr[], int n)
    {
        // code here
        int pos0=0,pos1=0,pos2=0;
        for (int i = 0; i < n; ++i) {
            if(arr[i]==0){
                pos0++;
            }else if(arr[i]==1){
                pos1++;
            }else{
                pos2++;
            }
        }
        for (int i = 0; i < n; ++i){
            if(i<pos0){
                arr[i]=0;
            }
            if(i>=pos0 && i<pos0+pos1){
                arr[i]=1;
            }
            if(i>=pos0+pos1 && i<pos0+pos1+pos2){
                arr[i]=2;
            }
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int [] arr= new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=s.nextInt();
		}
		sort012(arr,n);
		for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
		s.close();

	}

}
