public class Devs extends HumanClass implements langCodable{
    int numDevs;
    String devName;
    String langName;

    public void devCoding(){
        System.out.println("our devs be coding nice and eligible programs...!!!");

    }

    @Override
    public void codingLang() {
        System.out.println("My name is " + devName + ", i program in " + langName);
    }

    @Override
    public void favStack() {
        System.out.println("My favorite stack is Java, SpringBoot and SQL based databases");

    }
}

