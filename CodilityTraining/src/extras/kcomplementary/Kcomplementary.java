package extras.kcomplementary;

import java.util.HashMap;
import java.util.Map;

public class Kcomplementary {
	public static void main(String[] args) {
		int[]A={1,8,-3,0,1,3,-2,4,5};
//		int[]A={-2147483645, -2147483646, 2147483641, -2147483646, 2147483644};
		int k=6,r;
		long startTime,endTime;
		
		startTime= System.nanoTime();
		r=solution(A,k);
		endTime=System.nanoTime();
		System.out.println("r = "+r);
		System.out.println((endTime - startTime)/1e6);
	}
	
	static int solution(int[] A,int K){
		int n=A.length,i,pairs=0,diff=0;
		Integer r;
		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		
		for(i=0;i<n;i++)
			if(map.containsKey((Integer)A[i]))
				map.put((Integer)A[i], map.get(A[i])+1);
			else
				map.put((Integer)A[i], 1);

		for(i=0;i<n;i++){
//			check for integer overflow
			if (!(K > 0 ? A[i] < Integer.MIN_VALUE + K : A[i] > Integer.MAX_VALUE + K)){
				diff = -(A[i]-K);
				r=map.get(diff);
				if(r!=null)
					pairs+=r;
			}
		}
		return pairs;
	}
}
