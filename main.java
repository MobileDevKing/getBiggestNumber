package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 	int[] arr=new int[10];
        Random r=new Random();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=r.nextInt(100);
            System.out.print(arr[i]+"   ");
        }
        max(arr);
    }

    public static void max(int[] a)
    {
	    int max=a[0];
	    for(int i=0;i<a.length;i++)
	     {
	        if(max<a[i])
	        {
	            max=a[i];
	        }
	     }
        System.out.println("max="+max);
    }
}
