package com.gmail.axelwerst;

import java.time.LocalDate;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "С початку потрібно зібрати інформацію про автівку" );
        System.out.println("скільки палива у баці?");
        Scanner scanner = new Scanner(System.in);
        float bakR = 35; //scanner.nextFloat();
        System.out.println("Введіть дату проходження техогляду рік + місяц + день");
        LocalDate tuv = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        LocalDate tuvNew = tuv.plusYears(2);
        LocalDate ld = LocalDate.now();
        if (ld.isAfter(tuvNew)){
        System.out.println("їхати не можна, треба пройти техогляд");
}
        System.out.println("наступний техогляд " +tuvNew);



//        float bak = Wagen.BAK(bakR);
//        float kmLeft = Wagen.probeg(bakR);
//        System.out.println("бак повен на "+bak+" %");
//        System.out.println("ще можно проїхати " +kmLeft+ " кілометрів");
    }
}
