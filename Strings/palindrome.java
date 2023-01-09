package Strings;

public class palindrome {
    public static void main(String[] args) {
        String str = "madAm ";
        str = str.toLowerCase();
        str = str.trim();
        System.out.println(pali(str));
    }

    public static boolean pali(String str){
        for (int i = 0; i <str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
