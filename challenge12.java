import java.util.Arrays;

public class challenge12 {
    // Sum and Average of input array numbers Challenge 12
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};

        int sum = 0;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Length of Array: " + numbers.length);
        for (int x = 0; x < numbers.length;x++){
            sum += numbers[x];
            
        }
        float ave = sum/numbers.length;

        System.out.println("Sum is: " + sum);

        System.out.println("Average is: " + ave);


    }
}
