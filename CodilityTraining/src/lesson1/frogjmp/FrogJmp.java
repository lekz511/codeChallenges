package lesson1.frogjmp;

public class FrogJmp {
	public static void main(String[] args) {
		System.out.println(smallFrogJump(10,85,30));
	}
	
	public static int smallFrogJump(int X, int Y, int D){
		return (int)Math.ceil((double)(Y-X)/D);
	}
}
