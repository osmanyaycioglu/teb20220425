package com.teb.training.java.oo.lambda.soldier;

public class GenericSoldier extends Soldier {

    private final IShoot shoot;

    public GenericSoldier(final IShoot shootParam) {
        super();
        this.shoot = shootParam;
    }

    @Override
    public void shoot() {
        if (this.shoot.shoot()) {
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }

}
