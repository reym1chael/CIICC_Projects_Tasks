import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // check kung gumana
        Scanner scanner = new Scanner(System.in);
        //Integer [] numbers = {3, 2, 1};
        int [] numbers = {3, 2, 1};
        System.out.println(numbers[2]);
        //Arrays.sort(numbers, Collections.reverseOrder());
        Collections.sort(Arrays.asList(numbers), Collections.reverseOrder());
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + "");
        }
        ArrayList<Integer> numbers3 = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break; 
            }
            numbers3.add(input);
        }
    }
}
