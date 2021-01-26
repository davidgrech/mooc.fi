
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        Account mattsAccount = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0.0);
        
        mattsAccount.withdrawal(100.0);
        
        myAccount.deposit(100.0);
        
        System.out.println(mattsAccount.toString());
        System.out.println(myAccount.toString());
        
    }
}
