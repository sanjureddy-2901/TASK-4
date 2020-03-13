package com.epam_task_4;
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Principal");
        double p=scan.nextDouble();
        System.out.println("Enter time");
        double t=scan.nextDouble();
        System.out.println("Enter rate_of_interest");
        double r=scan.nextDouble();
        System.out.println("Enter construction details");
        System.out.println("Is automated ?");
        boolean a=scan.nextBoolean();
        System.out.println("Enter material standard");
        String m=scan.next();
        System.out.println("Enter area ");
        double area=scan.nextDouble();

        simple_interest s =new simple_interest(p,t,r);
        double SI=s.cal();
        System.out.println("Simple Interest : "+SI);

        compound_interest c =new compound_interest(p,t,r);
        double CI=c.calc();
        System.out.println("Compound Interest : "+CI);


        Construction con =new Construction(a,m,area);
        double cost=con.construct();
        System.out.println("Total Cost for construction : "+cost);


    }
}
