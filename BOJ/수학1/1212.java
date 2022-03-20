import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctalNumber {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String OctalNumber = br.readLine();
        StringBuilder sb = new StringBuilder();
        String []array ={"000","001","010","011","100","101","110","111"};

        if(OctalNumber.length()==1 && OctalNumber.charAt(0)=='0'){  //0일때
            sb.append(0);
        }
        else{
            for(int i=0; i< OctalNumber.length(); i++){
                int n = Integer.parseInt(String.valueOf(OctalNumber.charAt(i)));
                if(i==0 && n<4){                            //앞에 0이 붙은 경우(1,2,3)
                    switch(n){
                        case 1 :
                            sb.append("1");
                            break;
                        case 2 :
                            sb.append("10");
                            break;
                        case 3 :
                            sb.append("11");
                            break;
                    }
                }
                else{
                    sb.append(array[n]);
                }
            }
        }
        System.out.print(sb);
    }
}