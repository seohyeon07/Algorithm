import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GroupChecker {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String givenString="";
        boolean [] checkString = new boolean[26];
        int count=0;


        for(int i=0; i<N; i++){
            for(int k=0; k<26; k++){
                checkString[k]=false;
            }
            givenString = br.readLine();
            boolean isGroupCheckWord=true;
            for(int j=0; j<givenString.length(); j++){
                if(!checkString[givenString.charAt(j)-'a']){
                    checkString[givenString.charAt(j)-'a']=true;
                    while(j<givenString.length()-1){
                        if(givenString.charAt(j)==givenString.charAt(j+1)){
                            j++;
                        }
                        else{
                            break;
                        }
                    }
                }
                else{
                    isGroupCheckWord=false;
                }
                
            }
            if(isGroupCheckWord){
                count++;
            }
        }
        System.out.println(count);
    }
}