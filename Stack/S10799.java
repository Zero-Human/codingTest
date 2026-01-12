package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S10799 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String src = br.readLine();
        int result = 0;
        int open = 0;
        for(int i=0; i < src.length(); i++){
            if (src.charAt(i) == '(') {
                open++;
            } else { // ')'
                open--; // 먼저 닫기 처리
                if (src.charAt(i - 1) == '(') { // 레이저 "()"
                    result += open;
                } else { // 막대 끝
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}
