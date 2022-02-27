
import java.util.*;


public class Dice{
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        scanner.close();
        int result;
        result=(a==b && b==c ? 10000+a*1000 
        		: a==b || a==c ? 1000+a*100 
        		: b==c ? 1000+b*100
        		: a>b && a>c ? a*100
        		: b>a && b>c ? b*100
        		: c*100);
        System.out.println(result);
    }    
}
