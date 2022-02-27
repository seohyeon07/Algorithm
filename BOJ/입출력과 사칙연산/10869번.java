import java.util.*;

public class AplusB {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int sum= num1 + num2;
		int sub= num1 - num2;
		int mul= num1 * num2;
		int div = num1 / num2;
		int rem = num1 % num2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
		
		scanner.close();
	}

}
