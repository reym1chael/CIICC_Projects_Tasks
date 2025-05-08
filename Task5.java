import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //int[] numbers1 = new int[] {75,75,75};

        Scanner scanner = new Scanner(System.in);

        int numSize = 3; // INDEX SIZE

        int [] numbers1 = new int[numSize]; //ASSIGNED INDEX SIZE

        System.out.println("\n\nEnter 3 NUMBERS only.");

        for (int i = 0; i < numSize; i++) {
            if (i == 0){
                System.out.print("Enter the FIRST Number: ");
                numbers1[i] = scanner.nextInt();
            }
            if (i == 1){
                System.out.print("Enter the SECOND Number: ");
                numbers1[i] = scanner.nextInt();
            }
            if (i == 2){
                System.out.print("Enter the THIRD Number: ");
                numbers1[i] = scanner.nextInt();
            }   
        }

        scanner.close();

        Arrays.sort(numbers1); // SORTS IN ASCENDING ORDER

        if ((numbers1[0] == numbers1[1]) && (numbers1[1] == numbers1[2]) ){ // CHECKS IF ALL NUMBERS HERE ARE EQUAL
            System.out.println("All numbers are equal.");
        }
        else {
            System.out.println("Largest number is: " + numbers1[2]); // GETS THE NUMBER FROM LAST INDEX FROM SORTED ARRAY
        };
        
        
        

}
}
