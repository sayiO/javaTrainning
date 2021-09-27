public class Basics {



    public static void main(String[]args){
       Account bee1 = new Account();
       bee1.insertDetails("Onias Sayi", 342657819, 400);
       bee1.displayInfo();
       bee1.balance();
       bee1.withdraw(175);
       bee1.balance();
       bee1.displayInfo();



    }
}
