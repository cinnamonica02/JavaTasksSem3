package com.maria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        StaffMaria s= new StaffMaria();
        s.initialize1();
        s.Maria1_61677();

        double salary= s.salaryToPay(180,40);
        System.out.println("The amount salaries the employee receipt is "+ salary);
        double salaryForOverTime=s.salaryForOverTime(10,40);
        System.out.println("The amount of the overtime salary is "+ salaryForOverTime);
        int bonus= MariaSalary.bonusMaria(6);
        s.initialize();
        s.Maria61677();
    }
}
interface MariaSalary {
    double salaryToPay(double hours, double rate);

    default double salaryForOverTime(double overtime, double rate) {
        return 1;
    }

    static int bonusMaria(int yearsOfExperience) {
        if (yearsOfExperience > 5) {
            return 100;
        } else {
            return 0;
        }

    }
}

class StaffMaria extends PersonMaria implements MariaSalary {
    String Maria61677education;
    String Maria61677position;

    public void initialize1() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education");
        Maria61677education = br.readLine();
        System.out.println("Enter your position");
        Maria61677position = br.readLine();
    }

    public void Maria61677()
    {

        Maria1_61677();
        System.out.println("Education :" + Maria61677education);
        System.out.println("Position :" + Maria61677position);
    }
    @Override
    public double salaryToPay(double hours, double rate){return  hours*rate;}
    @Override
    public double salaryForOverTime(double overtime, double rate){return  overtime*(1.5*rate);};
}

