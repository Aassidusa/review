package com.cjw.demo;

public class DemoOne {

    public static void main(String[] args) {

        System.out.println(1+2+"3");
        System.out.println("1"+2+3);
        System.out.println("1"+(2+3));


        char A = 'a';
        switch (A) {
            case 'a':
                System.out.println('a');
                break;
            case 'b':
                System.out.println('b');
            default:
                System.out.println('c');
        }


    }

}
