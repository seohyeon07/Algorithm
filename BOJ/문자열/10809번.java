import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char [] word = br.readLine().toCharArray();
    
        int []alphabet= new int[27];
        for(int i=0; i<27; i++){
            alphabet[i]=-1;
        }

        for(int i=0; i<word.length; i++){
            // if(alphabet[i] == -1); 틀린 코드 잘못생각함.
            if(alphabet[word[i]-'a']==-1){
                System.out.print(word[i]-'a');
                alphabet[word[i]-'a']=i;
            }
        }
        for(int i=0; i<alphabet.length; i++){
            System.out.print(alphabet[i]+" ");
        }
    }
}