import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combination {
    static int countNumber5(int n){ //5의 개수 count 
        int count=0;
            while(n>=5){
                count+=n/5;
                n/=5;
            }
            return count;
            
    }
    static int countNumber2(int n){ //2의 개수 count
        int count=0;
        while(n>=2){
            count+=n/2;
            n/=2;
        }
        return count;
    }
    public static void main(String []args) throws IOException{

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int countNumber5=countNumber5(n)-countNumber5(n-m)-countNumber5(m); //5의 개수 합
        int countNumber2=countNumber2(n)-countNumber2(n-m)-countNumber2(m); //2의 개수 합

        System.out.println(Math.min(countNumber5, countNumber2));
    }  
}
