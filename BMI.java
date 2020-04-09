package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  Scanner calculate=new Scanner(System.in);
  System.out.println("Your weight:");
  float w=calculate.nextInt();
  System.out.println("Your height(in meters):");
  float h=calculate.nextInt();
  float bmi=(w/(h*h));
  System.out.println("Your body mass index:"+bmi);
    }
}
