package Math.M4375;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //2와 5로 나누어 떨어지지 않는 정수 n(1 ≤ n ≤ 10000)가 주어졌을 때,
        // 각 자릿수가 모두 1로만 이루어진 n의 배수를 찾는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int input = sc.nextInt();
            int num = 1;
            int count = 1;
            while (true) {
                if (num % input != 0) {
                    num = (num * 10 + 1) % input;
                    count++;
                } else break;

            }
            System.out.println(count);
        }
    }
}