
//3) how to check if a number is palindrome in java     121 , 12321 , 1234, 12345, 4312
public class Palindrome{

    public static void main(String []args){

            int num = 121;               //starting index 0 to 4s
            int rev = 0;                     //empty string
            int temp = num;                   //temp variable to store original number
        //logic 0+1 =1
        //1*10 +2 =12
        //12*10 +1 =121
        
            while (num != 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }

            if(temp == rev){
                System.out.println(temp + " is a palindrome number.");
            }
            else{
                System.out.println(temp + " is not a palindrome number.");
            }
    }
}