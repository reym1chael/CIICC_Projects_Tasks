class ArithmeticTask {

    public static void main (String[] args){
        /*  ORIGINAL CODE
        int result = 1 + 2; // result is now 3 DONE
        System.out.println(result);

        result = result - 1; // result is now 2 DONE
        System.out.println(result);

        result = result * 2; // result is now 4 DONE 
        System.out.println(result);

        result = result / 2; // result is now 2 DONE
        System.out.println(result);

        result = result + 8; // result is now 10 DONE
        result = result % 7; // result is now 3 d
        System.out.println(result);

        OROGINAL CODE*/ 

        //START OF MY CODE
        int result = 1; 
        result += 2;
        System.out.println(result); // result is now 3

        result -= 1; 
        System.out.println(result); // result is now 2

        result *= 2; 
        System.out.println(result); // result is now 4

        result /= 2; 
        System.out.println(result); // result is now 2
 
        result += 8; 
        //System.out.println(result);  result is now 10
        result %= 7; 
        System.out.println(result); // result is now 3

    }
}