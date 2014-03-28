package lesson2.frogriverone;

public class FrogRiverOne {

	public static void main(String[] args) {
		int[] A={1,3,1,4,2,3,5,4};//Sample test case
		int X=5;//sample test case
//		int[] A={1,1,1,1,2,1,2,2,1,1};
//		int X=2;
		System.out.println(solution(X,A));
	}
    public static int solution(int X, int[] A) {
        int n=A.length,c=0;
        int[] B=new int[X];
        for(int i=0;i<n;i++){
            if(B[A[i]-1]!=1){
                B[A[i]-1]=1;
                c++;
            }
            if(c==X)
                return i;
        }
        return -1;
    }
}
