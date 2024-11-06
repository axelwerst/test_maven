package com.gmail.axelwerst;

public class Wagen {
    private int bakReal;

    public Wagen(int bakReal) {
        this.bakReal = bakReal;
    }

    public float probeg() {
        if (this.bakReal <= 0) {
            System.out.println("їхати не можна");
            return 0;
        }
        if (this.bakReal <= 7) {
            System.out.println("треба на заправку");
        }
        if (this.bakReal > 50) {
            System.out.println("паливо льється через край");
        }
        int ras = 7;
        float kmLeft = (float) this.bakReal / ras * 100;
        return kmLeft;
    }
    public float BAK() {
        if (this.bakReal <= 0) {
            System.out.println("їхати не можна");
            return 0;
        }
        int bakMax = 50;
        float bak = (float) this.bakReal / bakMax * 100;
        return bak;
    }

}