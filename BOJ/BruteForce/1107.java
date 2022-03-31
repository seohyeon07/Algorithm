package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RemoteControl {
    static boolean [] broken= new boolean[10];

    static int possible(int channel){ //불가능 하면 0 가능하면 버튼을 누르기 위해 count 회수 리턴 - 123번이면 1,2,3 세번 눌러야 함.(1,2,3모두 정상 버튼일 때)
        if(channel==0){
            return broken[0] ? 0 : 1;
        }
        int len=0;
        while(channel>0){
            if(broken[channel % 10]){ //channel의 각 자리 수 마다 확인(버튼을 눌러야 하니까) - true이면 고장.
                return 0;
            }
            len+=1;
            channel/=10;
        }
        return len; //channel의 길이 만큼 다 확인해서 하나라도 고장난 버튼이면 if문에서 return 모두 가능한 버튼이면 누르는데 걸리는 횟수를 리턴함.
        //channel = 123번이면 1,2,3 모두 다 정상 버튼이여야 len 리턴 아니면 0을 리턴한다.

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //원하는 채널 - 현재 채널은 100번
        int M = Integer.parseInt(br.readLine()); //고장난 버튼 개수

        if(M>0) { //M이 0이면 고장난 버튼이 없다는 뜻 ->받지 않아도 됨
            StringTokenizer st = new StringTokenizer(br.readLine()); //고정난 버튼 한줄 받기
            for (int i = 0; i < M; i++) {
                int brokenButton = Integer.parseInt(st.nextToken()); //고장난 버튼
                broken[brokenButton] = true; // 고정난 버튼 배열에 저장(기억해두기).
            }
        }

        int ans = Math.abs(N - 100); // +,- 로만 채널 이동하는 횟수(버튼을 누르는 횟수) = (원하는 채널 - 현재 채널(100번)) =>절대 값

        for(int i=0; i<=1000000; i++){ //이동하려는 채널은 500000번까지 존재 -> N=50만번 5,1만 가능할 때 511111번 누르고 -로 내려오는 것이 최적 => 50만번 보다 큰수로 잡아야 함. 넉넉하게 100만으로 잡음.
            int len = possible(i); //0번부터 100만번 까지 broken(고장버튼 기억장소)에 넣어서 확인 어떤 버튼이 고장 버튼인지 확인하고 가능한 버튼으로 이뤄진 채널이라면 그 채널를 누르는 횟수.
            if(len > 0){
                int press = Math.abs(N-i); //+,-누르는 횟수 => N = 300번 i가 299일때(2,9번 정상 버튼일때) 300-299=1로 299번 버튼 누르는 횟수([2,9,9]3번=len) 그리고 '+' 1번(=press) 누르면 300번으로 이동
                ans = Math.min(ans,len+press); // (+,-로만 채널 이동하는 횟수) 와 (근접 채널을 누르는 횟수=len 과 +,-로 이동해 가는 횟수(press) )중 최솟 값
            }
        }
        System.out.println(ans);
    }
}
