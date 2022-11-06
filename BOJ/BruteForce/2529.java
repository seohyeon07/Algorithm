package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Sign {
    static int k; //k 개수
    static ArrayList <String> numList; // num의 모음 -> 나중에 max, min 비교 할 때 사용 할거임
    static boolean [] check; //사용한 숫자 체크
    static char [] a; //입력 부등호


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        a= new char[10];
        for(int i=0; i<k; i++){
            a[i]=st.nextToken().charAt(0);
        }
//        String tmp = br.readLine();
//        a= tmp.replace(" ","").toCharArray();
        check = new boolean[10]; // 초기값 = false
        numList = new ArrayList<>();
        go(0,"");
        Collections.sort(numList); //ArrayList sort
        System.out.println(numList.get(numList.size()-1)); //가장 마지막 값
        System.out.println(numList.get(0)); // 첫번째 값
    }
    public static void go(int index, String num){ //index번째 숫자, 만들어진 문자열(숫자)
        if(index==k+1){ // 문자열 끝까지 다 찾았으면
            numList.add(num);
            return;
        }
        for(int i=0; i<=9; i++){ // 문자열 찾는 중 - 다음 숫자 결정
            if(check[i]) continue; // 사용한 숫자이면 통과
            if(index==0 || good(Character.getNumericValue(num.charAt(index-1)),i, a[index-1])){ // 1. 첫번째 선택이거나 2. 부등호 조건에 맞으면 숫자를 선택하겠다.
                check[i]=true;
                go(index+1, num+i); // 다음 숫자 찾기 위해 재귀함수 호출 (선택된 숫자는 문자열에 추가)
                check[i]=false; // 사용한 숫자는 완료는 다시 false 로 바꿔 다음 문자열 찾을 수 있도록
            }
        }
    }
    public static boolean good(int x, int y, char op){ // 부등호 조건 확인
        if(op =='<'){
            if(x > y)
                return false;
        }
        if(op =='>'){
            if(x < y)
                return false;
        }
        return true;
    }
}
