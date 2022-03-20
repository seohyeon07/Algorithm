import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class anlysis {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str="";
        while((str=br.readLine()) != null ){
            int BigCount=0;
            int smallCount=0;
            int numberCount=0;
            int blankCount=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)-'a'>=0 && str.charAt(j)-'z'<=25){
                    smallCount++;
                }
                else if(str.charAt(j)-'A' >=0 && str.charAt(j)-'Z' <=25){
                    BigCount++;
                }
                else if(str.charAt(j)-'0'>=0 && str.charAt(j)-'9'<=9){
                    numberCount++;
                }
                else if(str.charAt(j)==' '){
                    blankCount++;
                }
            }
            sb.append(smallCount).append(" ").append(BigCount).append(" ").append(numberCount).append(" ").append(blankCount);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
