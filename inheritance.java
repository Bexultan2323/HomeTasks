package com.company;

public class Main {

    public static void main(String[] args) {
        /*Multilevel*/
	Student p=new Student();
	System.out.println(p.getScholarship()+" "+p.MonthSalary);
	ExcellentStudent s=new ExcellentStudent();
	System.out.println(s.getHighScholarship()+" "+p.MonthSalary);

	/* Hierarchical*/
	ExcellentStudent2 k= new ExcellentStudent2();
	BadStudent c=new BadStudent();
	k.setFname("Bex");
	c.setFname("Zhex");
	System.out.println(k.getFname());
	System.out.println(c.getFname());
    }
}
 class Employee {
    public String Fname="AAA";
    public String Lname="BBB";
    public double MonthSalary=1000000;

    public Employee(){}
    public Employee(String employee_fname,String employee_lname,double employee_monthSalary){
        Fname=employee_fname;
        Lname=employee_lname;
        MonthSalary=employee_monthSalary;
    }
    public String getFname() {
        return Fname;
    }
    public void setFname(String employee_fname){
        Fname=employee_fname;
    }

    public String getLname() {
        return Lname;
    }
    public void setLname(String employee_lname){
        Lname=employee_lname;
    }


    public double getMonthSalary() {
        return MonthSalary;
    }
    public void setMonthSalary(double employee_monthSalary) {
        if(MonthSalary>0) {
            MonthSalary = employee_monthSalary;
        }
    }
} 
/*Multilevel*/
 class Student extends Employee{
    double scholarship=12000;
    double getScholarship(){
        return  scholarship;
    }
}
 class ExcellentStudent extends Student {
    double highScholarship=200000;
    public ExcellentStudent() {
    }
    double getHighScholarship() {
        return highScholarship;
    }
}

/* Hierarchical*/
class ExcellentStudent2 extends Employee{
    double highScholarship=300000;
    public ExcellentStudent2() {
    }
    double getHighScholarship2() {
        return highScholarship;
    }
}
class BadStudent extends Employee{
    double lowScholarship=100000;

    public double getLowScholarship() {
        return lowScholarship;
    }
}

