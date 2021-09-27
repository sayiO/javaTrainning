public class factorialClass {
    void fact(int num){
        int fact=1;
        for(int i =1; i<=num; i++){
            fact = fact * i;
            System.out.println(fact);
        }
        System.out.println("factorial of number " + num + " is " + fact);

    }

}
