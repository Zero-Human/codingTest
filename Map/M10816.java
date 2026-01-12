package Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M10816 {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cardCount = Integer.valueOf(br.readLine());
        List<String> cardList = Arrays.asList(br.readLine().split(" "));
        Integer card2Count = Integer.valueOf(br.readLine());
        List<String> card2List = Arrays.asList(br.readLine().split(" "));
        Map<String,Integer> cardMap = new HashMap<>();
        for(int i=0; i < cardCount; i++ ){
            Integer count = cardMap.getOrDefault(cardList.get(i),-1);
            if(count == -1){
                cardMap.put(cardList.get(i),1);
            } else {
                cardMap.put(cardList.get(i),++count);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < card2Count; i++){
            Integer count = cardMap.getOrDefault(card2List.get(i),0);
            sb.append(count).append(" ");
        }
        System.out.println(sb);
    }

}
