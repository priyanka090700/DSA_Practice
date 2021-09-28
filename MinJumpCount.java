import java.util.Scanner;

public class MinJumpCount {
	
	static int minJumps(int[] arr){
        // your code here
        if (arr.length <= 1)
            return 0;

        if (arr[0] == 0)
            return -1;

        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        for (int i = 1; i < arr.length; i++) {
            
            if (i == arr.length - 1)
                return jump;

            maxReach = Math.max(maxReach, i + arr[i]);

            step--;

            if (step == 0) {
                jump++;

                if (i >= maxReach)
                    return -1;

                step = maxReach - i;
            }
        }

        return -1;
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
		System.out.println(minJumps(arr));
		s.close();

	}

}
