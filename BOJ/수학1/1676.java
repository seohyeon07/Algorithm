import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountFatorial { 
    static int Count(int i){
        int count=0;
        while(i%5==0){
            count++;
            i/=5;
        }
        return count;
    }
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ansCount=0;
        for(int i=1; i<=N; i++){
            ansCount+=Count(i);
            }
        System.out.println(ansCount);
    }
}

// public class CountFatorial {
//     public static void main(String[]args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int count=0;
//         int N = Integer.parseInt(br.readLine());
//         for(int i=1; i<=N; i++){
//             if(i%5==0){
//                 count++;
//             }
//             if(i%25==0){
//                 count++;
//             }
//             if(i%125==0){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
