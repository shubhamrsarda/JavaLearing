package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurentModification {

    public static void main(String[] args) {


       // List<Integer> integerList = new ArrayList<>();
        CopyOnWriteArrayList<Integer> integerList = new CopyOnWriteArrayList<>();
        integerList.add(1);
        integerList.add(15);
        integerList.add(16);
        integerList.add(14);
        integerList.add(18);
        integerList.add(19);

        Iterator<Integer> list = integerList.iterator();

        while (list.hasNext()){
            Integer intval = list.next();
            System.out.println("Interger : " + intval);
            if(list.next().equals(15)){
                System.out.println("equals to 15");
                integerList.remove(intval); // trying to remove element gives exception

                //list.remove(); // removing using iterator for single threaded
            }
        }
    }
}
