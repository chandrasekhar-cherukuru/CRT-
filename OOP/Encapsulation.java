


// used to provide the private data to the other classes

// in this we have to write eery varibla using getters and setters methods


// BANK
class Account{

    private String name;
    private long acNo;
    private double balance;

    //name
    public void setName(String name){
        this.name = name;   
    }

    public String getName(){
        return name;
    }

    //account number
    public void setAccNo(double acNo){
        this.acNo = acNo;   
    }

    public double getAccNo(){
        return acNo;
    }

    //balance
    public void setAccBalance(double balance){
        this.balance = balance;   
    }

    public double getBalance(){
        return balance;
    }
}



// like UPI
public class Encapsulation {
    public static void main(String[] args) {
        
        Account ac = new Account();
        ac.setName("Chakri");
        System.out.println("Name is: " +ac.getName());
        ac.setbalance(1000);
        System.out.println("Balance is: " +ac.getBalance());
        ac.setAccNo(1002340);
        System.out.println("Balance is: " +ac.setAccBalance());


    }
}
