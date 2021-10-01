package com.company;
import java.util.Collection;
import java.util.*;
public class Convert {
    public static void main(String [] args){
        List <String>l=new ArrayList<>();
        l.add("Hi");
        l.add("hello");
        System.out.println(l);

        String[] a=new String[l.size()];
        a=l.toArray(a);
        for(String s:a)
            System.out.println(s);
    }
}
