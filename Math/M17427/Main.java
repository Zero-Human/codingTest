package Math.M17427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws Exception {
        //두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다.
        // 예를 들어, 2의 약수는 1, 2가 있고, 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24가 있다.
        // 자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고, f(A)로 표현한다. x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다.
        //자연수 N이 주어졌을 때, g(N)을 구해보자.

        // 1, 2, 3, 4, 5, 6, 7, 8,
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.parseInt(br.readLine());

        long n = 0;
        for(int i=1; i<=count; i++){
            n += (count/i) * i;
        }
        System.out.println(n);
    }
}