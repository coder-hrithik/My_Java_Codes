package DsSearching;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        int ans = bSearch(arr, target);
        System.out.println(ans);
    }
    public static int bSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid;
            else start = mid +1;
        }
        return arr[start] < target ? start + 1 : start;
    }
}
