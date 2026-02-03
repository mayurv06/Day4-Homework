class Bank{
    private double balance;


    public double getbalance(){
        return balance;
    }

    public void setbalance(double balance){
        this.balance=balance;
    }



    void deposit(double a){
        balance = balance +a;
        System.out.println("deposited: "+a);

    }

    void withdraw(double b){
        balance=balance-b;
        System.out.println("withdraw: "+b);

    }

    void balance(){
        
        System.out.println("balance is "+balance );
    }
}


public class code11 {
    public static void main(String[] args) {
        Bank bn = new Bank();
        bn.deposit(100);
        bn.withdraw(50);
        bn.balance();

        


    }
    
}