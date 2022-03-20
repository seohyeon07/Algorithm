
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int [] stack = new int [100001];
	static int index=-1;
	
	public static void push(int item) {
		stack[++index]=item;
	}
	public static int pop() {
		if(index==-1) {
			return -1;
		}
		else{
			return stack[index--];
			}
		
	}
	public static int top() {
		if(index==-1) {
			return -1;
		}
		return stack[index];
		
	}
	public static int empty() {
		if(index==-1){
			return 1;
		}
		else
			return 0;
	}
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			
			switch(st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "top":
				sb.append(top()).append("\n");
				break;
			case "size":
				sb.append(index+1).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			}
		}
		System.out.println(sb);

	}

}
