package com.gmail.axelwerst;

public class Wagen {


public static float probeg (float bakR){
   if (bakR <= 0) {
       System.out.println("їхати не можна");
       return 0;
   }
       if (bakR <= 7){
       System.out.println("треба на заправку");
   }
   if (bakR>50){
       System.out.println("паливо льється через край");
   }
    int ras =7;
    float kmLeft =(float) bakR/ras * 100;
    return  kmLeft;
}
public static float BAK (float bakR) {
    if (bakR <= 0) {
        System.out.println("їхати не можна");
        return 0;
    }
    int bakMax = 50;
    float bak = (float) bakR /bakMax*100;
    return  bak;
}
}
