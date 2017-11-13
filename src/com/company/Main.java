package com.company;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(6);
        list.add(3,10);

        list.remove(2);
        for (int i = 0; i < list.size; i++) {
            System.out.println(String.format(Locale.CHINA,"%d : %d",i,list.get(i)));
        }


        SingleLink<Integer> singleLink = new SingleLink<>();
        singleLink.add(1);
        singleLink.add(4);
        singleLink.add(2);
        singleLink.add(6);
        singleLink.add(1,10);
        for (int i = 0; i < singleLink.size; i++) {
            System.out.println(String.format(Locale.CHINA,"%d : %d",i,singleLink.get(i)));
        }
        singleLink.remove(4);
        singleLink.set(3,15);
        for (int i = 0; i < singleLink.size; i++) {
            System.out.println(String.format(Locale.CHINA,"%d : %d",i,singleLink.get(i)));
        }
    }
}
