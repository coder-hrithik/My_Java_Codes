package NumberConversion;

// WAP to convert Hexadecimal to Binary
public class HexaToBinary {
    public static void main(String[] args) {
        // hexadecimal to decimal
        String hex = "a";
        int dec = Integer.parseInt(hex, 16);
        System.out.println("The decimal vale is: " + dec);
        // Decimal to Binary
        String bi = "";
        while (dec != 0) {
            int rem = dec % 2;
            bi = rem + bi;
            dec /= 2;
        }
        System.out.println("The binary value is: " + bi);
    }

}
