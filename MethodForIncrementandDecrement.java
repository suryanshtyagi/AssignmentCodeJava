public class MethodForIncrementandDecrement {
    public static void main(String[] args) {

        MethodForIncrementandDecrement opertar = new MethodForIncrementandDecrement();
        opertar.increment();
        opertar.decremement();


    }
     void increment(){
        int a  = 5;
        a++; // here "++" operator increment value of 5.
         System.out.println( a);

        ++a;  // here first value is increase then print.

         System.out.println(a);





     }

     void decremement(){
        int a = 10;
        a--; // here values of a is decresed by one;

         System.out.println(a);

         --a; // here value is first decrese then priny.
         System.out.println(a);

     }
}
