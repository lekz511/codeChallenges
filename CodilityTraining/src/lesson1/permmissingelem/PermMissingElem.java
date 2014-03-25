package lesson1.permmissingelem;

public class PermMissingElem {
	public static void main(String[] args) {
		int[]A={2, 3, 1, 5};//Sample test case
//		int[]A={1};//Single 1
//		int[]A={2};//Single 2
//		int[]A={};//Empty
		System.out.println(solution(A));
	}

    public static int solution(int[] A) {
    	long n=A.length+1;
    	long totalSum=((n*n)+n)/2;//Gauss trick :)
	    for(int i=0;i<A.length;i++)
	    	totalSum-=A[i];
	    return (int)totalSum;
    }
}
