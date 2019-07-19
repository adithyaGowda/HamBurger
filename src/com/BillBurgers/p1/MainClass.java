package com.BillBurgers.p1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scn1 = new Scanner(System.in);

        System.out.println("Select the type of Burger");
        System.out.println("press 1 for BasicHamburger");
        System.out.println("press 2 for HealthyHamburger");
        System.out.println("press 3 for DeluxeHamburger");

        int x = scn1.nextInt();

        if(x==1){
            System.out.println("give inputs");
            String name=scn1.next();
            String meat=scn1.next();
            String roll=scn1.next();
            double price=scn1.nextDouble();

            Hamburger hamburger = new Hamburger(name, price, meat,roll);

        }

        if(x==2){
            System.out.println("give inputs");
            String name=scn1.next();
            String meat=scn1.next();
            String roll=scn1.next();
            double price=scn1.nextDouble();

            Hamburger hamburger = new HealthyaBurger(name, price, meat,roll);

        }

        if(x==3){
            System.out.println("give inputs");
            String name=scn1.next();
            String meat=scn1.next();
            String roll=scn1.next();
            double price=scn1.nextDouble();

            Hamburger hamburger = new DeluxeHamburger(name, price, meat,roll);

        }



    }
}
