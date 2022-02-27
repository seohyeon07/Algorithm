import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASCII {
    public static void main(String[] args) throws IOException {

    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    String A = br.readLine();
    int result = A.charAt(0);

    System.out.println(result);
    
    }
}
