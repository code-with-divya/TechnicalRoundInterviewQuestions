//2) how to reverse an integer in java "123456789"

public class ReverseInteger {

    public static void main(String[] args) {

        int num = 123456789;               //starting index 0 to 8s
        int rev = 0;                     //empty string

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversed number: " + rev);
    }

}
