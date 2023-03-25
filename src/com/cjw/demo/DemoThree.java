package com.cjw.demo;

import java.util.*;

public class DemoThree {

    public static void main(String[] args) {


        List<String> list= new ArrayList<>();
        list.add("c");
        list.add("1");
        list.add("2");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){

            String next = iterator.next();
             if(next!=null&&next.equals("c")){
                    iterator.remove();
             }

        }

        for (String s : list) {
            System.out.println(s);
        }

    }


    public static void test(int a,String... ar){
       List<String> list= new ArrayList<>();

       var i = 1;
        for (String s : ar) {
            System.out.println(s);
        }
    }

}
