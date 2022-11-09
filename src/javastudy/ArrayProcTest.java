package javastudy;

public class ArrayProcTest {
	final static int STUDENT = 5;
	
	public static void main(String[] args) {
		int[] scores = new int[STUDENT];
		ArrayProc obj = new ArrayProc();
		obj.getAverage(scores);
		System.out.println("ЦђБе = " + obj.getAverage(scores));

	}

}
