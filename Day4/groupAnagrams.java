package Day4;

import java.util.*;

public class groupAnagrams {
    public static List<List<String>> groupAnagram(String[] arr){
        //create a HashMap with a String to store the unique key  
        //and a List<String> to store all the values that match the key in the list
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s: arr){
            //create an empty integer array list that represent the 26 alphabets
            int[] nums = new int[26];
            for(char c:s.toCharArray()){
                // for every character in the string, count it in the nums array.
                // This gives us a unique key value for each String with different characters
                nums[c-'a']++;
            }
            String key=Arrays.toString(nums);
            //System.out.println(Arrays.toString(nums));
            if(!map.containsKey(key)){
                //put the String key into the map along with empty list if the key is not present in the map.
                map.put(key,new ArrayList<>());
            }
            //if key is present in the map, then add the String into the values list
            map.get(key).add(s);
        }
        //we return an ArrayList because List is an interface in Java, and we cannot instantiate an interface directly
        //Instead, we instantiate a class that implements the List interface, such as ArrayList.
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){
        String[] arr={"acts","cats","pots","stop","hat","tops"};
        List<List<String>> list = groupAnagram(arr);
        for (List<String> group : list) {
            System.out.println(group);
        }
    }
    
}
