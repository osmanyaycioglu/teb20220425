package com.teb.training.java.oo.lambda.soldier;

import java.security.SecureRandom;
import java.util.Random;

public class SoldierRun {

    public static void main(final String[] args) {
        Soldier soldierLoc = new SharpShooter();
        soldierLoc.shoot();
        System.out.println("-------------------");
        GenericSoldier g = new GenericSoldier(() -> true);
        g.shoot();
        System.out.println("-------------------");
        GenericSoldier g2 = new GenericSoldier(() -> false);
        g2.shoot();
        System.out.println("-------------------");
        GenericSoldier g3 = new GenericSoldier(() -> {
            Random random = new SecureRandom();
            int nextIntLoc = random.nextInt(10);
            return nextIntLoc < 8;
        });
        g3.shoot();

    }
}
