import java.util. *;
import java.lang. *;



public class Basics {
    public static void main(String[] args) {
        //basicsSyntax n1 = new basicsSyntax();
        //n1.numChecker(12, 36);
        //using a switch statement
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        switch (num){
            case 0:
                System.out.println("number is equal to 0");
                break;
            case 1:
                System.out.println("number is equal to 1");
                break;
            default:
                System.out.println("number is either negative or, higher than 1");
                break;
        }



    }


        }







