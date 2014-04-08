package lesson2.maxcounters;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		int[] A={3, 4, 4, 6, 1, 4, 4};
		int N=5;
		System.out.println("\t"+Arrays.toString(solution(N,A)));
	}
    public static int[] solution(int N, int[] A) {
        int[] R = new int[N];
        int max=0,currentMax=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==N+1){
           		max=currentMax;
            }else{
                int X=A[i]-1;
                if(max>R[X])
                	R[X]=max;
                if(currentMax<++R[X])
                	currentMax=R[X];
            }
            //System.out.println(Arrays.toString(R));
        }
        for(int j=0;j<R.length;j++)
        	if(R[j]<max)
        		R[j]=max;
        return R;
    }
    
    public static int[] badSolution(int N, int[] A) {
        int[] R = new int[N];
        int max = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]==N+1){
            	if(max>0)
            		Arrays.fill(R, max);//Fails with large inputs due Timeouts
            }else{
                int X=A[i]-1;
                if(++R[X]>max)
                	max=R[X];
            }
//            System.out.println(Arrays.toString(R));
        }
        return R;
    }
}
