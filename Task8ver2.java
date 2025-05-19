public class Task8ver2 {
    public int sumOfAllParameters1 (int...x){
        System.out.println("Version 2.");
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
            System.out.println("Sum for Parameter: [" + x[a]+"]");
            int sum2 = 0;
            for (b = 1; b <= x[a]; b++){
                System.out.print(b);
                if (b != x[a]){
                    System.out.print("+");
                }
                sum2 += b;
            }
            System.out.print("=" + sum2);
            System.out.println("\n");
            sum += sum2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task8ver2 objTask8ver2 = new Task8ver2();
        System.out.println("Sum of all (cummulative) parameters : " + objTask8ver2.sumOfAllParameters1(4, 5, 10, 11));

    }
}
