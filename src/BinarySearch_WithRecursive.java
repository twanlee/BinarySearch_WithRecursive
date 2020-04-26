public class BinarySearch_WithRecursive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int searchValue = 4;
        int index = binarySearch(arr,0,arr.length-1,searchValue);
        if(index!= -1){
            System.out.println("Element found at index: " + index);
        }else System.out.println("Not found");
    }
    public static int binarySearch(int[] arr,int left, int right, int x){
        if(left>right) return -1;
        int mid = (left+right)/2;
        if(x == arr[mid]) return mid;
        else if(x<arr[mid])return binarySearch(arr,left,mid-1,x);
        else return binarySearch(arr,mid+1, right,x);
    }
}
