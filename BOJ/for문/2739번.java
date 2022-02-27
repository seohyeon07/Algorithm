
import java.util.Scanner;

public class MulTable {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num=scanner.nextInt();
		
		scanner.close();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}

}
