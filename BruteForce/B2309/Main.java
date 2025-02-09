package BruteForce.B2309;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList();
        for (int i=0; i<9; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }
        list = list.stream().sorted().collect(Collectors.toList());
        for(int i=0; i < 8; i++){
            for (int j = i+1; j <9; j ++ ){
                int count =0;
                for(int k=0; k < 9; k ++){
                    if(k == i || k== j) continue;
                    count += list.get(k);
                }
                if(count == 100){
                    list.remove(i);
                    list.remove(j-1);
                    list.stream().forEach(System.out::println);
                    return ;
                }
            }
        }

    }
}