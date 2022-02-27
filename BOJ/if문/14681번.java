
import java.util.*;

public class Quadrant {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		
		scanner.close();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}
		if(x>0 && y<0) {
			System.out.println("4");
		}
		if(x<0 && y<0) {
			System.out.println("3");
		}
		if(x<0 && y>0) {
			System.out.println("2");
		}
		
	}

}
