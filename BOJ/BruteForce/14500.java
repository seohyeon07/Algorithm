package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tetromino {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][]paper=new int[N+1][M+1];
        int ans =0;


        for(int i=0; i<N; i++){ // 종이판 set
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j =0; j<M; j++){
                paper[i][j]=Integer.parseInt(st2.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(j+3 < M){ //가로 4칸 테트로미노
                    int tmp = paper[i][j] + paper[i][j+1] + paper[i][j+2] + paper[i][j+3];
                    ans = Math.max(ans,tmp);
                }
                if(i+3 < N){ //세로 4칸
                    int tmp = paper[i][j] + paper[i+1][j] + paper[i+2][j] + paper[i+3][j];
                    ans= Math.max(ans,tmp);
                }
                if(i+1<N && j+1 < M){ //정사각형 모양
                    int tmp = paper[i][j]+ paper[i][j+1] + paper[i+1][j] +paper[i+1][j+1];
                    ans = Math.max(ans,tmp);
                }
                if(j+2 < M){ //'ㅗ','ㅜ' 공통 부분 => 'ㅡ'
                    int tmp = paper[i][j]+paper[i][j+1]+paper[i][j+2];
                    if(i-1 >= 0){ //'ㅗ'
                        int tmp2 = tmp + paper[i-1][j+1];
                        ans = Math.max(ans,tmp2);
                    }
                    if(i+1 < N){//'ㅜ'
                        int tmp2 = tmp + paper[i+1][j+1];
                        ans = Math.max(ans, tmp2);
                    }
                }
                if(i+2<N){ //'ㅓ','ㅏ' 공통 부분 = > 'ㅣ'
                    int tmp = paper[i][j]+paper[i+1][j]+paper[i+2][j];
                    if(i+1 <N && j+1 <M){ //'ㅏ'
                        int tmp2 = tmp + paper[i+1][j+1];
                        ans = Math.max(ans,tmp2);
                    }
                    if(i+1 <N && j-1 >=0){ //'ㅓ'
                        int tmp2 = tmp + paper[i+1][j-1];
                        ans = Math.max(ans,tmp2);
                    }
                    if(j-1 >=0){ // ㄱ 세로로 긴 모양 세로=3 가로 2
                        int tmp2 = tmp +paper[i][j-1];
                        ans = Math.max(ans,tmp2);
                    }
                    if(j+1 < M){ // 위에꺼 오른쪽으로 뒤집기
                        int tmp2 = tmp + paper[i][j+1];
                        ans=Math.max(ans,tmp2);
                    }
                    if(j+1 < M){ // 'ㄴ' 모양 세로 긴 모양 세로=3 가로2
                        int tmp2 = tmp + paper[i+2][j+1];
                        ans = Math.max(ans,tmp2);
                    }
                    if(j-1>=0){ // 위에꺼 뒤집기
                        int tmp2 = tmp + paper[i+2][j-1];
                        ans = Math.max(ans, tmp2);
                    }
                }
                if(j+2<M ){ //공통 부분 '___'
                    int tmp = paper[i][j]+paper[i][j+1]+paper[i][j+2];
                    if(i-1>=0){ //'___ㅣ'
                        int tmp2 = tmp + paper[i-1][j+2];
                        ans=Math.max(ans,tmp2);
                    }
                    if(i+1 < N){//'---ㅣ;
                        int tmp2 =tmp + paper[i+1][j+2];
                        ans = Math.max(ans, tmp2);
                    }
                    if(i-1 >=0){ //'ㅣ___'
                        int tmp2 = tmp + paper[i-1][j];
                        ans = Math.max(ans,tmp2);
                    }
                    if(i+1 <N){//'ㅣ---'
                        int tmp2 = tmp + paper[i+1][j];
                        ans = Math.max(ans,tmp2);
                    }
                }
                if(i+2 < N && j+1 <M){ // 'ㅣ-ㅣ' 순서대로 연결한 모양
                    int tmp = paper[i][j]+paper[i+1][j]+paper[i+1][j+1]+paper[i+2][j+1];
                    ans = Math.max(ans, tmp);
                }
                if(i+1<N && j-1 >=0){ //위에 모양 오른쪽을 뒤집기
                    int tmp = paper[i][j]+paper[i+1][j]+paper[i+1][j-1]+paper[i+2][j-1];
                    ans = Math.max(ans,tmp);
                }
                if(i+1 <N && j+2 <M){ //'z'모양
                    int tmp = paper[i][j] + paper[i][j+1]+paper[i+1][j+1]+paper[i+1][j+2];
                    ans = Math.max(ans,tmp);
                }
                if(i+1<N && j-2 >=0){ //위에 모양 오른쪽으로 뒤집기
                    int tmp = paper[i][j] + paper[i][j-1]+paper[i+1][j-1]+paper[i+1][j-2];
                    ans = Math.max(ans,tmp);
                }
            }
        }
        System.out.println(ans);
    }
}
