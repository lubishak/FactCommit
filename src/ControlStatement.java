public class ControlStatement {
    public static void main(String... args){



//        for(int counter = 1; counter <= 10; counter++ ){
  //          System.out.println(counter);
    //    }

//        int counter = 0;
//        while(counter<=10){
//            System.out.println(counter);
//            counter++;
//        }
//

    int product= 1;
    for(int count = 2; count<=15; count++){
     if(count%2!=0) {
         product = count * product;

     }
}
        System.out.printf("the product of odd numbers is %d%n", product);

    int prod2= 1;
    for(int number = 1; number <= 15; number += 2){

        prod2 = prod2 * number;
    }
        System.out.printf("The product of odd numbers from 1 to 15: %d%n ", prod2);
    }
}


