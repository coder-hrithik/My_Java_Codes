package NumberConversion;

public class HexaToDec {
    public static void main(String[] args) {
        String hex = "ab";
        // Integer.parseInt() method converts string to int with given redix.
        int decimal = Integer.parseInt(hex, 16);
        System.out.println(decimal);
    }
}
