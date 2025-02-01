import java.util.*;
import java.util.stream.Collectors;

public class Main10430 {

    public static void main(String[] args) {
        //첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
        Scanner sc = new Scanner(System.in);
        List<Integer> a = Arrays.stream(sc.nextLine().split(" ")).map(e->Integer.parseInt(e)).collect(Collectors.toList());

        System.out.println((a.get(0)+a.get(1))%a.get(2));
        System.out.println(((a.get(0)%a.get(2))+(a.get(1)%a.get(2)))%a.get(2));
        System.out.println((a.get(0)*a.get(1))%a.get(2));
        System.out.println(((a.get(0)%a.get(2))*(a.get(1)%a.get(2)))%a.get(2));
    }
}