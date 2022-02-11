package file0;

public class Calculator {
    public static void main(String[] args){
        int a = 5;
        int b = 6;

        System.out.println(plus(a,b));
        System.out.println(minus(a,b));
        System.out.println(divide(a,b));
        System.out.println(multiplying(a,b));
    }

    private static int plus(int a, int b) {

        return a + b;
    }
    private static int minus(int a, int b) {


        return a - b;
    }
    private static int divide(int a, int b) {

        return a / b;
    }
    private static int multiplying(int a, int b) {

        return a * b;
    }
}
