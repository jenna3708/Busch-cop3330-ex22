import java.util.Scanner;

public class exercise22{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        String num1 = input.next();
        int convNum1 = Integer.parseInt(num1);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second number:");
        String num2 = input2.next();
        int convNum2 = Integer.parseInt(num2);

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the third number:");
        String num3 = input3.next();
        int convNum3 = Integer.parseInt(num3);

        if(convNum1 == convNum2 && convNum2 == convNum3)
        {
            System.out.println("All the numbers entered are the same.");
            return;
        }

        if( convNum1 >= convNum2 && convNum1 >= convNum3) {
            System.out.println("The largest number is " + convNum1 + ".");
        }
        else if (convNum2 >= convNum1 && convNum2 >= convNum3) {
            System.out.println("The largest number is " + convNum2 + ".");
        }
        else {
            System.out.println("The largest number is " + convNum3 + ".");
        }

    }
}
