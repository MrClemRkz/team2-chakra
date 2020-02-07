// this will be the main class file

// TODO: will have seperate classes for each functionality.

import java.util.Scanner;

class Add
{
    public static void main(String arg[])

    {
        int n;
     
        Scanner sc=new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("Enter ctrl + D twice to get the answer (on unix environment)");
        System.out.println("------------------------------------------------------------");
        System.out.print("Enter numbers seperated by space, you want to add: ");

        int sum = 0;
        do {
            sum += sc.nextInt();
        } while (sc.hasNext());
        System.out.println("\n\nSum of numbers= :"+sum);

    }

}