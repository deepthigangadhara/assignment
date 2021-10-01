package com.company;
import java.util.Collection;
import java.util.*;
public class CheckHashSet {
    public static void main(String [] args){
        Set <Integer> s=new HashSet<>();
        s.add(1);
        s.add(3);
        s.add(4);
        if(s.contains(3))
            System.out.println("3 is exists in HashSet");
        else
            System.out.println("3 does not exists in HashSet");


    }
}
