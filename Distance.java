package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Point X=new Point();
        Point Y=new Point();
        X.setPoint1();
        X.setPoint2();
        Y.setPoint1();
        Y.setPoint2();
        double distance=Math.sqrt(Math.pow((X.getPoint2()-X.getPoint1()),2)+Math.pow((Y.getPoint2()-Y.getPoint1()),2));
        System.out.println(distance);
    }
}
 class Point{
    private int point1;
    private int point2;

    public Point(){
    }

    public void setPoint1(){
        Scanner show=new Scanner(System.in);
        point1=show.nextInt();

    }
    public int getPoint1(){
        return point1;
    }
    public void setPoint2(){
        Scanner show=new Scanner(System.in);
        point2=show.nextInt();
    }
    public int getPoint2(){
        return point2;
    }
}
