public class coinage {

    private Person person;
    private int walletAddress;
    private float tokenQty;
    private float rate = 0.45f;
    private float tokenMktVal;
    private boolean isActive;

    public coinage(Person person, int walletAddress, float tokenQty, boolean isActive){
        this.person = person;
        this.walletAddress = walletAddress;
        this.tokenQty = tokenQty;
        this.isActive = isActive;
    }

    public Person getPerson() {
        return this.person;
        
    }

    public void setPerson(Person person) {
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
            "\nWalletAddress: \t\t'" + getWalletAddress() + "'" +   //2
            "\nTokens: \t\t'" + getTokenQty() + "'" +               //3
            "\nExchange Rate: \t\t'" + getRate() + "'" +            //4  
            "\nMarket Value: \t\t'" + getTokenMktVal() + "'" +      //5
            "\nActive Account: \t'" + isIsActive() + "'"            //6
            ;
    }


    public static void main(String[] args) {
        //Person p1 = new Person("John", "Reyes", "jreyes@sample.com");
        coinage user1 = new coinage(new Person("John", "Reyes", "jreyes@sample.com"), 123 , 22, true);
        coinage user2 = new coinage(new Person("Adam", "James", "ajames@sample.com"), 124 , 20_000, true);
        System.out.println(user1);
        System.out.println(user2);
        //System.out.println(p1);
        
        
    }
  
}

class Person {
    
    private String firstName; 
    private String lastName;
    private String email;

    public Person(String firstName,String lastName,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;    
    }
    

    // Override toString() method
    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + email + ")";

    }
}
