import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HideSeek {
    static int GCD(int a,int b){
        int tmp=0;
        if(b!=0){
            tmp=a%b;
            a=b;
            b=tmp;
            return GCD(a,tmp);
        }
        else{
            return a;
        }

    }
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int targetcount = Integer.parseInt(st.nextToken());
        int subin = Integer.parseInt(st.nextToken());
        StringTokenizer strPoint = new StringTokenizer(br.readLine());
        int [] targetD = new int[targetcount];
        for(int i=0; i<targetcount; i++){
            targetD[i]=Math.abs(subin-Integer.parseInt(strPoint.nextToken()));
        }
        int ans=targetD[0];
        if(targetD.length==1){
            System.out.println(ans);
        }
        else{
            for(int i=1; i<targetD.length; i++){
                ans=GCD(ans,targetD[i]);
            }
            System.out.println(ans);
        }
    }
}
