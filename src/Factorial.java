public class Factorial {
    public static void main(String... args){
       int n,fact=1;
       int number = 20;
       for (n = 1; n<= number; n++ ){
           fact = fact * n;
       }
        System.out.printf("The factorial is%d%n", fact);
    }
}
