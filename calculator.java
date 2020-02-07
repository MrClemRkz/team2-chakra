// this will be the main class file

// TODO: will have seperate classes for each functionality.

import java.util.Scanner;

class Add
{
    public static void main(String arg[])

    {

        int n;double res=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number you want to calc");

        int sum = 0;
        while (sc.hasNext()){
            sum += sc.nextInt();
            System.out.println("Sum = :" + sum);
        }
        System.out.println("Sum of numbers= :"+sum);

    }

}