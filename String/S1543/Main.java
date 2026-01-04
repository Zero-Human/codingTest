package String.S1543;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String content = br.readLine();
        String target = br.readLine();
        int count = 0;
        while (true) {
            int startIndex = content.indexOf(target);
            if (startIndex == -1) {
                break;
            } else {
                content = content.substring(startIndex + target.length()) ;
                count++;
            }
        }
        System.out.println(count);
    }
}
