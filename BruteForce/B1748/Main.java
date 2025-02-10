package BruteForce.B1748;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
        Integer num  = Integer.valueOf(bs.readLine());
        if(num <10){
            System.out.println(num);
            return ;
        }
        int num2 = 9;
        int count = 0;
        int pre = 0;
        while(num > num2){
            count += (num2-pre) * (String.valueOf(num2).length());
            pre = num2;
            num2 = num2 * 10 +9;
        }
        count = count + ((num - (int)(num2/10))* (String.valueOf((int)(num2/10)).length()+1));
        System.out.println(count);
    }
}
