package HackerRank;

// Length Of The Longest Consecutive 1s In Binary Representation Of A Number | BitManipulation
// left shift 1 == multiplying by 2
// right shift 1 == divide by 2
class MaxOnesBinary {
    public static void main(String[] args) {
        int number = 556;
        int count = 0;

        while (number > 0) {
            number = number & (number << 1);
            count++;
        }
        System.out.println(count);
    }

}