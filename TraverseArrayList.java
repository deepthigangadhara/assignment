package com.company;
import java.util.Collection;
import java.util.*;

public class TraverseArrayList {

    public static void main(String[] args) {
	// write your code here
        Collection values=new ArrayList();
        values.add(2);
        values.add(5);
        values.add(4);
        values.add(6);
        values.add(1);
        Iterator i=values.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
