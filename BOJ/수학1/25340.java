package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Receipt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int receipt = Integer.parseInt(br.readLine());
        int items = Integer.parseInt(br.readLine());
        int result  = 0;

        for(int i=0; i<items; i++){
            StringTokenizer item = new StringTokenizer(br.readLine());
            int itemPrice = Integer.parseInt(item.nextToken());
            int itemNum = Integer.parseInt(item.nextToken());

            int itemSum = itemPrice * itemNum;

            result += itemSum;
        }

        if(receipt == result){
            System.out.println("Yes");
            br.close();
            return;
        }
        System.out.println("No");
        br.close();

    }
}
