import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class postfix {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack <Double> stack = new Stack<>();

        int operandNum = Integer.parseInt(br.readLine());
        String input = br.readLine();
        double [] operand = new double [operandNum];
        for(int i=0; i<operandNum; i++){
            operand[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) >= 'A' && input.charAt(i)<='Z'){
                stack.push(operand[input.charAt(i)-'A']);
            }
            else{
                double tmp1 = stack.pop();
                double tmp2 = stack.pop();
                double result=0;
                switch(input.charAt(i)){
                    case '+' :
                        result = tmp2 + tmp1;
                        break;
                    case '-' :
                        result = tmp2 - tmp1;
                        break;
                    case '*' :
                        result = tmp2 * tmp1;
                        break;
                    case '/' :
                        result = tmp2 / tmp1;
                        break;
                }
                stack.push(result);
            }
        }
        System.out.printf("%.2f",stack.pop());
    }
}
