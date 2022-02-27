
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NUM {
    public static void main(String[]args)throws IOException{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        //test test= new test();
        int count=0;
    
        if(N<100){
            System.out.println(N);
        }
        else{
            for(int i=100; i<=N; i++){
                if(isNum(i)){
                count++;
                }
            }
            System.out.println(count+99);
        }
    }

    public static boolean isNum(int n){
        int f,s,t=0;
            t=n%10;
            n/=10;
            s=n%10;
            n/=10;
            f=n%10;
            if(s==0 && f==0 && t==0){
            	return false;
            }
            if((s-f)== (t-s)){
                return true;
            }
            else{
            	return false;
            }

        }
}