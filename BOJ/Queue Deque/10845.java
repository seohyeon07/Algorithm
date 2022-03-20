import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueueTest {
        static int Qarray[]=new int[10001];
        static int end = -1;
        static int begin = 0 ;
        static void push(int X){
            end++;
            Qarray[end]=X;

        }
        static int pop(){
            if(empty()==1){
                return -1;
            }
            else{
                return Qarray[begin++];
            }

        }
        static int size(){
            return end-begin+1;


        }
        static int empty(){
            if(end<begin){
                return 1;
            }
            else{
                return 0;
            }

        }
        static int front(){
            if(empty()==1){
                return -1;
            }
            else{
                return Qarray[begin];
            }
            
        }
        static int back(){
            if(empty()==1){
                return -1;
            }
            else{
                return Qarray[end];
            }

        }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<N; i++){
            StringTokenizer orderString =new StringTokenizer(br.readLine());
            String order = orderString.nextToken();
            switch(order){
                case "push" :
                    push(Integer.parseInt(orderString.nextToken()));
                    break;
                case "front" :
                    sb.append(front()).append("\n");
                    break;
                case "back" :
                    sb.append(back()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                }
        }
        System.out.print(sb);
    }
}
