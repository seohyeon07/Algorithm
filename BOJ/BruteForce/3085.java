package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Candy {
    public static int N;
    public static char [][]candy;
    public static int max=0;

    public static void swapW(int i, int j){ //swap가로
        char tmp = candy[i][j];
        candy[i][j]=candy[i][j+1];
        candy[i][j+1]=tmp;

    }
    public static void swapL(int i, int j){ //swap세로 - 인덱스 주의!
        char tmp = candy[j][i];
        candy[j][i]=candy[j+1][i];
        candy[j+1][i]=tmp;

    }
    public static void checkMax(){

        for(int i=0; i<N; i++){ //가로 확인
            int count=1;
            for(int j=0; j<N-1; j++){
                if(candy[i][j]==candy[i][j+1]) {
                    count++;
                }
                else {
                    count=1; //연속아니면 다시 시작
                }
                max=Math.max(max,count);
            }
        }

        for(int i=0; i<N; i++){ //세로 확인
            int count=1;
            for(int j=0; j<N-1; j++){
                if(candy[j][i]==candy[j+1][i]) {
                    count++;
                }
                else {
                    count=1; //연속아니면 다시 시작
                }
                max=Math.max(max,count);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        candy = new char[N][N];

        for(int i=0; i<N; i++){  //캔디 판 저장
            String st = br.readLine();
            for(int j=0; j<N; j++){
                candy[i][j] = st.charAt(j);
            }
        }

        for(int i=0; i<N; i++){ //가로
            for(int j=0; j<N-1; j++){
                swapW(i,j); //swap
                checkMax(); //max 확인
                swapW(i,j); //swap 원상태
            }
        }
        for(int i=0; i<N; i++){ //세로
            for(int j=0; j<N-1; j++){
                swapL(i,j); // swap
                checkMax(); //max 확인
                swapL(i,j); // swap 원상태
            }
        }
        System.out.println(max);
    }
}
