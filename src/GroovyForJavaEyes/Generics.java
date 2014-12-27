package GroovyForJavaEyes;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
//        list.add(2.0);//won't compile
//        list.add("hello");//won't compile
        System.out.println("List populated");
        for (int element : list) {
            System.out.println(element);
        }
    }

}