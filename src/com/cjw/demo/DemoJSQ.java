package com.cjw.demo;

import java.util.Scanner;

public class DemoJSQ {


    public static void main(String[] args) {
        jiSuan();
    }

    public static void jiSuan(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int a1 = 0;
        int a2 =0;

        String fuHao = "+";
        System.out.println("请输入数字");
        if(scanner.hasNextInt()){
            a1 = scanner.nextInt();
            System.out.println("请输入加减乘除符号:");
        }

        if(scanner.hasNext()){
          fuHao = scanner.next();
        }

        System.out.println("请输入数字");

        if(scanner.hasNextInt()){
            a2 = scanner.nextInt();
        }

        switch (fuHao){
            case "-":
                System.out.println(a1+"-"+a2+"="+(a1-a2));
                jiSuan();
                break;
            case "*":
                System.out.println(a1+"*"+a2+"="+(a1*a2));
                jiSuan();
                break;
            case "/":
                System.out.println(a1+"/"+a2+"="+(a1/a2));
                jiSuan();
                break;
            case "+":
                System.out.println(a1+"+"+a2+"="+(a1+a2));
                jiSuan();
                break;
            default:
                System.out.println("非法计算符号 重新输入");
                jiSuan();
        }




    }


}
