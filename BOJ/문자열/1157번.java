import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy{
    public static void main(String[]args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = br.readLine();
        int max=0;
        int [] alphabet = new int[26];
        int count=0;
        int maxCount=0;
        char [] wordarray = word.toCharArray();

        for(int i=0; i<wordarray.length; i++){
            if(wordarray[i]>=97){
                alphabet[wordarray[i]-97]++;
            }
            else{
                alphabet[wordarray[i]-65]++;
            }
        }
        for(int i=0; i<26; i++){
            if(max<alphabet[i]){
                max=alphabet[i];
                maxCount=i;

            }
        }
        for(int i=0; i<26; i++){
            if(max==alphabet[i]){
                count++;
            }
        }

        if(count>=2){
            System.out.println("?");
        }
        else{
            System.out.println((char)(maxCount+'A'));
        }
    }
}