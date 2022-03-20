import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinaryNumber {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String binaryNum = br.readLine();
        int count=2;
        double ans=0;

        while(binaryNum.length()%3!=0){
            binaryNum = "0" + binaryNum;
        }
        for(int i=0; i<binaryNum.length(); i++){
            ans += (binaryNum.charAt(i)-'0') * Math.pow(2,count);
            count--;
            if(count==-1){
                sb.append((int)ans);
                count=2;
                ans=0;
            }
        }   
        System.out.println(sb);    
    }
}
