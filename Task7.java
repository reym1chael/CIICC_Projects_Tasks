
// INSTRUCTIONS: Create a program where user inputs two numbers and perform 4 basic
//               operations using 4 methods with return types and print the results

import java.util.Scanner;

public class Task7{

    int addition(int a, int b){
        return a + b;
    }

    int subtraction(int a, int b){
        return (a - b);
    }

    int multiplication(int a, int b){
        return (a * b);
    }

    double division(double a, double b){
        return (double) a / b;
    }

    public static void main(String[] args) {

        int firstNum;
        int secondNum;

        Task7 ans = new Task7();

        System.out.print("Input first number: ");
        Scanner scanner = new Scanner(System.in);
        firstNum = scanner.nextInt();

        System.out.print("Input first number: ");
        secondNum = scanner.nextInt();


        int ans1 = ans.addition(firstNum, secondNum);
        int ans2 = ans.subtraction(firstNum, secondNum);
        int ans3 = ans.multiplication(firstNum, secondNum);
        double ans4 = ans.division(firstNum, secondNum);

        System.out.println("OUTPUTS: ");
        System.out.println("Operation 1 = Addition:\t" + ans1);
        System.out.println("Operation 2 = Subtraction:\t" + ans2);
        System.out.println("Operation 3 = Multiplication:\t" + ans3);
        System.out.println("Operation 4 = Division:\t" + ans4);

    }
}