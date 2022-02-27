import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dial {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int time=0;

        int [] seconds = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};

        for(int i=0; i<word.length(); i++){
            time+=seconds[word.charAt(i)-'A']+1;
        }
        System.out.println(time);

    }
}