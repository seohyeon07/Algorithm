package Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaseConversion {
    static Stack stack = new Stack();

    static void conversion(int decimalNum, int B) { //B진수로 변환
        while (decimalNum != 0) {
            int tmp = decimalNum % B;
            decimalNum /= B;
            stack.push(tmp);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A= Integer.parseInt(st.nextToken());
        int B= Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(br.readLine());
        StringTokenizer Ast = new StringTokenizer(br.readLine());
        int decimalNum=0;

        for(int i=m-1; i>=0; i--){ //10진수로 변환
            int num = Integer.parseInt(Ast.nextToken());
            decimalNum += num*Math.pow(A,i);
        }
        conversion(decimalNum, B);

        while(!stack.empty()){
            sb.append(stack.pop()).append(" ");
        }
        System.out.print(sb);
    }
}
