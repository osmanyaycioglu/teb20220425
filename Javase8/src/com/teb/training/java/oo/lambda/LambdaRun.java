package com.teb.training.java.oo.lambda;


public class LambdaRun {

    public static void main(final String[] args) {
        String str = "113";
        IExecute executeLoc = (u,
                               z) -> z + " sonuc : " + u;
        System.out.println(executeLoc.xyz(100,
                                          "toplama"));

        IRun runLoc = () -> {
            System.out.println("debug : runMe çalıştı");
            return Integer.parseInt(str);
        };
        System.out.println("sonuç : " + runLoc.runMe());
        // Method binding
        IExecute e2 = LambdaRun::abc;
        System.out.println(e2.xyz(25,
                                  "test"));

        LambdaRun l1 = new LambdaRun();
        IExecute e3 = l1::uvf;
        System.out.println(e3.xyz(25,
                                  "15 testi"));

    }

    public String uvf(final int intVal,
                      final String str) {
        if (intVal < 15) {
            return "15 dan küçük " + str;
        } else if (intVal > 15) {
            return "15 dan büyük " + str;
        } else {
            return "sayı 15 " + str;
        }
    }


    public static String abc(final int intVal,
                             final String str) {
        if (intVal < 10) {
            return "10 dan küçük " + str;
        } else if (intVal > 10) {
            return "10 dan büyük " + str;
        } else {
            return "sayı 10 " + str;
        }
    }
}
