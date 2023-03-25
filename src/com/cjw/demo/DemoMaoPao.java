package com.cjw.demo;

import java.util.Arrays;

public class DemoMaoPao {

    public static void main(String[] args) {

        int[] arr = {11,1,23,2,3,7,44,45};
        sort(arr);

    }


    public static void sort(int[] arr){


        int m = 0;

        for (int i = 0; i < arr.length-1; i++) {
            int temp = 0;
            m++;
            boolean flag = false;
            for(int j=0 ; j < arr.length-1-i;j++){
                m++;
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }

            if(!flag){
                break;
            }
        }

        System.out.println(m);
        System.out.println(Arrays.toString(arr));
    }

}
