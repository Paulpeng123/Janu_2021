package com.pf.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set set = new HashSet<Integer>();
        set.add(123);
        set.add(122);
        set.add(123);

        System.out.println("set = " + set);
    }
}
