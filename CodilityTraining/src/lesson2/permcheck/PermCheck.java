package lesson2.permcheck;

import java.util.HashSet;

public class PermCheck {

	public static void main(String[] args) {
		int[]A={4, 1, 3, 2};//Sample test case 1 sum 10
//		int[]A={4, 1, 3};//Sample test case 2 sum 8
//		int[]A={4, 3, 3};//total sum is correct, but it is not a permutation, N = 3
		System.out.println(solution(A));
		System.out.println(solution2(A));
	}
	
    public static int solution(int[] A){
    	int n=A.length;
    	int[] B = new int[n];
    	for(int i=0;i<n;i++)
    		if(A[i]<1 || A[i]>n)//Out of range
    			return 0;
    		else if(B[A[i]-1]!=1)//met before?
    			B[A[i]-1]=1;
    		else
    			return 0;
    	return 1;
    }
    
    public static int solution2(int[] A){
		long n=A.length;
		long totalSum=((n*n)+n)/2;//Gauss trick
		HashSet<Integer> ints=new HashSet<Integer>();
		for(int i=0;i<n;i++)
			if(!ints.add(A[i]))
				return 0;
			else
				totalSum-=A[i];
		return totalSum==0?1:0;
    }
}
