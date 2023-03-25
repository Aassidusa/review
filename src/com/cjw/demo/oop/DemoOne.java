package com.cjw.demo.oop;

public class DemoOne implements InterFaceOne,InterFaceTwo {


    private transient int a ;
    public static void main(String[] args) {

        int a = 0;
//        changeNum(a);
//        System.out.println(a);

        System.out.println((byte)10==(byte)5+5);

    }

     static  void changeNum(int a){
        a = 10;
    }


    @Override
    public void testA() {

    }
}
