import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String number = st.nextToken();
        int change = Integer.parseInt(st.nextToken());
        int ans=0;
        int d=1;

        for(int i=number.length()-1; i>=0; i--){
            if(number.charAt(i)>='A' && number.charAt(i)<='Z'){
                ans +=(number.charAt(i)-'A'+10)*d;
            }
            else{
                ans+=(number.charAt(i)-'0')*d;
            }
            d*=change;
        }  
        System.out.println(ans);      
    }
}
