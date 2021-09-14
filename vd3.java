package anhphuc.DeQuy;

import java.util.Scanner;

public class vd3 {
    public static void main(String[] args) {
        int num1, num2;


        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        num1 = keyboard.nextInt();


        System.out.print("Enter another integer: ");
        num2 = keyboard.nextInt();


        System.out.println("The greatest common divisor " +
                "of these two numbers is " +
                gcd(num1, num2));
    }


    public static int gcd(int x, int y)
    {
        if (x % y == 0)
            return y;
        else
            return gcd(y, x % y);
    }

    }

