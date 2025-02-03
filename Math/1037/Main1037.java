import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main1037 {
    public static void main(String[] args) throws Exception {
        // 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고,
        // A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.parseInt(br.readLine());
        String numString = br.readLine();
        List<Integer> numList = Arrays.stream(numString.split(" ")).map(e->Integer.parseInt(e)).collect(Collectors.toList());
        numList.sort(Comparator.comparing(Integer::intValue));

        System.out.println(numList.get(0) * numList.get(numList.size()-1));


    }
}
