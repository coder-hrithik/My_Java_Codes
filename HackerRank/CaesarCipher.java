package HackerRank;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "okffng-Qwvb";
        int k = 3;
        System.out.print(cipher(k, s));
    }

    public static String cipher(int k, String s) {
        k = k % 26;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int m = (int) ch + k;
            if (Character.isLetter(ch)) {
                if(Character.isUpperCase(ch)){
                    if(m > 90){
                        m = m - 26;
                    }
                    ans = ans + (char) m;


                } else if (Character.isLowerCase(ch)){
                    if(m > 122){
                        m = m - 26;
                    }
                    ans = ans + (char) m;
                }
            } else {
                ans = ans + ch;
            }
        }
        return ans;
    }
}
