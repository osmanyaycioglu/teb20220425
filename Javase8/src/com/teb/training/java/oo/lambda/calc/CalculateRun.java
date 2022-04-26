package com.teb.training.java.oo.lambda.calc;


public class CalculateRun {

    public static void main(final String[] args) {
        ICalculate toplama = (a,
                              b) -> a + b;
        ICalculate cikarma = (a,
                              b) -> a - b;
        ICalculate carpma = (a,
                             b) -> a * b;

        ICalculate bolme = (a,
                            b) -> {
            if (b == 0D) {
                return 0D;
            }
            return a / b;
        };
        System.out.println(toplama.calculate(10,
                                             20));
        System.out.println(cikarma.calculate(20,
                                             10));
        System.out.println(carpma.calculate(20,
                                            10));
        System.out.println(bolme.calculate(20,
                                           10));
        System.out.println(bolme.calculate(20,
                                           0));
    }
}
