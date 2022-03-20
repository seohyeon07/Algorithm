import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gold {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean [] check = new boolean [1000001];
        StringBuilder sb = new StringBuilder();
        int n;

        for(int i=0; i<check.length; i++){
            if(i<=1){
                check[i]=false;
            }
            else{
                check[i]=true;
            }
            
        }
        for(int i=0; i<check.length; i++){
            if(check[i]==true){
                if(i%2==0){
                    check[i]=false;
                }
                for(int j=2; i*j<check.length; j++){
                    check[i*j]=false;
                }
            }
        }
        while((n = Integer.parseInt(br.readLine()))!=0){
            for(int i=2; i<check.length; i++){
                if(check[i]==true){
                    int b=n-i;
                    if(check[b]==false){
                        continue;
                    }
                    else if(check[b]==true){
                        sb.append(n).append(" = ").append(i).append(" + ").append(b).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.print(sb);
    }
}
