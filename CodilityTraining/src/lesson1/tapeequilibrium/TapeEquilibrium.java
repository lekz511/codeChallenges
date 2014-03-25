package lesson1.tapeequilibrium;

import java.util.Arrays;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int[]A={3, 1, 2, 4, 3};
		System.out.println(Arrays.toString(A));
		System.out.println(tapeMinSolution(A));
	}

    public static long tapeMinSolution(int[] A) {
		int n=A.length,i;
		long lSum=0,rSum=0,sum=0,min=0,r=0;
		for(i=0;i<n;i++)
			sum+=A[i];
		for(i=0;i<n-1;i++){
			lSum+=A[i];
			rSum=sum-lSum;
			r=Math.abs(lSum-rSum);
			//System.out.println("|"+lSum+" - "+rSum+"| = "+r);
			if(i==0)
				min=r;
			//System.out.println(r+"<"+min);
			if(r<min)
				min=r;
		}
		return min;
    }

}
