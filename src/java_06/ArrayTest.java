package java_06;

public class ArrayTest {
	public static void main(String[] args) {
		
		int arNum1[] = new int [5];
		int arNum2[] = new int[10];
		
		for (int i = 0; i < arNum1.length; i++) {
			arNum1[i] = i+1;
			System.out.print(arNum1[i]+"\t");

		}
		System.out.println();
		for (int i = 0; i < arNum2.length; i++) {
			arNum2[i] = 10-i;
			System.out.print(arNum2[i]+"\t");
		}
		
	}


}
