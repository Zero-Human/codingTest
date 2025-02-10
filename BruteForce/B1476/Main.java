package BruteForce.B1476;
import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] arg) throws Exception{
        BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Stream.of(bs.readLine().split(" ")).map(e->Integer.valueOf(e)).collect(Collectors.toList());
        int e=1;
        int s=1;
        int m=1;
        int count = 1;
        while(true){
            if(list.get(0) ==e && list.get(1) == s && list.get(2) == m) break;
            else{
                e +=1;
                s +=1;
                m +=1;
                if(e>15) e =1;
                if(s>28) s=1;
                if(m>19) m=1;
                count +=1;
            }
        }
        System.out.println(count);
    }
}