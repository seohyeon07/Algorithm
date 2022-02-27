
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class speedsum {
	public static void main(String[]args)throws IOException{
		
//		InputStreamReader ir= new InputStreamReader(System.in);
//		BufferedReader br= new BufferedReader(ir);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num= Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine()); // 한줄 씩 입력받는데 토큰이 스페이스 기준으로 나뉘어 진다는 의미 : 스페이스 기준으로 입력 되는 것이 아님! 착각ㄴㄴ
			//디폴트 스페이스 공백문자(스페이스)이기 때문에 생략 가
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n"); 
			//write 메소드가 리턴값이 char이기때문에 string 으로 바꿔서 출력해야 올바르게 출력됨. int로 넣으면 예로 65를 A로 바꿔서 이상한 결과 값 출력
			//계산후 +"\n"을 사용하여 string으로 변환한다.Intger끼리 합하는거 가로 넣어서 정확하게 계산해야 함.
			//또는 두개 계산 후 String.valueOf작성 하여 형변환 시켜주기
			//bw.write(String.valueOf(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))); 
			//bw.write("\n");
			
		}
		bw.close(); //close()를 하면 자동으로 먼저 flush()후에 닫힌다.
	}
}
