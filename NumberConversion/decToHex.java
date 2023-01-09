package NumberConversion;

public class decToHex {
    public static void main(String[] args) {
        int n = 12;
        String res = "";
        while (n != 0){
            int rem = n % 16;
    
            if( rem == 10){
                res = "a" + res;
            }
            else if(rem == 11){
                res = "b" + res;
            }
            else if(rem == 12){
                res = "c" + res;
            }
            else if(rem == 13){
                res = "d" + res;
            }
            else if (rem == 14){
                res = "e" + res;
            }
            else if(rem == 15){
                res = "f" + res;
            }
            else{
                res = rem + res;
            }
            n /= 16;
    
        }
        System.out.println(res);
    }
}
