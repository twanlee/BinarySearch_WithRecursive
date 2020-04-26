public class BinarySearch_WithRecursive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int searchValue = 4;
        int index = binarySearch(arr,searchValue);
        if(index!= -1){
            System.out.println("Element found at index: " + index);
        }else System.out.println("Not found");
    }
    public static int binarySearch(int[] arr, int x){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(x==arr[mid]) return mid;
            else if(x<arr[mid]) right = mid-1;
            else left = mid +1;

        }
        return -1;
    }
}
