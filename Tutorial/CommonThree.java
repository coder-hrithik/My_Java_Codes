package Tutorial;

public class CommonThree {
    public static void main(String[] args) {
        int array1[] = { 2, 4, 8 };
        int array2[] = { 2, 3, 4, 8, 10, 16 };
        int array3[] = { 4, 8, 14, 40 };

        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                for (int j2 = i + 2; j2 < array3.length; j2++) {
                    if (array1[i] == array2[j] && array2[j] == array3[j2]) {
                        System.out.println(array2[i] + " ");
                    }
                }
            }
        }
    }
}
