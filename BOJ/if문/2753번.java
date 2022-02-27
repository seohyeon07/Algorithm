
import java.util.Scanner;

public class Year {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		scanner.close();
		
		if(year%4==0 && (year%100!=0 || year%400==0)) {
			System.out.println("1");
			return;	//if 조건이맞으면 출력하고 메인 종료하도
		}
		
		System.out.println("0");
}
}