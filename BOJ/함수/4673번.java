import java.io.IOException;

public class SelfNum {
    public static void main(String[]args) throws IOException{

        boolean []check=new boolean[10001];
        StringBuilder sb= new StringBuilder();

        for(int i=1; i<10001; i++){
            int n = d(i);

            if(n<10001){
                check[n]=true;
            }
        }
        for(int i=1; i<10001; i++){
            if(!check[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int d(int number){
        int sum=number;
        while(number!=0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}