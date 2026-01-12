package Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class M9375 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.valueOf(br.readLine());
        for(int i=0; i < count; i++) {
            Integer kindCount = Integer.valueOf(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < kindCount; j++) {
                String clothes = br.readLine().split(" ")[1];
                Integer clothesCount = map.getOrDefault(clothes, -1);
                if (clothesCount == -1) {
                    map.put(clothes, 1);
                } else {
                    map.put(clothes, ++clothesCount);
                }
            }
            int resultCount = 1;
            for(String key : map.keySet()){
                resultCount = resultCount * (map.get(key) + 1);
            }
            System.out.println(resultCount -1);
        }
    }
}
