
// INSTRUCTIONS: Write a program featureing an integer variable arguments methods.
//               The method should return the sum of all parameters and, for each parameter,
//               the commulative sum up to that point. For instance, given parameters (4, 5, 10),
//               the program should compute the total for the first parameter, such as 4 = (1+2+3+4),
//               and repeat this process for subsequent parameters.

public class Task8 {

    public int sumOfAllParameters (int...x){
        

        System.out.println(x[0] + ", " + x[1] + ", " + x[2] + ", " + x[x.length - 1]);



        // this is just the sum of all parameters
        int sum = 0;
        for (int num: x){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task8 objTask8 = new Task8();
        System.out.println(objTask8.sumOfAllParameters(4,5,10));
    }

}
