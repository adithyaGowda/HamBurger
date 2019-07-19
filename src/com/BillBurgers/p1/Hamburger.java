package com.BillBurgers.p1;

import java.util.List;
import java.util.Scanner;

public class Hamburger extends Menu{


    String meat;
    String rollType;

    public Hamburger(String name, double price, String meat, String rollType) {
        super(name,price);
        this.rollType = rollType;
        this.meat = meat;


    }


}
