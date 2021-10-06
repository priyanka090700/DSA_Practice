import java.util.Scanner;

public class BuySellStock {
	
	static int maxProfit(int[] prices,int n) {
        
        int minprice = prices[0];
        int maxprofit = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
        
        
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
		int m=maxProfit(arr,n);
		
		System.out.print(m);
		s.close();

	}

}
