package file1;

import file0.Calculator;

public class CheckException {
    public static void main(String[] args){
        //1) Make your own Exception implementation. Use it in your CalcApp

        Calculator.divide(3, 0);
    }
}
