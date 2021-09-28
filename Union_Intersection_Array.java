import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Union_Intersection_Array {
	
	static void union(int a[],int n,int b[],int m) {
		HashSet<Integer> hs=new HashSet<>(m+n);
		for (int i = 0; i < n; i++)
            hs.add(a[i]);
        for (int i = 0; i < m; i++)
            hs.add(b[i]);
        
        Iterator<Integer> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println(hs.size());
	}
	static void intersection(int a[],int n,int b[],int m) {
		HashSet<Integer> hs1=new HashSet<>(m+n);
		for (int i = 0; i < n; i++)
            hs1.add(a[i]);
		int count=0;
        for (int i = 0; i < m; i++) {
        	if(hs1.contains(b[i])) {
        		count++;
        		System.out.print(b[i]+" ");
        		hs1.remove(b[i]);
        	}
        }
        System.out.println();
        System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given two unsorted arrays that represent two sets (elements in every array are distinct)
		// find the union and intersection of two arrays.
		Scanner s=new Scanner(System.in);
		int n,m;
		n=s.nextInt();
		int [] a= new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i]=s.nextInt();
		}
		m=s.nextInt();
		int [] b= new int[n];
		
		for (int i = 0; i < m; i++) {
			b[i]=s.nextInt();
		}
		union(a,n,b,m);
		intersection(a,n,b,m);
		s.close();

	}

}
