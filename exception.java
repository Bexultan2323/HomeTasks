package com.company;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
       Scanner show=new Scanner(System.in);
       int n=show.nextInt();
       int array[]=new int[n];
       int b=20;
       int a=0;
       for(int i=0;i<n;i++){
           array[i]=show.nextInt();

           try {
               a=b/array[i];
               System.out.print(a+" ");
           }
           catch (ArithmeticException ex){
               System.out.print("Impossible divide by zero ");
           }
       }
       System.out.println(" ");
       System.out.println("Message after catch");

    }

}
