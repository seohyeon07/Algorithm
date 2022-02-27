

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

//public class ApulsB5 {
//	public static void main(String[]args)throws IOException{
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringBuilder sb=new StringBuilder();
//		StringTokenizer st;
//		
//		while (true){
//			st = new StringTokenizer(br.readLine());
//			int x = Integer.parseInt(st.nextToken());
//			int y = Integer.parseInt(st.nextToken());
//			//int sum=x+y;
//			if(x==0 && y==0)
//				break;
//			else
//				sb.append(x+y).append("\n");
//			
//		}
//		System.out.println(sb);
//		
//	}
//
//}

public class ApulsB5{
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			
			int x = str.charAt(0)-'0';   // 문자0 -> 10진수 48 -> 첫번째 인덱스(문자열 숫자를 아스키코드로 변형)에서 문자0를 빼면 int형이 만들어짐.
			int y = str.charAt(2)-'0';   // " " =>String 타입 ' ' ->char => 앞에가 char니까 뒤에도 char형 쓰
			
			if(x==0&&y==0)
				break;
			sb.append(x+y).append('\n');
		}
		System.out.println(sb);
		
	}
}