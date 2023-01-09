package DsSearching;

public class LinerSearch {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6};
        int target = 7;
        boolean b = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("Found:" + i);
                b = true;
                break;
            }
        }
        if(b == false){
            System.out.println("Not found");
        }
    }
}
