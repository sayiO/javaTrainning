import java.util. *;
import java.lang. *;



public class Basics {
    public static void main(String[] args) {
        //basicsSyntax n1 = new basicsSyntax();
        //n1.numChecker(12, 36);
        //using a switch statement
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your animal");
        String  animal  = sc.next();
        switch (animal.toUpperCase()){
            case "DOGS":
                System.out.println("domestic animal");
                break;
            case "CAT":
                System.out.println("it is a domestic animal");
                break;
            case "TIGER":
                System.out.println("it is a wild animal");
                break;
            default:
                System.out.println("unknown animal");
                break;


        }



    }


        }







