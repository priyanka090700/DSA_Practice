import java.util.Scanner;

public class MergeWithoutExtraSpace {
	
	static int nextGap(int gap)
    {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }

    static void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int i, j, gap = n + m;
        for (gap = nextGap(gap); gap > 0;gap = nextGap(gap)){
            for (i = 0; i + gap < n; i++)
                if (arr1[i] > arr1[i + gap]) 
                {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }

            for (j = gap > n ? gap - n : 0;i < n && j < m; i++, j++)
                if (arr1[i] > arr2[j])
                {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }

            if (j < m)
            {
                
                for (j = 0; j + gap < m; j++)
                    if (arr2[j] > arr2[j + gap]) 
                    {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,m;
		n=s.nextInt();
		int [] arr1= new int[n];
		
		for (int i = 0; i < n; i++) {
			arr1[i]=s.nextInt();
		}
		m=s.nextInt();
		int [] arr2= new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i]=s.nextInt();
		}
		merge(arr1,arr2,n,m);
		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < m; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		s.close();

	}

}
