
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;



public class Npoint {
	public static void main(String[]args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		for(int i=1; i<=num; i++) {
			bw.write(i+"\n");
		}
		bw.close();
		
	}

}

//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//
//
//
//
//public class Npoint{
//	public static void main(String[]args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//        
//		int num = Integer.parseInt(br.readLine());
//		
//		for(int i=1; i<=num; i++) {
//			sb.append(i+"\n");
//        }
//        System.out.println(sb);
//		
//	}
//
//}
