import static java.lang.Math.*;

public class Task9 {
    
    public static int add (int a, int b){
        return addExact(a, b);
    }

    public static int subtract (int a, int b){
        return subtractExact(a, b);
    }

    public static int multiply (int a, int b){
        return multiplyExact(a, b);
    }

    public static float divide (int a, int b){
        return floorDiv(a, b);
    }

    public static float divide2 (float a, float b){
        return (float) a / b;
    }

    public static void main(String[] args) {

        System.out.println("\nOperation\t\tNumbers\t\tResult"+"\t\tRemarks");

        int addNum1 = 8; // ADDITION
        int addNum2 = 4;
        System.out.println("Addition:\t\t" + addNum1 +", "+ addNum2 + "\t\t" + add(addNum1, addNum2) + "\t\tN/A");

        int subNum1 = 29;
        int subNum2 = 3;
        System.out.println("Subtraction:\t\t" + subNum1 +", "+ subNum2 + "\t\t" + subtract(subNum1, subNum2) + "\t\tN/A");

        int mulNum1 = 30;
        int mulNum2 = 8;
        System.out.println("Multiplication:\t\t" + mulNum1 +", "+ mulNum2 + "\t\t" + multiply(mulNum1, mulNum2) + "\t\tN/A");

        int divNum1 = 20;
        int divNum2 = 17;
        System.out.println("Division(INT):\t\t" + divNum1 +", "+ divNum2 + "\t\t" + divide(divNum1, divNum2) + "\t\tAs per documentation, Math.floordiv returns to the nearest INT not double or float.");

        float x = 10.5f;
        float y = 2.2f;
        System.out.println("Division(FLOAT):\t" + x +", "+ y + "\t" + divide2(x, y) + "\tPerformed manual division.");

    }
}
