package algorithms;


public class BinarySearch {
    // while로 loop 형식으로 구현
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
    // 제귀함수 방식으로 구현
    public static Integer binarySearchV2(Integer[] array, Integer target, Integer left, Integer right){
        if(left>right) return -1;
        Integer mid = (left + right) / 2;

        if(array[mid] == target) return mid;
        else if(array[mid] < target) return binarySearchV2(array, target, mid +1, right);
        else return binarySearchV2(array, target, left, mid -1);
    }
    public static void main(String[] args) throws Exception {
        // binarySearch는 정렬된 리스트에 중간값을 확인하여
        // 작으면 왼쪽을 크면 오른쪽으로 다시 리스트화하여 원하는 값을 찾는 방식이다.
        Integer[] array = new Integer[]{1,2,3,4,5,6,9,10,11};
        Integer target = 9;
        System.out.println(binarySearch(array,target));
        System.out.println(binarySearchV2(array,target, 0, array.length-1));
    }
}
