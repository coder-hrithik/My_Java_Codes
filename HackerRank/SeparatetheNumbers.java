package HackerRank;

public class SeparatetheNumbers {
    public static void main(String[] args) {
        String s = "1234";
        check(s);
    }

    static void check(String s){
        String substring = "";
        boolean isValid = false;
        
        for(int i = 0; i < s.length() / 2; i++){
            substring = s.substring(0 ,i);
            Long num = Long.parseLong(substring);
            
            String validString = substring;
            while (validString.length() < s.length()){
                validString += Long.toString(++num);
            }
            if(s.equals(validString)){
                isValid = true;
                break;
            }
        }
        System.out.println(isValid ? "YES" + substring : "NO");
    }
}
