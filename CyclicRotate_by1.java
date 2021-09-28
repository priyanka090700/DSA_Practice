import java.util.Scanner;

public class CyclicRotate_by1 {
	
	static void rotate(int arr[], int n)
	{
	    int key=arr[n-1];
	    for (int i = n-1; i>0; i--){
	        arr[i]=arr[i-1];
	    }
	    arr[0]=key;
	    
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
		rotate(arr,n);
		for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
		s.close();

	}

}
