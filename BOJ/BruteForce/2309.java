package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SevenDwarf{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] dwarf = new int [9];
        int [] sevenDwarf = new int [8];
        StringBuilder sb = new StringBuilder();
        int sum=0;
        for(int i=0; i<9; i++){
            dwarf[i]=Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }
        Arrays.sort(dwarf);
        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                if(sum-dwarf[i]-dwarf[j]==100){ //난쟁이가 아닌 두명 찾기
                    for(int k=0; k<9; k++){ //찾은 두명을 제외한 진짜 난쟁이 7명만 고르기
                        if(i==k || j==k) continue;
                        sb.append(dwarf[k]).append("\n");
                    }
                    System.out.print(sb);
                    return;
                }
            }
        }
    }
}
