public class Account {
    String name;
    int acc_no;
    float amount;

    void insertDetails(String name, int acc_no, float amount){
        this.name = name;
        this.acc_no = acc_no;
        this.amount = amount;

    }

    void deposit(float amt){
        amount = amount + amt;
        System.out.println("amount deposited is " + amt);
    }

    void withdraw(float amnt){
        if(amnt > amount){
            System.out.println("insufficient balance");
        }
        else{
            amount = amount- amnt;
            System.out.println("Amount withdrawn is " + amnt);
        }
    }
    void balance(){
        System.out.println("balance is "  + amount);

    }
    void displayInfo(){
        System.out.println("account name is " + name + " with account number " + acc_no + " and its balance is " + amount);
    }


}
