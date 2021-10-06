import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class MergeIntervals {
	
	static void merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        intervals=merged.toArray(new int[merged.size()][]);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int [][] arr= new int[n][2];
		
		for (int i = 0; i < n; i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=s.nextInt();
			}
			
		}
		merge(arr);
		for (int i = 0; i < n; i++) {
			if(i>0 && arr[i][1]==arr[i-1][1]) {
				continue;
				
			}
	
			System.out.println(arr[i][0]+" "+arr[i][1]);
			
		}
		s.close();

	}

}
