import java.util.*;

public class duplicateInt{
    public static boolean hasDuplicate(int[] arr){
        //create an integer hashset to store all the unique elements from the integer array
        //An HashSet arranges the elements in a particular order, and doesn't allow duplicate values
        HashSet<Integer> set = new HashSet<>();
        for(int x: arr){
            System.out.println(x);
            // check if the set already has the element, then return that a duplicate is present
            if(set.contains(x)){
                return true;
            }
            //if integer x is not in the hashset, add it
            set.add(x);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            */
        int[] arr2={1,2,3,4,5};
        System.out.print(hasDuplicate(arr2));

    }
}