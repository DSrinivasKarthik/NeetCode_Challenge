import java.util.*;

public class validAnagram{
    public static void main(String[] args){
            String s="racecar",t="carrace";
            String s2="jar",t2="jam";

            HashMap<Character,Integer> map = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();

            for(char x: s.toCharArray()){
                if(map.containsKey(x)){
                    map.put(x,map.get(x)+1);
                }
                else{
                    map.put(x,1);
                }
            }
            for(char x: t.toCharArray()){
                if(map2.containsKey(x)){
                    map2.put(x,map2.get(x)+1);
                }
                else{
                    map2.put(x,1);
                }
            }
            System.out.print(map.equals(map2));

    }
}