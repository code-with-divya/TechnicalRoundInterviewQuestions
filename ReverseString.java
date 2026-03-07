//1)how to reverse a string in java  "india"
public class ReverseString {

    public static void main(String[] args) {

        String s = "india";           //starting indix 0 to 4 

        int len =s.length();          //length of string is 5

        String rev = "";               //empty string

        for(int i=len-1; i>=0; i--)
        {
            rev=rev+s.charAt(i) ;           //logic 0+a =a 
                                            //a+i =i
                                            //i+d =d
                                            //d+n =n
                                            //n+i =i

        }

        System.out.println("Reversed string: " + rev);        //output: Reversed string: aidni

    }
}