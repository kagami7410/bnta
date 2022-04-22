package com.bnta;
import com.bnta.farm.Farm;
import com.bnta.farm.animals.Horse;
import com.bnta.farm.animals.Pig;

public class Main {
    public static void main(String[] args) {

        Farm farm1 = new Farm("Happy hills farm", 234.43);
        Farm farm2 = new Farm("Londis farm", 343.43);
        Farm farm3 = new Farm("Great farm", 322.45);

        farm1.addPig(new Pig("Peppa", 4, 7.32));

        farm2.addHorse(new Horse("mr.Fast", 5, 3.2));



        System.out.println(farm1);
        System.out.println(farm2);


        // to check for the value equality, use equal method().
        // This will only work if you implement the toStirng(), equals(), hashCode() medthods.



    }
}
