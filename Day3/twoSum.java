package Day3;

import java.util.*;

public class twoSum{
    public static int[] twoSumCalc(int[] arr, int target){
        //create a HashMap with two integers to store the element along with its index
        HashMap<Integer,Integer> map = new HashMap<>();
        //use a normal for loop to iterate the indices
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int diff=target-num;
            //check if the diff is present as element in the map
            if(map.containsKey(diff)){
                //return the diff's index along with the current number's index
                return new int[] {map.get(diff),i};
            }
            //add each element from the array to the hashmap
            map.put(arr[i],i);
        }
        //return an empty array if no solution found
        return new int[] {};
    }
    public static void main(String[] args){
        int[] arr= {3,4,5,6};
        int target=7;
        int[] ans=new int[2];
        ans=twoSumCalc(arr,target);
        System.out.print("[");
        for(int x:ans){
        System.out.print(x+" ");
        }
        System.out.print("]");
    }
}