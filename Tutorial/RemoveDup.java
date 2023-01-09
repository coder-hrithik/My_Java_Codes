package Tutorial;

public class RemoveDup {
    public static void main(String[] args) {
        int[] a = { 11, 22, 11, 33, 44, 55, 66, 33 };
        int[] n = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                }
            }
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                n[k++] = a[i];
            }
        }
        n[k++] = a[a.length - 1];

        for (int i = 0; i < k; i++) {
            System.out.print(n[i] + " ");
        }
        // System.out.println(Arrays.toString(n));
    }

    public static void swap(int[] a, int s, int e) {
        int temp = a[s];
        a[s] = a[e];
        a[e] = temp;
    }
}
