import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrintQ {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cases = Integer.parseInt(br.readLine());

        for(int i = 0; i<cases; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int docNum = Integer.parseInt(st.nextToken()); // 문서 개수
            int find = Integer.parseInt(st.nextToken()); // 궁금한 문서 순서, 찾아야 하는 문서
            int count = 0; // 출력 횟수


            LinkedList<int[]> level = new LinkedList<>();
            st = new StringTokenizer(br.readLine()); // 중요도 입력

            for(int j = 0; j<docNum; j++){
                level.offer(new int[]{j, Integer.parseInt(st.nextToken())}); // { 초기 순서, 중요도 } 큐에 저장.
            }

            while(!level.isEmpty()){

                int[] head = level.poll(); // 가장 앞 head
                boolean max = true;


                for(int k = 0; k<level.size(); k++){
                    if(head[1] < level.get(k)[1]){  // head의 중요도보도 뒤에 값이 더 크다면
                        level.offer(head); // head 맨 뒤로 이동
                        for(int u = 0; u<k; u++){  // 찾은 큰 값을 맨 앞(head)로, 나머지는 다 뒤로 이동
                            level.offer(level.poll());
                        }
                        max = false; // head가 가장 큰 값x,
                        break; // for문 빠져나오기. 검색 끝, 다시 처음부터 검색
                    }

                }
                if(max == false){
                    continue; // 다음 while 문으로 다음 반복 처음부터 다시 검색
                }
                // max == true 가장 높은 중요도 => 출력
                count++;
                if(head[0] == find){
                    break; // 찾고자 하는 문서(find)와 가장 높은 중요도 같다면 (- 동일 중요도를 구분을 위해 초기 순서와 비교)
                }
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb);

    }
}
