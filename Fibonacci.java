// how to calculate the nth Fibonacci number using recursion in Java
//0 and 1 are the first two numbers in the Fibonacci sequence  0,1,2,1,3,5,8,13,21,34,55,89,144
//0+1=1
//1+1=2
//1+2=3
//2+3=5
//3+5=8
//the nth Fibonacci number can be calculated using the formula:
//F(n) = F(n-1) + F(n-2)

public class Fibonacci {

    public static void main(String[] args) {
    //     int a = 0, b = 1, c = 0, n;
    //     n = 10; // change this value to calculate the nth Fibonacci number
    //     while (n > 0) {
    //         a = b;
    //         b = c;
    //         c = a + b;
    //     }
    //     System.out.println("Enter max value: ");

    // }
    int a=0,b=1,c;

    for(int i=1;i<=10;i++){
        c=a+b;
        a=b;
        b=c;
        System.out.print(a+" ");
    }
    }
}
