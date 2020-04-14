package com.company;

public class Main {

    public static void main(String[] args) {
        Print show=new Print();
        System.out.println(show.overall_income());

    }

}
 abstract class Employee {
    public String Fname="AAA";
    public String Lname="BBB";
    public double MonthSalary=1000000;
    abstract public double overall_income();//method overall

    public Employee(){}

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }
}

class Print{
    public double overall=1000000;
    public double overall_income(){
        return overall;
    }

}

