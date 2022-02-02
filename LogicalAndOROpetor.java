public class LogicalAndOROpetor {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 5;

        if(a == b && b==c){ // --Here "&&" opertor is "AND" opertor (if both condition is true then condtion is true)
            System.out.println(" i am in and opertor");
        }
        if(a==b || b==c){ //--Here "||" opertor is "OR"opertor(if one of them condition is true then loop is run
            System.out.println(" i m in or opertor");
        }

    }
}
