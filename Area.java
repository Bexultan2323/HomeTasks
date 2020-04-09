package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner circle=new Scanner(System.in);
   int r;
   float s;
        float d;
        float pi=3.14f;
   r=circle.nextInt();
   d=r*pi;
   s=2*pi*r;
   System.out.println(d);
        System.out.println(s);
    }
}
