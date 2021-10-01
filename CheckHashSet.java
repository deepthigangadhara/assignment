package com.company;
import java.util.Collection;
import java.util.*;
public class CheckHashSet {
    public static void main(String [] args){
        Set <Integer> s=new HashSet<>();
        s.add(1);
        s.add(3);
        s.add(4);
       System.out.println(s.contains(new Integer(3)));

    }
}
