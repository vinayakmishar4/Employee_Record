package Record;

import java.util.*;

public class Empolyee
{
	// employee name
   static  void Employee_name(String name)
    {
    	ArrayList<String> E_name=new ArrayList<String>(); 
    	E_name.add(name);
    	System.out.println(E_name);
    }
    // Employee Salary
    static void Employee_Salary(int Salary)
    {
    	ArrayList<Integer> E_Salary=new ArrayList<Integer>();
    	E_Salary.add(Salary);
    	System.out.println(E_Salary);
    }
	public static void main(String[] args) 
	{
		String Answer;
		String Answer2;
		System.out.println("<---Employee--->");
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<100;i++)
        {
          System.out.println("Do You want to add  Employee Details (Y/N)");
          Answer=sc.next();
          if(Answer.equals("Y"))
          {
        	  System.out.println("Employee No. " + i);
        	  System.out.println("Enter Employee name");
        	  String name=sc.next();
        	  System.out.println("Enter Employee Salary");
        	  int Salary=sc.nextInt();
        	  System.out.println("Employee names");
              Employee_name(name);
              System.out.println("Employee Salary");
              Employee_Salary(Salary);      
          }
          else
          {
        	  System.out.println("Exit");
        	  break;
          }
        }
	}

}
