import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Word{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n=0;
        String word="";
        char []array=new char[N];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            st = new StringTokenizer(str," ");
            n =Integer.parseInt(st.nextToken()); // 반복될 횟수
            word = st.nextToken();
            array=word.toCharArray();
            for(int j=0; j<word.length(); j++){
                for(int k=0; k<n; k++){
                    sb.append(array[j]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}