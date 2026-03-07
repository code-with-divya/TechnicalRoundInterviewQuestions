//how to check if a number is an Armstrong number in java
//153,407,0,1,370,371,407 is that amstrong number  345 ,675 is not amtrong number 
//if any no add the cube of its digist is equal to the number then it is amstrong number like 153 = 1^3 + 5^3 + 3^3 = 1 +125 +27 =153

public class Amstrong{

    public static void main(String []args){

        int num = 153;       
        int r = 0;
        int t =num ;


        while (num>0)
{
    r = num % 10;          //logic 153%10 =3
                            //15%10 =5
                            //1%10 =1

    num = num / 10;         //logic 153/10 =15
                            //15/10 =1
                            //1/10 =0

    t = t + r*r*r;          //logic 153 + 3^3 =153 +27 =180
                            //180 + 5^3 =180 +125 =305
                            //305 + 1^3 =305 +1 =306
}

 
}
}