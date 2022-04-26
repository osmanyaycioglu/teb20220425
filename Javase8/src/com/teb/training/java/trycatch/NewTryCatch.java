package com.teb.training.java.trycatch;

import java.util.Scanner;

public class NewTryCatch {

    public static void main(final String[] args) {
        //        Scanner sc = null;
        //        try {
        //            sc = new Scanner(System.in);
        //        } catch (Exception eLoc) {
        //            System.out.println("Error");
        //        } finally {
        //            if (sc != null) {
        //                sc.close();
        //            }
        //        }

        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("adınızı girin : ");
            String nextLineLoc = sc.nextLine();
            System.out.println("Adınız : " + nextLineLoc);

        } catch (NullPointerException | IllegalStateException eLoc) {
            System.out.println("Error");
        } catch (Exception eLoc) {
            System.out.println("General Error");
        }


    }
}
