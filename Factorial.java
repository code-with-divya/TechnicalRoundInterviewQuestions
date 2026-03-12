//how to find factorial of a number using recursion
//5! = 5*4*3*2*1 =120
//6 = 6*5*4*3*2*1 =720
//7 = 7*6*5*4*3*2*1 =5040
public class Factorial {

    public static void main(String[] args) {

    //   //object creation
    //   Scanner sc = new Scanner(System.in);
    //   int n ; int fact =1;
         
    //   System.out.println("Enter the number to find factorial:");

    //   n = sc.nextInt();
    // //logic to find factorial
    //   while (n>0){       //5*4*3*2*1
    //     fact = fact*i;
    //     n= n-1;

    //   }
    //   System.out.println("Factorial of the given number is: " + fact);

    int n = 5;
    int fact =1;

    for (int i=1; i<=n;i++){    //1*2*3*4*5
                                
        fact = fact *i;
    }
    System.out.println("Factorial of the given number is: " + fact);

    }

   


    

}
