
// INSTRUCTIONS: Write a program featureing an integer variable arguments methods.
//               The method should return the sum of all parameters and, for each parameter,
//               the commulative sum up to that point. For instance, given parameters (4, 5, 10),
//               the program should compute the total for the first parameter, such as 4 = (1+2+3+4),
//               and repeat this process for subsequent parameters.

public class Task8 {

    public int sumOfAllParameters (int...x){
        
        //System.out.println("Parameters: " + x[0] + ", " + x[1] + ", " + x[2]); // how to add all indexes that depends on the input in main method without manual input
        
        int a = 0;
        int b = 0;
        int sum = 0;
        System.out.print("\nParameters: ");
        for (a = 0; a < x.length; a++){
            System.out.print("["+x[a]+"] ");
        }
        System.out.println("\n");
        for (a = 0; a < x.length; a++){
            System.out.println("Parameter: [" + x[a]+"]");
            int sum2 = 0;
            for (b = 1; b <= x[a]; b++){
                System.out.println("Subsequent values of parameter [" + x[a] + "]: " + b);
                sum2 += b;
            }
            System.out.println("Sum of subsequent values: " + sum2);
            System.out.println("\n");
            sum += sum2;
        }
        return sum;
    }

    public static void main(String[] args) {

        Task8 objTask8 = new Task8();
        System.out.println("Sum of all (cummulative) parameters : " + objTask8.sumOfAllParameters(1,2,3));

    }

}
