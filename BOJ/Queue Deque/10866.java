import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class  Deque {
    static int [] deque = new int [20001];
    static int end =10000;
    static int begin=10000;
    static int size =0;

    static void push_front(int X){
        deque[begin]=X;
        begin--;
        size++;
    }
    static void push_back(int X){
        end++;
        size++;
        deque[end]=X;
    }
    static int pop_front(){
        if(empty()==1){
            return -1;
        }
        else{
            begin++;
            size--;
            return deque[begin];
        }
    }
    static int pop_back(){
        if(empty()==1){
            return -1;
        }
        else{
            end--;
            size--;
            return deque[end+1];
        }

    }
    static int size(){
        return size;

    }
    static int empty(){
        if(size==0){
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
            return deque[begin+1];
        }

    }
    static int back(){
        if(empty()==1){
            return -1;
        }
        else{
            return deque[end];
        }

    }
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<N; i++){
            StringTokenizer orderString = new StringTokenizer(br.readLine());
            String order = orderString.nextToken();
            switch(order){
                case "push_back" :
                    push_back(Integer.parseInt(orderString.nextToken()));
                    break;
                case "push_front" :
                    push_front(Integer.parseInt(orderString.nextToken()));
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
                case "pop_front" :
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back" :
                    sb.append(pop_back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
