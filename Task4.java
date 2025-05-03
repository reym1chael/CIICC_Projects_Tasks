import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a WORD: ");
        Scanner input1 =  new Scanner(System.in);
        String input = input1.nextLine();
        
        StringBuilder sb1 = new StringBuilder(input);
        sb1.reverse();

        //System.out.println(input.equals(sb1.toString())); //check if input is palindrome is true or false
        
        if (input.equalsIgnoreCase(sb1.toString())){    //ignoring case sensitivity
            System.out.println("The input string is a palindrome");
        }
        else {
            System.out.println("The input string is not a palindrome");
        }
        
        System.out.println("The input is: " + input);
        System.out.println("The reverse is: " + sb1);

        
    }
}