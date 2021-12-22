import java.util. *;
import java.lang. *;



public class Basics {
    public static void main(String[] args) {
        //basicsSyntax n1 = new basicsSyntax();
        //n1.numChecker(12, 36);
        //using a switch statement
        /*Scanner sc= new Scanner(System.in);
        System.out.println("enter your month");
        String  month  = sc.next();
        switch (month){
            case JANUARY, JUNE, JULY -> 3;
            case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
            case MARCH, MAY, APRIL, AUGUST -> 2;
            default -> 0;

        };
        //for loop
        for(int i = 1; i<= 10; i++){
            System.out.println("say i love you babes");
        }
        //while loop
        int i = 1;
        while(i<=5){
            System.out.println("i miss Simbie");
            i++;
        }
        // do-while loop
        int i = 0;
        do{
            System.out.println(i + " still less than 10");
            i++;
        }while(i<10);

         */
        HumanClass bee = new HumanClass();
        bee.age = 35;
        bee.gender = "Male";
        bee.name = "Onias Sayi Bee";
        bee.partner = "Simbisanai";
        bee.speak();
        bee.eat();
        bee.walk();

    }

}







