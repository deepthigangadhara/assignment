package com.company;
import java.util.Collection;
import java.util.*;
public class LenOfArrayList {
    public static void main(String [] args){
        List l=new ArrayList();
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("Length of ArrayList is: "+l.size());
        l.remove(3);
        System.out.println("After removing Length of ArrayList is: "+l.size());
    }
}
