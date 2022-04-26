package com.teb.training.java.oo.lambda.soldier;

import java.security.SecureRandom;
import java.util.Random;

public class Soldier {

    public void shoot() {
        Random random = new SecureRandom();
        int nextIntLoc = random.nextInt();
        if (nextIntLoc < 2000) {
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }

}
