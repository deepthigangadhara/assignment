package com.company;
import java.util.Collection;
import java.util.*;
public class CheckArrayList {
    public static void main(String [] args){
        List l=new ArrayList();
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        if(l.contains(5))
            System.out.println("5 exists in ArrayList");
        else
            System.out.println("5 does not exists in ArrayList");
        if(l.contains(6))
            System.out.println("6 exists in ArrayList");
        else
            System.out.println("6 does not exists in ArrayList");
    }

}
