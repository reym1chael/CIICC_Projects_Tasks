class loopTasks {
    public static void main(String[] args) {
        int check_number = 10;
        int i = 0;
        String message;
        System.out.println("");
        System.out.println("");
        System.out.println("USING WHILE LOOP:");
        while (i <= check_number){
            message = (i%2==0) ? i+" is even": i+" is odd";
            i++;
            System.out.println(message);
        }

        i = 0;

        System.out.println("");
        System.out.println("");
        System.out.println("USING FOR LOOP:");

        for (int x = 0; x <= check_number; x++){
            message = (x%2==0) ? x+" is even": x+" is odd";
            System.out.println(message);
        }
    }
}
