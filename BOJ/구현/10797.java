package Easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Car {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] car = new int [5];
        int date = Integer.parseInt(br.readLine());
        int count=0;
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i=0; i<5; i++){
            car[i]= Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<5; i++){
            if(car[i]==date){
                count++;
            }
        }
        System.out.println(count);
    }
}
