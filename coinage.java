public class coinage {

    private Person person;
    private int walletAddress;
    private float tokenQty;
    private float rate = tokenQty * 0.45f;
    private float tokenMktVal;
    private boolean isActive;

    public coinage(Person person, int walletAddress, float tokenQty, float rate ,float tokenMktVal, boolean isActive){
        this.person = person;
        this.walletAddress = walletAddress;
        this.tokenQty = tokenQty;
        this.rate = rate;
        this.tokenMktVal = tokenMktVal;
        this.isActive = isActive;
    }

    public Person getPerson() {
        return person;
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

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getTokenMktVal() {
        return tokenMktVal;
    }

    public void setTokenMktVal(float tokenMktVal) {
        this.tokenMktVal = tokenMktVal;
    }

    public boolean isIsActive() {
        return this.isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // to string

    public String toString() {
        return "{" +
            " person='" + getPerson() + "'" +
            ", walletAddress='" + getWalletAddress() + "'" +
            ", tokenQty='" + getTokenQty() + "'" +
            ", rate='" + getRate() + "'" +
            ", tokenMktVal='" + getTokenMktVal() + "'" +
            ", isActive='" + isIsActive() + "'" +
            "}";
    }


    // psvm1
  
}
