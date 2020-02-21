package hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        List <Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(7);
        System.out.println(getMinimumUniqueSum(arr));
    }

    public static int getMinimumUniqueSum(List<Integer> arr) {
        // Write your code here
        int sum= 0;
        Set<Integer> numbers = new HashSet<>();
        for(Integer digits : arr){
            numbers.add(digits);
        }

        for ( Integer nums : numbers){
            sum += nums;
        }

        return sum;
    }
}
