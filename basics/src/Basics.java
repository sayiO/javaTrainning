import java.util. *;
import java.lang. *;


public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string to process");
        String str2 = sc.nextLine();
        //countWords(str2);
        //wordBackward(str2);
        //addSpaces(str2);
        passWordChecker(str2);


    }

    public static void countWords(String text) {
        String[] str1 = text.split(" ");
        int numOfWords =  str1.length;
        System.out.println("the number of words in your string is: " + numOfWords);
        System.out.println("following are the words:");
        for(int i =0; i<numOfWords; i++){
            System.out.println(str1[i]);
        }

    }
    public static void wordBackward(String word){
        for(int i = word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }


    }
    public static void addSpaces(String text){
        StringBuilder  modifiedText = new StringBuilder(text);
        for(int i =0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;

            }
        }
        System.out.println(modifiedText);


    }


   public static void passWordChecker(String passWord){
        StringBuilder checkPass = new StringBuilder(passWord);
        for(int i=0; i<checkPass.length(); i++)
            if(checkPass.length() >= 8 && checkPass.charAt(i) >= 65 && checkPass.charAt(i) <=91){
                System.out.println("Password admitted");
                }
            else{
                System.out.println("enter correct password");
            }

            }
        }







