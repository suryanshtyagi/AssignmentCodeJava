public class EqualAndnotEqual {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 5;

        if(a==b){// here "==" opertor check the index of both number
            System.out.print("A is equals to the b--");
            System.out.println(true);
        }
        if(b==c){
            System.out.print("b is equals to the c--");
            System.out.println(true);
        }
        else{
            System.out.print("b is  equals to the c--");
            System.out.println(false);
        }

    }
}
