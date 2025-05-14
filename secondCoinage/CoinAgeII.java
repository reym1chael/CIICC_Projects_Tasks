/*
 * THIS APP IS A MODIFIED VERSION OF COINAGE JAVA
 * IT ALLOWS USER TO INPUT THEIR WALET ADDRESS AS ACCOUNT NUMBER AND A PASSOWRD
 * THAT IS PRESET OR HARD CODED
 * 
 */

package secondCoinage;

import java.util.Scanner;

public class CoinAgeII {
    private PersonDetails person;
    private int walletAddress;
    private float tokenQty;
    private float rate = 0.45f;
    private float tokenMktVal;
    private boolean isActive;

    public CoinAgeII(PersonDetails person, int walletAddress, float tokenQty, boolean isActive){
        this.person = person;
        this.walletAddress = walletAddress;
        this.tokenQty = tokenQty;
        this.isActive = isActive;
    }

    public PersonDetails getPerson() {
        return this.person;
        
    }

    public void setPerson(PersonDetails person) {
        this.person = person;
    }

    public int getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(int walletAddress) {
        this.walletAddress = walletAddress;
    }

    public float getTokenQty() {
        return tokenQty;
    }

    public void setTokenQty(float tokenQty) {
        this.tokenQty = tokenQty;
    }

    public void setRate(float rate) {
        
    }

    public float getRate() {
        return rate;
    }

    public void setTokenMktVal(float tokenMktVal1) {
        this.tokenMktVal = tokenMktVal1;
    }

    public float getTokenMktVal() {
        return getTokenQty() * getRate();
    }

    
    public boolean isIsActive() {
        return this.isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // to string

    public String toString() {
        return
            "\nPerson: \t\t" + getPerson().toString() + "" + 
            "\nWalletAddress: \t\t" + getWalletAddress() + "" +           //2
            "\nTokens: \t\t" + getTokenQty() + " CNG" +                   //3
            "\nExchange Rate: \t\t" + "1 CNG = " + getRate() + " PHP" +   //4  
            "\nMarket Value: \t\t" + getTokenMktVal() + " PHP" +          //5
            "\nActive Account: \t" + isIsActive() + "" +                  //6
            "\n";
    }

    public static void main(String[] args) {

        // user list
        CoinAgeII user1 = new CoinAgeII(
                            new PersonDetails("John", "Reyes", "jreyes@sample.com", "456"), 
                                123 , 800_000, true );
        CoinAgeII user2 = new CoinAgeII(
                            new PersonDetails("Adam", "James", "ajames@sample.com", "samplepass"), //check pass length in sout
                            124 , 20_000, true );

        Scanner userinput = new Scanner(System.in);

        String userEmail;
        String userAccNum;
        String userAccPas;

        System.out.print("\n\nEnter the email adderss: ");
        userEmail = userinput.nextLine().toString();

        System.out.print("Enter the account number: ");
        userAccNum = userinput.nextLine().toString();

        System.out.print("Enter the account password: ");
        userAccPas = userinput.nextLine().toString();

        if (userEmail.equals("jreyes@sample.com") && userAccNum.equals("123") && userAccPas.equals("456")){
            System.out.println(user1);
        }
        else if (userEmail.equals("ajames@sample.com") && userAccNum.equals("124") && userAccPas.equals("samplepass")){
            System.out.println(user2);
        }
        else {
            System.out.println("\nAPP ERROR: No such account. ");
            System.out.println("App exiting... \n");
        }

        userinput.close();
        
    }
  
}

class PersonDetails {
    
    private String firstName; 
    private String lastName;
    private String email;
    private String password;

    public PersonDetails(String firstName, String lastName, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;    
        this.password = password;
    }
    
    // to string
    @Override
    public String toString() {
        return firstName + " " + lastName + 
        "\nEmail Address:\t\t" + email +
        "\nPassword: \t\t" + "[" + "*".repeat(password.length()) + "]";
    }
    
}
