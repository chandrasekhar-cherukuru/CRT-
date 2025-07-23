

// by using private modifier we can implement data hiding concept

// getter and setter


class Account{
   private double balance = 1000;
   
}

public class DataHiding {
    public static void main(String[] args) {
        
        Account ac = new Account();
        System.out.println(ac.balance); //Add a getter method: (Encapsulation.java)
    }
}
