import java.util.*;

public class validAnagram{
    public static void main(String[] args){
            String s="racecar",t="carrace";
            String s2="jar",t2="jam";

            //create 2 hashmaps to store each character and its occurance for the given two strings
            HashMap<Character,Integer> map = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();
            
            //convert the string to a character array
            for(char x: s.toCharArray()){
                
                if(map.containsKey(x))  //check if the character already exists in the hashmap
                {
                    map.put(x,map.get(x)+1);    //increase its previous occurance count by one
                }
                else{
                    map.put(x,1);       //if character is unique, then assign occurance value as 1
                }
            }
            //repeat for next string
            for(char x: t.toCharArray()){
                if(map2.containsKey(x)){
                    map2.put(x,map2.get(x)+1);
                }
                else{
                    map2.put(x,1);
                }
            }
            //use .equals() to check if both hashmaps are equal or not and then print boolean value
            System.out.print(map.equals(map2));

    }
}