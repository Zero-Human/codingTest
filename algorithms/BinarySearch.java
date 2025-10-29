package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {
    public static Integer binarySearch(Integer[] array, Integer target){
        Integer left = 0;
        Integer right= array.length-1;
        while ( left <= right){
            Integer mid = (left + right) / 2;
            if(array[mid] == target) return mid;
            else if(array[mid] < target) left = mid + 1;
            else right = mid -1;
        }
        return -1;
    }
    public static Integer binarySearchV2(Integer[] array, Integer target, Integer left, Integer right){
        if(left>right) return -1;
        Integer mid = (left + right) / 2;

        if(array[mid] == target) return mid;
        else if(array[mid] < target) return binarySearchV2(array, target, mid +1, right);
        else return binarySearchV2(array, target, left, mid -1);
    }
    public static void main(String[] args) throws Exception {
        Integer[] array = new Integer[]{1,2,3,4,5,6,9,10,11};
        Integer target = 9;
        System.out.println(binarySearch(array,target));
        System.out.println(binarySearchV2(array,target, 0, array.length-1));
    }
}
