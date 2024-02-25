package com.stl.singleton_class;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Employee employee = Employee.getEmployee("mayur", 7020854231l, "pune");
    	System.out.println(" employee - >" + employee);
    	Employee employee2 = Employee.getEmployee("Rohit", 9922211843l, "jalgaon");
    	System.out.println("employee ---> "+employee2);
    }
}
