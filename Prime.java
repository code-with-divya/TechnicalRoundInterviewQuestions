//how to check if a number is prime in Java
//1 is not a prime number
//2 is the only even prime number
//a prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers
//the first few prime numbers are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
public class Prime {

    public static void main(String [ ] args){

        int num = 31; 
        int count = 0;

        for (int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
            if(count==2){
                System.out.println(num+" is a prime number");
            }else{
                System.out.println(num+" is not a prime number");
            }
        }
    }
    
}
