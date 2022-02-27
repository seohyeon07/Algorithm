
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;



public class UpAverage {
	public static void main(String[]args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		StringTokenizer st;
		
		int Case = Integer.parseInt(br.readLine());
		double studentNum=0;
		int []tmp=new int[1000];
		int sum;
		double avg;
		int count;
		double result;
//		DecimalForMat form= new DecimalFormat("#.###");
		
		for(int i=0; i<Case; i++) {
			sum=0;
			count=0;
			result=0;
			avg=0;
			st = new StringTokenizer(br.readLine());
			studentNum=Integer.parseInt(st.nextToken());
			for(int j=0; j<studentNum; j++) {
				tmp[j]=Integer.parseInt(st.nextToken());
				sum+=tmp[j];
			}
			avg=sum/studentNum;
		
			for(int k=0; k<studentNum; k++) {
				if(tmp[k]>avg) {
					count++;
				}
			}
			result= (count/studentNum)*100;
			String result2=String.format("%.3f", result);
			sb.append(result2).append("%").append("\n");
		}
		System.out.println(sb);
		
	}

}
