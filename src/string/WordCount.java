package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {

        String str = "I am in Pune";

        String[] strings = str.split(" ");

        Map<String,Integer> map = new LinkedHashMap<>();

        for (String sc:strings){
            if(map.containsKey(sc)){
                map.put(sc,map.get(sc)+1);
            }else {
                map.put(sc,1);
            }
        }

        System.out.println(map);

//        String str = "I am am in Pune".replaceAll("\\s","").toLowerCase();
//
//        char[] chars = str.toCharArray();
//
//        Map<Character,Integer> map = new LinkedHashMap<>();
//
//        for (Character sc:chars){
//            if(map.containsKey(sc)){
//                map.put(sc,map.get(sc)+1);
//            }else {
//                map.put(sc,1);
//            }
//        }
//
//        System.out.println(map);
    }
}
