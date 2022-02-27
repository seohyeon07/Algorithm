import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cro {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String given = br.readLine();
        int count=0;

        for(int i=given.length()-1; i>=0; i--){
            if(i==0){
                count++;
                break;
            }
            if(given.charAt(i)=='=' || given.charAt(i)=='-'){
                count++;
                if(i-2>=0){
                    if(given.charAt(i)=='='&& given.charAt(i-1)=='z' && given.charAt(i-2)=='d'){
                        i--;
                    }
                }
                i--;
            }
            else if(given.charAt(i)=='j'){
                if(given.charAt(i-1)=='l' || given.charAt(i-1)=='n'){
                    count++;
                    i--;
                }
                else{
                    count++;
                }
            }
            else{
                count++;
            }

        }
        System.out.println(count);   
    }
}
