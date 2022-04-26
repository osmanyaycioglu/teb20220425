package com.teb.training.java.oo.lambda.soldier;

import java.security.SecureRandom;
import java.util.Random;

public class SharpShooter extends Soldier {

    @Override
    public void shoot() {
        Random random = new SecureRandom();
        int nextIntLoc = random.nextInt(10);
        if (nextIntLoc < 8) {
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }
}
